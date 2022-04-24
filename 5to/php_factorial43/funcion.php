<?php
function factorial($n){
    $factorial = 1;
    
    for ($i = 1; $i <= $n; $i++) {
        $factorial = $factorial * $i;
    }
    return $factorial;
}

?>