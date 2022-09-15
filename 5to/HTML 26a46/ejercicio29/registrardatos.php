<?php

$nombre = $_POST['nombre'];
$mail = $_POST['mail'];
$dni = $_POST['dni'];
$comentario = array( $_POST["comentario"]);

foreach($comentario as $com){

echo "$nombre <br/> $mail <br/> $dni <br/> $com";
}

?>