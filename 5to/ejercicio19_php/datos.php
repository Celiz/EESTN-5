<?php
$n1 = $_POST["n1"];
$res = 0;
for($i = 0; $i < strlen($n1); $i++){
    $res += $n1[$i];
}
echo $res;
?>
