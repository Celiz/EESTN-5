<?php
include_once("funcion.php");

$num = $_POST['num'];

$factorial = factorial($num);

echo "Numero ingresado:  $num </br> Factorial:   $factorial ";
    
?>