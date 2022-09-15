<?php
function calcularFecha($fecha){
    $fecha = $_POST['fecha'];
    $fechaActual = strtotime($fecha);
    $despues30 = strtotime("+30 days", $fechaActual);
    $despues60 = strtotime("+60 days", $fechaActual);
    $despues90 = strtotime("+90 days", $fechaActual);
    $despues120 = strtotime("+120 days", $fechaActual);


    return  "30 dias despues: " . date("Y-m-d", $despues30 ) . "<br>" .
            "60 dias despues: " . date("Y-m-d", $despues60 ) . "<br>" .
            "90 dias despues: " . date("Y-m-d", $despues90 ) . "<br>" .
            "120 dias despues: " . date("Y-m-d", $despues120 );
}
?>