<?php
include_once ("funcion.php");
$p = $_POST ["pesoT"];

echo ("Peso en la Tierra: "  . $p ."<br>");

$pl = CalcularPesoLuna($p);
echo ("Peso en la Luna: "  . $pl . "<br>");

?>