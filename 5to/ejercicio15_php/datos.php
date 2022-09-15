
    <?php

	$n1 = $_POST['n1'];
    $txt =["Es multiplo de 3", "No es Multiplo de 3"];

		if($n1%3 == 0){
			echo "$txt[0]";
        }

        else{
           echo "$txt[1]";
        }
    ?>     