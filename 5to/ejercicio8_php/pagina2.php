<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
     $a = $_POST["num"];
        if($a> 50) $a = 50;
        for($b = 1; $b <= $a; $b++){
        for($c = 1; $c <= $b; $c++){
        echo $c;}
         echo "<br>";}
?>
 
    
</body>
</html>