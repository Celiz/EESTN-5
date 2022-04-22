<?php
function calcularNewYear($fecha){
    $fecha = $_POST['fecha'];
    $ny = date_create(date("Y") . "-12-31");
    $fechaActual = date_create($fecha);
    $newYear = date_diff($fechaActual, $ny);

    return "Faltan " . $newYear->format("%a") . " dias para el nuevo año";  
}
?>