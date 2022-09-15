<?php
include_once ("funcion.php");
$n = $_POST ["x"];
$res = MultiploDe3($n);
$fres = "No es multiplo";

echo "Numero: $n <br>";
if($res==true)$fres="Es multiplo";
echo "Resultado: $fres" 
?>