<?php
      $n = $_POST["n1"];
      $f = $n;
        for($i = $n; $i > 1; $i--){
            $f *= $i - 1;
        }
     echo "Resultado $n! = $f";
?>