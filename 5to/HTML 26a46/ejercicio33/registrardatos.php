<?php
      

    if(isset($_POST["Enviar"])) 
    {
    
        if(isset($_POST["mail"])) 
        {
            foreach ($_POST['mail'] as $subject) 
                echo "SeleccionÃ³ $subject<br/>";
        }
    }
?>