<!doctype html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Modificación de rubro.</title>
</head>

<body>

  <?php
  $mysql = new mysqli("localhost", "root", "", "base1poo");
  if ($mysql->connect_error)
    die("Problemas con la conexión a la base de datos");

  $registro = $mysql->query("select descripcion from rubros where codigo=$_REQUEST[codigo]") or
    die($mysql->error);

  if ($reg = $registro->fetch_array()) {
    ?>
    <form method="post" action="pagina3.php">
      Descripción del rubro:
      <input type="text" name="descripcion" size="50" value="<?php echo $reg['descripcion']; ?>">
      <input type="hidden" name="codigo" value="<?php echo $_REQUEST['codigo']; ?>">
      <br>
      <input type="submit" value="Confirmar">
    </form>
  <?php
  } else
    echo 'No existe un rubro con dicho código';

  $mysql->close();

  ?>
</body>

</html>