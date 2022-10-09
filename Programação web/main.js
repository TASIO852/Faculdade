//date

var data = new Date();

// Guarda cada pedaço em uma variável
var dia = data.getDate(); // 1-31
var mes = data.getMonth(); // 0-11 (zero=janeiro)
var ano = data.getFullYear(); // 4 dígitos
var hora = data.getHours(); // 0-23
var min = data.getMinutes(); // 0-59
var seg = data.getSeconds(); // 0-59

// Formata a data e a hora (note o mês + 1)
var str_data = dia + '/' + (mes + 1) + '/' + ano;
var str_hora = hora + ':' + min + ':' + seg;

// Mostra o resultado
window.onload = function date() {
    let data = (str_data + ' às ' + str_hora);
    document.getElementById("date").innerHTML = data;
};

// contato 
function contato() {
    let name = document.getElementById("name");
    let txt = 'Logo entraremos em contato' + name;
    alert(txt);
}


// slider
let slideIndex = 0;
showSlides();

function showSlides() {
    let i;
    let slides = document.getElementsByClassName("mySlides");
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }
    slideIndex++;
    if (slideIndex > slides.length) { slideIndex = 1 }
    slides[slideIndex - 1].style.display = "block";
    setTimeout(showSlides, 2000);
}