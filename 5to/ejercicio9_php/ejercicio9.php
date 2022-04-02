<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TP9</title>
</head>
<body>
    <h1>TP9</h1>
    <?php 
			$qt = 500;
			$txt = ["———————————————————————  ", "(Multiplo de 4)", "(Multiplo de 9)"];
			for($i = 1; $i <= 500; $i++){
				echo "<p> $i&nbsp;";
				if($i%4 == 0) echo $txt[1];
				if($i%9 == 0) echo $txt[2];
				if($i%5 == 0) echo "<br> $txt[0]";
				echo "</p>";
			}
		?>
</body>
</html>