<?php
header('Content-Type: application/json');
require("../conexion.php");

$conexion = retornarConexion();

switch ($_GET['accion']) {
    case 'listar':
        $respuesta = mysqli_query($conexion, "select codigo, descripcion from categorias");
        $resultado = mysqli_fetch_all($respuesta, MYSQLI_ASSOC);
        echo json_encode($resultado);
        break;
    case 'agregar':
        $respuesta = mysqli_query($conexion, "insert into categorias(descripcion) values ('$_POST[descripcion]')");
        echo json_encode($respuesta);
        break;
    case 'recuperar':
        $respuesta = mysqli_query($conexion, "select codigo, descripcion from categorias where codigo=$_POST[codigo]");
        $resultado = mysqli_fetch_all($respuesta, MYSQLI_ASSOC);
        echo json_encode($resultado);
        break;
    case 'borrar':
        $respuesta = mysqli_query($conexion, "delete from categorias where codigo=".$_POST['codigo']);
        $respuesta = mysqli_query($conexion, "delete from productos where codigocategoria=".$_POST['codigo']);
        echo json_encode($respuesta);
        break;
    case 'modificar':
        $respuesta = mysqli_query($conexion, "update categorias set descripcion='$_POST[descripcion]' where codigo=$_POST[codigo]");
        echo json_encode($respuesta);
        break;        
}

?>