<?php 
  require("conexion.php");

  $conexion = retornarConexion();
  
  $datos = mysqli_query($conexion, "select pro.codigo as codigo,
                                            descripcion,
                                            round(deta.precio,2) as precio,
                                            cantidad,
                                            round(deta.precio*cantidad,2) as preciototal,
                                            deta.codigo as coddetalle
                                        from detallefactura as deta
                                        join productos as pro on pro.codigo=deta.codigoproducto
                                        where codigofactura=$_GET[codigofactura]") or die(mysqli_error($conexion));

  $resultado = mysqli_fetch_all($datos, MYSQLI_ASSOC);
  $pago=0;
  foreach ($resultado as $fila) {
      echo "<tr>";
      echo "<td>$fila[codigo]</td>";
      echo "<td>$fila[descripcion]</td>";      
      echo "<td class=\"text-right\">$fila[cantidad]</td>";            
      echo "<td class=\"text-right\">$fila[precio]</td>";
      echo "<td class=\"text-right\">$fila[preciototal]</td>";
      echo '<td class="text-right"><a class="btn btn-primary" onclick="borrarItem('.$fila['coddetalle'].')" role="button" href="#" id="'.$fila['coddetalle'].'">Borra?</a></td>';
      echo "</tr>";      
      $pago=$pago+$fila['preciototal'];
  }
  echo "<tr>";
  echo "<td></td>";
  echo "<td></td>";      
  echo "<td></td>";            
  echo "<td class=\"text-right\"><strong>Importe total</strong></td>";              
  echo "<td class=\"text-right\"><strong>".number_format(round($pago,2),2,'.','')."</strong></td>";
  echo "<td></td>";            
  echo "</tr>";

?>
