<?php 
function hamming($c1, $c2){ 
    $dist = 0; 
    for($i=0; $i < strlen($c1); $i++){ 
        if($c1[$i] != $c2[$i]){ 
            $dist++; 
        } 
    }    
    return $dist;  
} 
?>