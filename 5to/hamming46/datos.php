<?php 
$n1 = $_POST['n1']; 
$n2 = $_POST['n2']; 
include_once 'funcion.php' 
echo "La distancia de Hamming es: " . hamming($n1, $n2); 
?>