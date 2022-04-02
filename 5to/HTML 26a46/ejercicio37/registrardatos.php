<?php
  $target_dir = "uploads/";
  $target_file = $target_dir . basename($_FILES["fileToUpload"]["name"]);
  $uploadOk = 1;
  $imageFileType = strtolower(pathinfo($target_file,PATHINFO_EXTENSION));
  $target_file2 = $target_dir . basename($_FILES["fileToUpload2"]["name"]);
  $uploadOk2 = 1;
  $imageFileType2 = strtolower(pathinfo($target_file,PATHINFO_EXTENSION));
  // Check if image file is a actual image or fake image
  if(isset($_POST["submit"])) {
    $check = getimagesize($_FILES["fileToUpload"]["tmp_name"]);
    $check2= getimagesize($_FILES["fileToUpload2"]["tmp_name"]);
    if($check !== false) {
      echo "El arcivo es imagen - " . $check["mime"] . "<br>";
      $uploadOk = 1;
    } else {
      echo "El archivo no es una imagen";
      $uploadOk = 0;
    }
    if($check2 !== false) {
      echo "El arcivo es imagen  - " . $check["mime"] . "<br>";
      $uploadOk2 = 1;
    } else {
      echo "El archivo no es una imagen";
      $uploadOk2 = 0;
    }
  }
  echo "<img src='uploads/$target_file' >";
?>



