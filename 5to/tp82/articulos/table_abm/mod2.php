<?php
	$mysql=new mysqli("localhost","root","","base1poo");
	if ($mysql->connect_error)
	  die("Problemas con la conexion a la base de datos");
  
    $mysql->query("update articulos set 
                           descripcion='$_REQUEST[descripcion]',
                           precio=$_REQUEST[precio],
                           codigorubro=$_REQUEST[codigorubro]
              where codigo=$_REQUEST[codigo]") or
      die($mysql->error());
	 
    $mysql->close();

    header('Location:tabla.php');
  ?>  
