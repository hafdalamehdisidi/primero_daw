<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>El Mayor de Tres Números</title>
</head>
<body>
    <h2>El Mayor de Tres Números</h2>
    
    <?php
        // Capturamos los números ingresados por el usuario
        $num1 = $_POST["num1"];
        $num2 = $_POST["num2"];
        $num3 = $_POST["num3"];
        
        // Encontrar el número mayor
        $mayor = max($num1, $num2, $num3);
        
        // Mostramos el resultado
        echo "<p>El número mayor es: $mayor</p>";
    
    ?>
    
     <form action="mayorDeTres.php" method="post">
        <label for="num1">Número 1:</label>
        <input type="number" id="num1" name="num1"><br><br>
        
        <label for="num2">Número 2:</label>
        <input type="number" id="num2" name="num2"><br><br>
        
        <label for="num3">Número 3:</label>
        <input type="number" id="num3" name="num3"><br><br>
        
        <input type="submit" value="Encuentra el mayor">
    </form>
</body>
</html>

