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
$rectangulo = new Rectangulo($_POST['largo'], $_POST['ancho']);
echo "Largo: " . $rectangulo->getLargo() . "<br>";
echo "Ancho: " . $rectangulo->getAncho() . "<br>";
echo "Perimetro: " . $rectangulo->getPerimetro() . "<br>";
echo "Area: " . $rectangulo->getArea() . "<br>";
?>
</body>
</html>
