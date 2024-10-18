// Esperamos a que el DOM cargue completamente antes de ejecutar el código
document.addEventListener("DOMContentLoaded", function() {
    const toggleButton = document.getElementById('toggleButton');
    const extraInfo = document.getElementById('extraInfo');

    // Función para mostrar u ocultar la información adicional
    toggleButton.addEventListener('click', function() {
        if (extraInfo.style.display === "none") {
            extraInfo.style.display = "block";
            toggleButton.textContent = "Ocultar información";
        } else {
            extraInfo.style.display = "none";
            toggleButton.textContent = "Mostrar más información";
        }
    });
});
