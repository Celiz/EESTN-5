<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TP11</title>
</head>
<body>
    <h1>TP11 - Resultado</h1>
    <?php
         $nums= [$_POST["n1"], $_POST["n2"]];
         $orden = rsort($nums);
         echo "Resultado $nums[0], $nums[1]";
    ?>
</body>
</html>