<html>
<head>
<title>Pruebas</title>
</head>
<body>
<?php
class Empleado {
  private $nombre;
  private $horas;
  private $sueldoH;
  function __construct($nom,$hor,$suel){
    $this->nombre = $nom;
    $this->horas = $hor;
    $this->sueldoH = $suel;
  }

  public function getNombre()
  {
    return $this->nombre;
  }
  public function getHoras()
  {
    return $this->horas;
  }
  public function getSueldoH()
  {
    return $this->sueldoH;
  }
 
  public function calcularSueldo()
  {
    return $this->horas * $this->sueldoH;
  }
}
$empleado = new Empleado($_POST['name'], $_POST['hours'], $_POST['salary']);
echo "Nombre: " . $empleado->getNombre() . "<br>";
echo "Horas: " . $empleado->getHoras() . "<br>";
echo "Sueldo por hora: " . $empleado->getSueldoH() . "<br>";
echo "Sueldo total de " . $empleado->getNombre() . ": " . $empleado->calcularSueldo() . "<br>";
?>
</body>
</html>
