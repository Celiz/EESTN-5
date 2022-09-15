<?php
$d = [ $_POST["nombre"], $_POST["mail"], $_POST["pais"], $_POST["valoracion"], $_POST["comentarios"] ];
$p = ["Argentina","España","México","Guatemala","Honduras","El Salvador","Venezuela","Colombia","Cuba","Bolivia","Perú","Ecuador","Paraguay","Uruguay","Chile"];
$pos = $p[$d[2]-1];
echo "Nombre: $d[0] Correo: $d[1] <br> Pais: $pos <br> Valoración: $d[3] <br> Comentarios: $d[4]"
?>