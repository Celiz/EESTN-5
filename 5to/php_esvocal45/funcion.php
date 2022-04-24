<?php
    function esVocal($l) {
        $letras = array('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        $esVocal = false;
        if (in_array($l, $letras)) {
            $esVocal = true;
        } else {
            $esVocal = false;
        }
        return $esVocal; 
    }

?>