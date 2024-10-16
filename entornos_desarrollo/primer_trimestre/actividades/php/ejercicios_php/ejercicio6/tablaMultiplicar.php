<?php

// Solicitamos un número de entrada al usuario
echo "Ingrese un número entre 1 y 10: ";
$numero = intval(trim(fgets(STDIN)));

// Validamos
if ($numero < 1 || $numero > 10) {
    echo "Error: El número debe estar entre 1 y 10.\n";
    exit;
}

// Generamos y mostrar la tabla de multiplicar
echo "Tabla de multiplicar del $numero:\n";
echo "-----------------------------\n";

for ($i = 1; $i <= 10; $i++) {
    $resultado = $numero * $i;
    echo "$numero x $i = $resultado\n";
}

?>
