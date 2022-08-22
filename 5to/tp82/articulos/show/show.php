<!doctype html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Listado de artículos</title>
  <style>
    .tablalistado {
      border-collapse: collapse;
      box-shadow: 0px 0px 8px #000;
      margin: 20px;
    }

    .tablalistado th {
      border: 1px solid #000;
      padding: 5px;
      background-color: #ffd040;
    }

    .tablalistado td {
      border: 1px solid #000;
      padding: 5px;
      background-color: #ffdd73;
    }
  </style>
</head>

<body>

  <?php
  $mysql = new mysqli("localhost", "root", "", "base1poo");
  if ($mysql->connect_error)
    die("Problemas con la conexión a la base de datos");

  $registros = $mysql->query("select ar.codigo as codigoart,
                                     ar.descripcion as descripcionart,
                                     ar.precio as precio,
                                     ru.descripcion as descripcionrub 
                                  from articulos as ar
                                  inner join rubros as ru on ru.codigo=ar.codigorubro") or
    die($mysql->error);

  echo '<table class="tablalistado">';
  echo '<tr><th>Código</th><th>Descripción</th><th>Precio</th><th>Rubro</th></tr>';
  while ($reg = $registros->fetch_array()) {
    echo '<tr>';
    echo '<td>';
    echo $reg['codigoart'];
    echo '</td>';
    echo '<td>';
    echo $reg['descripcionart'];
    echo '</td>';
    echo '<td>';
    echo $reg['precio'];
    echo '</td>';
    echo '<td>';
    echo $reg['descripcionrub'];
    echo '</td>';
    echo '</tr>';
  }
  echo '<table>';

  $mysql->close();

  ?>
</body>

</html>