<!doctype html>
<html lang="es">
<head>
<link rel="stylesheet" type="text/css" href="styles/estilo.css">
    <meta charset="UTF-8">
    <title>Columnas con colores</title>
</head>
<body>
<table>
        <tr>
            <th>Numero</th>
            <th>Primo</th>
        </tr>
        <?php
        include("funcion.php");
            $num = 1;
            //mientras el num sea menor o igual a 10000 hacer:
            while ($num <= 10000) {
                if (isPrime($num)) {
                    echo "<tr><td>$num</td><td>Si</td></tr>";
                } else {
                    echo "<tr><td>$num</td><td>No</td></tr>";
                }
                $num++;
            }
?>
</body>
</html>

