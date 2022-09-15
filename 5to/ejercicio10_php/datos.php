<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>T10</title>
</head>
<body>
    <?php

	$n1 = $_POST['n1'];
	$n2 = $_POST['n2'];
	$n3 = $_POST['n3'];

		if($n1>$n2&&$n1>$n3){
				echo "El numero mayor es: $n1";
			}
			
		if($n2>$n1&&$n2>$n3){
				echo "El numero mayor es: $n2";
			}
		if($n3>$n1&&$n3>$n2){
				echo "El numero mayor es: $n3";
			}
			

		?>
</body>
</html>