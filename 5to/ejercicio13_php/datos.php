<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TP13</title>
</head>
<body>
    <?php 
			$n1 = $_POST["n1"];
            echo "TABLA DEL $n1";
			echo "<table><tr><th>Num</th><th>Res</th></tr>";
			for($i = 1; $i <= 10; $i++){	
                echo "<tr><td>$i x $n1 =</td><td>" . $n1 * $i . "</td></tr>";
			}
			echo "</table>";
    ?>
</body>
</html>