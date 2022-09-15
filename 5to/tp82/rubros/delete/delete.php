<!doctype html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Borrado de rubros</title>
</head>

<body>
  <form method="post" action="pagina2.php">
    Ingrese el código de rubro a borrar:
    <input type="text" name="codigo" size="10" required>
    <br>
    <input type="submit" value="Consultar">
  </form>
</body>

</html>
La página que efectúa el borrado del registro es:

<!doctype html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>borrado de rubro</title>
</head>

<body>

  <?php
  $mysql = new mysqli("localhost", "root", "", "base1poo");
  if ($mysql->connect_error)
    die("Problemas con la conexión a la base de datos");

  $registro = $mysql->query("select descripcion from rubros where codigo=$_REQUEST[codigo]") or
    die($mysql->error);

  if ($reg = $registro->fetch_array()) {
    $mysql->query("delete from rubros where codigo=$_REQUEST[codigo]") or
      die($mysql->error);
    echo 'La descripción del rubro que se eliminó es:' . $reg['descripcion'];
  } else
    echo 'No existe un rubro con dicho código';

  $mysql->close();
  ?>
</body>

</html>