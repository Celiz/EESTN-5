<!doctype html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Borrado de un artículo</title>
</head>

<body>

  <?php
  $mysql = new mysqli("localhost", "root", "", "base1poo");
  if ($mysql->connect_error)
    die("Problemas con la conexión a la base de datos");

  $registro = $mysql->query("select descripcion from articulos where codigo=$_REQUEST[codigo]") or
    die($mysql->error);

  if ($reg = $registro->fetch_array()) {
    $mysql->query("delete from articulos where codigo=$_REQUEST[codigo]") or
      die($mysql->error);
    echo 'La descripción del artículo que se eliminó es:' . $reg['descripcion'];
  } else
    echo 'No existe un artículo con dicho código';

  $mysql->close();

  ?>
</body>

</html>