<?php
function semanaCovid($fecha){
$fecha = $_POST['fecha'];
$hoy = date("Y-m-d");//fecha de hoy
$fechaActual = date_create($hoy);
$startCovid = date_create($fecha);//fecha de inicio de covid

$diff = date_diff($startCovid, $fechaActual);// resta la fecha de inicio de covid con la fecha de hoy

$convertir = $diff -> format('%a');// convierte el resultado en dias
$semanas = $convertir / 7;//conviertes los dias en semanas

return round($semanas) . " semanas ";
  
}
?>