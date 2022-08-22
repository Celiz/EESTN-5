<!doctype html>
<html>
<head>
  <title>Listado de articulos</title>
  <style>
  .tablalistado {
    border-collapse: collapse;
    box-shadow: 0px 0px 8px #000;
    margin:20px;
  }
  .tablalistado th{  
    border: 1px solid #000;
    padding: 5px;
    background-color:#ffd040;	  
  }  
  .tablalistado td{  
    border: 1px solid #000;
    padding: 5px;
    background-color:#ffdd73;	  
  }
  </style>
</head>  
<body>
  
  <?php
	$mysql=new mysqli("localhost","root","","base1poo");
	if ($mysql->connect_error)
	  die("Problemas con la conexion a la base de datos");
  
    $registros=$mysql->query("select     ar.codigo as codigoart,
                                         ar.descripcion as descripcionart,
                                         ar.precio as precioart,
                                         ru.descripcion as descripcionrub 
                                      from articulos as ar
                                      inner join rubros as ru on ru.codigo=ar.codigorubro") or
      die($mysql->error);
	 
    echo '<table class="tablalistado">';
    echo '<tr><th>Codigo</th><th>Descripcion</th><th>Precio</th><th>Rubro</th><th>Borrar</th><th>Modificar</th></tr>';
    while ($reg=$registros->fetch_array())
    {
      echo '<tr>';
      echo '<td>';
      echo $reg['codigoart'];
      echo '</td>';	  
      echo '<td>';
      echo $reg['descripcionart'];	  
      echo '</td>';	  
      echo '<td>';
      echo $reg['precioart'];	  
      echo '</td>';	  
      echo '<td>';
      echo $reg['descripcionrub'];	  
      echo '</td>';
      echo '<td>';
      echo '<a href="delete.php?codigo='.$reg['codigoart'].'">Borra?</a>';
      echo '</td>';
      echo '<td>';
      echo '<a href="mod1.php?codigo='.$reg['codigoart'].'">Modifica?</a>';
      echo '</td>';      
      echo '</tr>';	  
    }	
    echo '<tr><td colspan="6">';
    echo '<a href="add1.php">Agrega un nuevo articulo?</a>';
    echo '</td></tr>';
    echo '<table>';	
	
    $mysql->close();

  ?>  
</body>
</html>