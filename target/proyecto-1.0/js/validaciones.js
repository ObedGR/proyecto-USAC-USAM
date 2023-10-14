/*se hara una funcion de lado del cliente que valide los campos en tiempo real de la autentificacion
 * pra no tener que refrescar a cada instante la pagina web*/

function EsVacio() {
    var usuario = document.getElementById("usuario").value;
    var password = document.getElementById("contrasenia").value;
    
    if (usuario == "" || password == "") {
        alert("No se han completado los campos de manera correcta");
        return false;
    }
    else {
        return true;
    }
}

document.getElementById("formulario").onsubmit = function (event) {
    if (!EsVacio()) {
        event.preventDefault();
        location.reload(true);
    }
    else {
        location.reload(true);
    }
};

