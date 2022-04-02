<?php
include_once ("funcion.php");
$n1 = $_POST ["n1"];
$n2 = $_POST ["n2"];
$may = mayor ($n1,$n2);

echo ("El mayor es "  . $may ."<br>");

$men = menor ($n1,$n2);
echo ("El menor es "  . $men . "<br>");

?>