<?php

var_dump( $_GET);

$distancia = $_GET['distancia'];
$velocidad = $_GET['velocidad'];
echo "<br>Distancia: $distancia km y la velocidad: $velocidad km/h";
$tiempo = $distancia / $velocidad;
echo "<h2 style='color:red;'>El tiempo estimado es: $tiempo horas </h2>";

?>
