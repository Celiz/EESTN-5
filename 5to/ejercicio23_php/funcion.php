<?php
	function ciudad ($codes, $val){
		$found = false;
		$city = "";
		foreach ($codes as $key => $value) {
			if ($key == $val) {
				$found = true;
				$city = $value;
			}
		}
		return [$found, $city];
	}
?>