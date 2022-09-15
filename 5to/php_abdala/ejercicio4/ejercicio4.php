<html>

<head>
  <title>Problema</title>
</head>

<body>
  <?php
  $num = rand(1, 100);
  echo "$num <br>";

  if ($num <= 50) {
    echo "El número es menor o igual a 50.";
  } else {
    echo "El número es mayor a 50.";
  }
  ?>

</body>

</html>