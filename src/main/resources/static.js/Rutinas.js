$(document).ready(function () {
        $("#agregarArbol").modal({
            backdrop: "static", // Esto deshabilita el cierre haciendo clic fuera del modal
            keyboard: false // Esto deshabilita el cierre al presionar la tecla Esc
        });
    });


function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();
        reader.onload = function (e) {
            $('#blah')
                    .attr('src', e.target.result)
                    .height(200);
        };
        reader.readAsDataURL(input.files[0]);
    }
}

