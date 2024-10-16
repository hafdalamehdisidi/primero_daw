<?php

// Hacemosm función para calcular la suma acumulativa
function sumaAcumulativa($n) {
    $suma = 0;
    for ($i = 1; $i <= $n; $i++) {
        $suma += $i;
    }
    return $suma;
}

// Solicitamos un número de entrada al usuario
echo "Por favor, ingrese un número entero positivo: ";
$numero = trim(fgets(STDIN));

// Validamos que la entrada sea un número entero positivo
if (!is_numeric($numero) || $numero <= 0 || floor($numero) != $numero) {
    echo "Error: Por favor, ingrese un número entero positivo válido.\n";
} else {
    // Hacemos un casting
    $numero = intval($numero);
    
    // Calculamos la suma acumulativa
    $resultado = sumaAcumulativa($numero);
    
    // Mostramos el resultado
    echo "La suma de todos los números desde 1 hasta $numero es: $resultado\n";
}

?>
