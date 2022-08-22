<!doctype html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Alta de artículo</title>
</head>

<body>

  <?php
  $mysql = new mysqli("localhost", "root", "", "base1poo");
  if ($mysql->connect_error)
    die("Problemas con la conexión a la base de datos");

  $mysql->query("insert into articulos(descripcion,precio,codigorubro) 
        values ('$_REQUEST[descripcion]',$_REQUEST[precio],$_REQUEST[codigorubro])") or
    die($mysql_error);

  echo "Se cargó el artículo y se se generó el código de artículo:";
  echo $mysql->insert_id;

  $mysql->close();

  ?>

</body>

</html>