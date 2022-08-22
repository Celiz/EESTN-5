<!doctype html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Consulta de artículos</title>
</head>

<body>

  <?php
  $mysql = new mysqli("localhost", "root", "", "base1poo");
  if ($mysql->connect_error)
    die("Problemas con la conexión a la base de datos");

  $registros = $mysql->query("select ar.descripcion as descripcionart,
                                     ar.precio as precioart,
                                     ru.descripcion as descripcionrub 
                                  from articulos as ar
                                  inner join rubros as ru on ru.codigo=ar.codigorubro
                                  where ar.codigo=$_REQUEST[codigo]") or
    die($mysql->error);

  if ($reg = $registros->fetch_array()) {
    echo 'Descripción:' . $reg['descripcionart'] . '<br>';
    echo 'Precio:' . $reg['precioart'] . '<br>';
    echo 'Rubro:' . $reg['descripcionrub'] . '<br>';
  } else
    echo 'No existe un artículo con dicho código';

  $mysql->close();

  ?>
</body>

</html>