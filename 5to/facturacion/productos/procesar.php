<?php
header('Content-Type: application/json');
require("../conexion.php");

$conexion = retornarConexion();

switch ($_GET['accion']) {
    case 'listar':
        $respuesta = mysqli_query($conexion, "select 
                                                 pro.codigo as codigo,
                                                 pro.descripcion descripcion,
                                                 cat.descripcion descripcioncategoria,
                                                 precio
                                              from productos as pro
                                              join categorias as cat on cat.codigo=pro.codigocategoria");
        $resultado = mysqli_fetch_all($respuesta, MYSQLI_ASSOC);
        echo json_encode($resultado);
        break;
    case 'agregar':
        $respuesta = mysqli_query($conexion, "insert into productos(descripcion,precio,codigocategoria) values ('$_POST[descripcion]',$_POST[precio],$_POST[codigocategoria])");
        echo json_encode($respuesta);
        break;
    case 'recuperar':
        $respuesta = mysqli_query($conexion, "select codigo, descripcion, precio, codigocategoria from productos where codigo=$_POST[codigo]");
        $resultado = mysqli_fetch_all($respuesta, MYSQLI_ASSOC);
        echo json_encode($resultado);
        break;
    case 'borrar':
        $respuesta = mysqli_query($conexion, "delete from productos where codigo=" . $_POST['codigo']);
        echo json_encode($respuesta);
        break;
    case 'modificar':
        $respuesta = mysqli_query($conexion, "update productos set descripcion='$_POST[descripcion]', precio=$_REQUEST[precio], codigocategoria=$_POST[codigocategoria] where codigo=$_POST[codigo]");
        echo json_encode($respuesta);
        break;
    case 'listarcategorias':
        $respuesta = mysqli_query($conexion, "select codigo, descripcion from categorias");
        $resultado = mysqli_fetch_all($respuesta, MYSQLI_ASSOC);
        echo json_encode($resultado);
        break;
}
?>