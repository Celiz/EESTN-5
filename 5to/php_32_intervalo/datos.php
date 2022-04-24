<?php

include_once("funcion.php");
$in = [$_POST["a"] , $_POST["b"]];

if(intervalo($in[0], $in[1])){
    echo "true</br>";
    range($in[0], $in[1]);{
        for($i = $in[0]; $i <= $in[1]; $i++){
            echo $i . "-";
        }
    }  
}
  
else{    
    echo "false</br>";
}
?> 