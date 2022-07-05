<html>
<head>
<title>Pruebas</title>
</head>
<body>
<?php
class Rectangulo{
  private $largo;
  private $ancho;

  function __construct($lar,$anch) {
    $this->largo = $lar;
    $this->ancho = $anch;
  }

  function getLargo(){
    return $this->largo;
  }

  function getAncho(){
    return $this->ancho;
  }


  function getPerimetro(){
    return ($this->largo * 2) + ($this->ancho * 2);
  }

  function getArea(){
    return $this->largo * $this->ancho;
  }


}
$empleado = new Rectangulo($_POST['largo'], $_POST['ancho']);
echo "Largo: " . $empleado->getLargo() . "<br>";
echo "Ancho: " . $empleado->getAncho() . "<br>";
echo "Perimetro: " . $empleado->getPerimetro() . "<br>";
echo "Area: " . $empleado->getArea() . "<br>";
?>
</body>
</html>