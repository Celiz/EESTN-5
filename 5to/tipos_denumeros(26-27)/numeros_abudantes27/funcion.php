<?php
function abudante($num){
    $res = false;
    //si num es menor que 0 no es abudante
    if($num<=0){
        $res = false;
    }
    else{
        $suma = 0;
        //suma de los divisores de num
        for($i=1;$i<$num;$i++){
            //si num es divisible entre i
            if($num%$i==0){
                $suma += $i;
            }
        }
        //si la suma es mayor que el numero es abudante
        if($suma>$num){
            $res = true;
        }
        else{
            $res = false;
        }
    }
    return $res;
}
?>