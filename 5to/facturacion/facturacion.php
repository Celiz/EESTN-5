<!doctype html>
<html>

<head>
  <title>Facturación</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</head>

<body>

  <?php
  require("conexion.php");
  $con = retornarConexion();
  $consulta = mysqli_query($con, "insert into facturas() values ()")
    or die(mysqli_error($con));
  $codigofactura = mysqli_insert_id($con);
  ?>


  <div class="container">
    <div class="row mt-4">
      <div class="col-md">

        <div class="form-group row">
          <label for="CodigoFactura" class="col-lg-3 col-form-label">Número de factura:</label>
          <div class="col-lg-3">
            <input type="text" disabled class="form-control" id="CodigoFactura" value="<?php echo $codigofactura; ?>">
          </div>
        </div>


        <div class="form-group row">
          <label for="Fecha" class="col-lg-3 col-form-label">Fecha de emisión:</label>
          <div class="col-lg-3">
            <input type="date" class="form-control" id="Fecha">
          </div>
        </div>

        <div class="form-group row">
          <label for="CodigoCliente" class="col-lg-3 col-form-label">Cliente:</label>
          <div class="col-lg-3">
            <select class="form-control" id="CodigoCliente">
              <?php
              $consulta = mysqli_query($con, "select codigo, nombre from clientes")
                or die(mysqli_error($con));

              $clientes = mysqli_fetch_all($consulta, MYSQLI_ASSOC);

              echo "<option value='0'>Seleccionar Cliente</option>";
              foreach ($clientes as $cli) {
                echo "<option value='" . $cli['codigo'] . "'>" . $cli['nombre'] . "</option>";
              }
              ?>
            </select>
          </div>
        </div>


      </div>
    </div>


    <div class="row mt-4">
      <div class="col-md">
        <table class="table table-striped">
          <thead>
            <tr>
              <th>Código de Artículo</th>
              <th>Descripción</th>
              <th class="text-right">Cantidad</th>
              <th class="text-right">Precio Unitario</th>
              <th class="text-right">Total</th>
              <th class="text-right"></th>
            </tr>
          </thead>
          <tbody id="DetalleFactura">

          </tbody>
        </table>
        <button type="button" id="btnAgregarProducto" class="btn btn-success">Agregar Producto</button>
        <button type="button" id="btnTerminarFactura" class="btn btn-success">Terminar Factura</button>
      </div>
    </div>

  </div>



  <!-- ModalProducto(Agregar) -->
  <div class="modal fade" id="ModalProducto" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">

          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">

          <div class="form-group">
            <label>Producto:</label>
            <select class="form-control" id="CodigoProducto">
              <?php
              $consulta = mysqli_query($con, "select codigo, descripcion, precio from productos")
                or die(mysqli_error($con));

              $productos = mysqli_fetch_all($consulta, MYSQLI_ASSOC);
              foreach ($productos as $pro) {
                echo "<option value='" . $pro['codigo'] . "'>" . $pro['descripcion'] . '  ($' . $pro['precio'] . ")</option>";
              }
              ?>
            </select>
          </div>

          <div class="form-row">
            <div class="form-group col-md-12">
              <label>Cantidad:</label>
              <input type="number" id="Cantidad" class="form-control" placeholder="" min="1">
            </div>
          </div>


        </div>
        <div class="modal-footer">
          <button type="button" id="btnConfirmarAgregarProducto" class="btn btn-success">Agregar a la factura</button>
          <button type="button" data-dismiss="modal" class="btn btn-success">Cancelar</button>
        </div>
      </div>
    </div>
  </div>


  <!-- ModalFinFactura -->
  <div class="modal fade" id="ModalFinFactura" tabindex="-1" role="dialog">
    <div class="modal-dialog" style="max-width: 600px" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h1>Acciones</h1>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-footer">
          <button type="button" id="btnConfirmarFactura" class="btn btn-success">Confirmar Factura</button>
          <button type="button" id="btnConfirmarImprimirFactura" class="btn btn-success">Confirmar e Imprimir Factura</button>
          <button type="button" id="btnConfirmarDescartarFactura" class="btn btn-success">Descartar la Factura</button>
        </div>
      </div>
    </div>
  </div>


  <!-- ModalConfirmarBorrar -->
  <div class="modal fade" id="ModalConfirmarBorrar" tabindex="-1" role="dialog">
    <div class="modal-dialog" style="max-width: 600px" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h1>¿Realmente quiere borrarlo?</h1>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-footer">
          <button type="button" id="btnConfirmarBorrado" class="btn btn-success">Confirmar</button>
          <button type="button" data-dismiss="modal" class="btn btn-success">Cancelar</button>
        </div>
      </div>
    </div>
  </div>


  <script>
    document.addEventListener('DOMContentLoaded', function() {

      var producto;
      var cliente;

      document.getElementById('Fecha').valueAsDate = new Date();

      //Boton que muestra el diálogo de agregar producto
      $('#btnAgregarProducto').click(function() {
        LimpiarFormulario();
        $("#Cantidad").val("1");
        $("#ModalProducto").modal();
      });

      //Boton que agrega el producto al detalle
      $('#btnConfirmarAgregarProducto').click(function() {
        RecolectarDatosFormulario();
        $("#ModalProducto").modal('hide');
        if ($("#Cantidad").val() == "") { //Controlamos que no esté vacío la cantidad de productos
          alert('no puede estar vacío la cantidad de productos.');
          return;
        }
        EnviarInformacionProducto("agregar");
      });

      //Boton terminar factura
      $('#btnTerminarFactura').click(function() {
        $("#ModalFinFactura").modal();
      });

      //Boton confirmar factura
      $('#btnConfirmarFactura').click(function() {
        if ($('#CodigoCliente').val() == 0) {
          alert('Debe seleccionar un cliente');
          return;
        }
        RecolectarDatosCliente();
        EnviarInformacionFactura("confirmarfactura");
      });

      //Boton que descarta la factura generada borrando tanto en la tabla de facturas como detallefactura
      $('#btnConfirmarDescartarFactura').click(function() {
        RecolectarDatosCliente();
        EnviarInformacionFactura("confirmardescartarfactura");
      });

      //Boton confirmar factura y ademas genera pdf
      $('#btnConfirmarImprimirFactura').click(function() {
        if ($('#CodigoCliente').val() == 0) {
          alert('Debe seleccionar un cliente');
          return;
        }
        RecolectarDatosCliente();
        EnviarInformacionFacturaImprimir("confirmarfactura");
      });

      function RecolectarDatosFormulario() {
        producto = {
          codigoproducto: $('#CodigoProducto').val(),
          cantidad: $('#Cantidad').val()
        };
      }

      function RecolectarDatosCliente() {
        cliente = {
          codigocliente: $('#CodigoCliente').val(),
          fecha: $('#Fecha').val()
        };
      }

      //Funciones AJAX para enviar y recuperar datos del servidor
      //******************************************************* 
      function EnviarInformacionProducto(accion) {
        $.ajax({
          type: 'POST',
          url: 'procesar.php?accion=' + accion + '&codigofactura=' + <?php echo $codigofactura ?>,
          data: producto,
          success: function(msg) {
            RecuperarDetalle();
          },
          error: function() {
            alert("Hay un error ..");
          }
        });
      }

      function EnviarInformacionFactura(accion) {
        $.ajax({
          type: 'POST',
          url: 'procesar.php?accion=' + accion + '&codigofactura=' + <?php echo $codigofactura ?>,
          data: cliente,
          success: function(msg) {
            window.location = 'index.php';
          },
          error: function() {
            alert("Hay un error ..");
          }
        });
      }

      function EnviarInformacionFacturaImprimir(accion) {
        $.ajax({
          type: 'POST',
          url: 'procesar.php?accion=' + accion + '&codigofactura=' + <?php echo $codigofactura ?>,
          data: cliente,
          success: function(msg) {
            window.open('pdffactura.php?' + '&codigofactura=' + <?php echo $codigofactura ?>, '_blank');
            window.location = 'index.php';
          },
          error: function() {
            alert("Hay un error ..");
          }
        });
      }

      function LimpiarFormulario() {
        $('#Cantidad').val('');
      }

    });

    //Se ejecuta cuando se presiona un boton de borrar un item del detalle
    var cod;

    function borrarItem(coddetalle) {
      cod = coddetalle;
      $("#ModalConfirmarBorrar").modal();
    }

    $('#btnConfirmarBorrado').click(function() {
      $("#ModalConfirmarBorrar").modal('hide');
      $.ajax({
        type: 'POST',
        url: 'borrarproductodetalle.php?codigo=' + cod,
        success: function(msg) {
          RecuperarDetalle();
        },
        error: function() {
          alert("Hay un error ..");
        }
      });
    });

    function RecuperarDetalle() {
      $.ajax({
        type: 'GET',
        url: 'recuperardetalle.php?codigofactura=' + <?php echo $codigofactura ?>,
        success: function(datos) {
          document.getElementById('DetalleFactura').innerHTML = datos;
        },
        error: function() {
          alert("Hay un error ..");
        }

      });

    }
  </script>
</body>

</html>