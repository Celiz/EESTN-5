<!doctype html>
<html lang="es">
<head>
<link rel="stylesheet" type="text/css" href="styles/estilo.css">
    <meta charset="UTF-8">
    <title>Abudantes</title>
</head>
<body>
<table>
        <tr>
            <th>Numero</th>
            <th>Perfecto</th>
        </tr>
<?php
    include("funcion.php");
        $num = 1;
    while($num<=10000){
        if(isPerfect($num)){
            echo "<tr><td>$num</td><td>Si</td></tr>";
        }
    else{
        echo "<tr><td>$num</td><td>No</td></tr>";
    }
    $num++;
}
?>
</table>
</body>
</html>
