<?php
function isPerfect($num){
    $res=false;
    $contador = 0;
    for ($i=1; $i < $num; $i++) { 
        if ($num % $i == 0) {
            $contador+=$i;
        }
    }
    if ($contador == $i) {
        $res = true;
    } else {
        $res = false;
    }

return $res;
}
?>