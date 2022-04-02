<html>

<head>
  <title>Problema</title>
</head>

<body>

  <?php

  $cant = 0;
  if (isset($_REQUEST['check1'])) {
    $cant++;
  }
  if (isset($_REQUEST['check2'])) {
    $cant++;
  }
  if (isset($_REQUEST['check3'])) {
    $cant++;
  }
  if (isset($_REQUEST['check4'])) {
    $cant++;
  }
  echo $_REQUEST['nombre'];
  echo " practica $cant deportes."
  ?>

</body>

</html>