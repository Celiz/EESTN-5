<?php
    include("funcion.php");
		$buscarcity = $_POST['num1'];
    $codes = '{"61":"Brasilia", "71": "Salvador", "11":"Sao Paulo", "21": "Rio de Janeiro", "32": "Juiz de Fora", "19": "Campinas", "27": "Vitoria", "31": "Belo Horizonte"}';
    $codes = json_decode($codes, true); 
		$ciudad = ciudad($codes, $buscarcity);
		if($ciudad[0]){
			echo "El codigo $buscarcity pertenece a $ciudad[1]";
		}
    if (!$ciudad[0]) {
        echo "El código $buscarcity no ha sido encontrado";
    }
?>