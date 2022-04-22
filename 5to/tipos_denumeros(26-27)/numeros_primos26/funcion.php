<?php
 function isPrime($num) {
    $res = true;
    //si num es 1, 0 o 4 no es primo
    if ($num == 0 || $num == 1 || $num == 4) $res = false;
    //ecuacion numeros primos GENERAL
    for ($x = 2; $x < $num / 2; $x++) {
      if ($num % $x == 0) $res = false;
    }
    return $res;   
}                
?>


