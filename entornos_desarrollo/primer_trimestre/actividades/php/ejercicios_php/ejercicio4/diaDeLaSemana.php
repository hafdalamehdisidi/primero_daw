<?php

// Creamos una función para obtener el día de la semana
function obtenerDiaSemana($numero) {
    switch ($numero) {
        case 1:
            return "Lunes";
        case 2:
            return "Martes";
        case 3:
            return "Miércoles";
        case 4:
            return "Jueves";
        case 5:
            return "Viernes";
        case 6:
            return "Sábado";
        case 7:
            return "Domingo";
        default:
            return "Error: Número fuera de rango";
    }
}

// Solicitamos un número de entrada al usuario
echo " ingrese un número del 1 al 7: ";
$numero = trim(fgets(STDIN));

// Validamos que la entrada sea un número
if (!is_numeric($numero)) {
    echo "Error: Por favor, ingrese un número válido.\n";
} else {
    // Hacemos un cast
    $numero = intval($numero);
    
    // Obtenemos el día de la semana
    $dia = obtenerDiaSemana($numero);
    
    // Mostramos el resultado
    echo $dia . "\n";
}

?>
