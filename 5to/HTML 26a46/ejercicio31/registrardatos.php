<?php

$nombre = $_POST['nombre'];
$so = array( $_POST["so"]);

foreach($so as $SO){

echo "$nombre <br/> $SO";
}

?>
