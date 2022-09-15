<?php
include_once("funcion.php");
$p = $_POST['p'];

$invertir = invertir($p);

echo $invertir;
?>