<!doctype html>
<html>
<head>
  <title>Modificacion de articulo.</title>
</head>  
<body>
  
  <?php
	$mysql=new mysqli("localhost","root","","base1poo");
	if ($mysql->connect_error)
	  die("Problemas con la conexion a la base de datos");
  
    $registro=$mysql->query("select descripcion,precio,codigorubro from articulos where codigo=$_REQUEST[codigo]") or
      die($mysql->error);
	 
    if ($reg=$registro->fetch_array())
    {
  ?>
    <form method="post" action="mod2.php">
      Descripcion del articulo:
      <input type="text" name="descripcion" size="50" value="<?php echo $reg['descripcion']; ?>">
      <br>
      Precio
      <input type="text" name="precio" size="10" value="<?php echo $reg['precio']; ?>">      
      <br>      
      Rubro:
      <select name="codigorubro">
      <?php
      $registros2=$mysql->query("select codigo,descripcion from rubros") or
        die($mysql->error);
	  while ($reg2=$registros2->fetch_array())
      {
         if ($reg2['codigo']==$reg['codigorubro'])
           echo "<option value=\"".$reg2['codigo']."\" selected>".$reg2['descripcion']."</option>";         
         else
	       echo "<option value=\"".$reg2['codigo']."\">".$reg2['descripcion']."</option>";
      }		
      ?>  
      </select>      
      
      <input type="hidden" name="codigo" value="<?php echo $_REQUEST['codigo']; ?>">     
      <br> 
      <input type="submit" value="Confirmar">
    </form>
  <?php
    }      
    else
	  echo 'No existe un articulo con dicho codigo';
	
    $mysql->close();

  ?>  
</body>
</html>