<html>

<head>
  <title>Problema</title>
</head>

<body>
<?php 
			$txts = ["———————————————————— ", "(Multiplo de 4)", "(Multiplo de 9)"];
			for($i = 1; $i <= 500; $i++){
				echo "<p> $i&nbsp;";
				if($i%4 == 0) echo $txts[1];
				if($i%9 == 0) echo $txts[2];
				if($i%5 == 0) echo "<br> $txts[0]";
				echo "</p>";
			}
		?>

</body>

</html>