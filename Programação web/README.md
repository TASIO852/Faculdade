# Trabalho Refugiadas

https://tasio852.github.io/Refugiadas/

## HTML

- O site foi dividido nas seguintes sections:

  - `Header / Home` - Cabeçalho e começo do site com a imagem
  - `Navbar (sticky bottom)` - Navegação
  - `About` - Explicação sobre a ong (coloquei um lorem ipsum para exemplo)
  - `Background photo` - Foto de convite a ong
  - `Wedding information` - Slider com fotos das refugiadas
  - `help section ` - ajudar as refugiadas
  - `help modal` - ajudar as refugiadas
  - `Footer` - fim

## CSS

- A maior parte da aplicação foi feita com o plugin do W3schools
- CSS foi usado apenas nas imagens e no slider para arrumar tamanho e tipo de fonte

## Javascript

- Date
  - No date foi armazenado as variáveis de tempo

          var data = new Date();

          var dia = data.getDate();
          var mes = data.getMonth();
          var ano = data.getFullYear();
          var hora = data.getHours();
          var min = data.getMinutes();
          var seg = data.getSeconds();
  - E Chamando logo em seguida no elemento assim que a pagina carregasse


        var str_data = dia + '/' + (mes + 1) + '/' + ano;
        var str_hora = hora + ':' + min + ':' + seg;


        window.onload = function date() {
        let data = (str_data + ' às ' + str_hora);
        document.getElementById("date").innerHTML = data;
        };
- Contato

    - Com o formulário preenchido eo evento de escolha se e anfitriã ou refugiada disparado acontece um alerta de um pop-up avisando que logo iria entrar em contato 
- Slider

    - Foi colocado um contador e armazenado a quantidade de slides que estavam com display none

            let i;
            let slides = document.getElementsByClassName("mySlides");
            for (i = 0; i < slides.length; i++) {
                slides[i].style.display = "none";
            }
    - Logo apos colocando em display block com um timeOut de 2000 milissegundos

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

## OBS !!!

- Nao consegui melhorar a imagem 😢😢