<!doctype html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Borrado de un articulo</title>
</head>

<body>

  <?php
  $mysql = new mysqli("localhost", "root", "", "base1poo");
  if ($mysql->connect_error)
    die("Problemas con la conexión a la base de datos");

  $mysql->query("delete from articulos where codigo=$_REQUEST[codigo]") or
    die($mysql->error);

  if ($mysql->affected_rows == 1)
    echo 'Se elimino el articulo';
  else
    echo 'No existe un articulo con dicho código';

  $mysql->close();
  ?>

</body>

</html>