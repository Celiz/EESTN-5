<?php
include_once ('funcion.php');
$p1 = $_POST['p1'];
$desordenar = desordenar($p1);
echo $desordenar;

?>