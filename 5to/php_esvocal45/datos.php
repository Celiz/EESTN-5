<?php
include_once("funcion.php");

$l = $_POST['letra'];

$esV = esVocal($l);

if($esV) {
    echo "La letra $l es una vocal";
} else {
    echo "La letra $l no es una vocal";
}


?>