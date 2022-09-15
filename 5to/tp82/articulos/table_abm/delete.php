<?php
	$mysql=new mysqli("localhost","root","","base1poo");
	if ($mysql->connect_error)
	  die("Problemas con la conexi�n a la base de datos");
  
    $mysql->query("delete from articulos where codigo=$_REQUEST[codigo]") or
        die($mysql->error);    
	
    $mysql->close();
    
    header('Location:tabla.php');
  ?>  
