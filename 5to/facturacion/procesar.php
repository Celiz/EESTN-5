<?php


header('Content-Type: application/json');
require("conexion.php");

$conexion = retornarConexion();


switch ($_GET['accion']) {
    case 'agregar':
        //Recuperamos el precio del producto
        $respuesta = mysqli_query($conexion, "select precio from productos where codigo=".$_POST['codigoproducto']);
        $reg=mysqli_fetch_array($respuesta);

        $respuesta = mysqli_query($conexion, "insert into detallefactura(codigofactura,codigoproducto,cantidad,precio) values ($_GET[codigofactura],$_POST[codigoproducto],$_POST[cantidad],$reg[precio])");
        echo json_encode($respuesta);
        break;

    case 'confirmarfactura':
        $respuesta = mysqli_query($conexion, "update facturas set
                                                fecha='$_POST[fecha]',
                                                codigocliente=$_POST[codigocliente]
                                              where codigo=$_GET[codigofactura]");
        echo json_encode($respuesta);        
        break;
    case 'confirmardescartarfactura':
        $respuesta = mysqli_query($conexion, "delete from facturas where codigo=$_GET[codigofactura]");
        $respuesta = mysqli_query($conexion, "delete from detallefactura where codigofactura=$_GET[codigofactura]");
        echo json_encode($respuesta);        

}

?>
