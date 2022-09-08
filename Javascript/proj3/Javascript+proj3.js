function start() {
    let noita_image = document.getElementById('noita_image');
    noita_image.addEventListener('mouseover', mouse_over_noita_image);
    noita_image.addEventListener('mouseout', mouse_out_noita_image);
    let btn2 = document.getElementById('btn_get_data');
    btn2.addEventListener('click', handleButton2)
}

function mouse_over_noita_image() {
    let noita_image = document.getElementById('noita_image');
    noita_image.src = "images/noita_2.jpg"
}

function mouse_out_noita_image() {
    let noita_image = document.getElementById('noita_image');
    noita_image.src = "images/noita.jpg"
}

function handleButton2() {
    let url = "https://jsonplaceholder.typicode.com/users/";
    let theSpan = document.getElementById('output');
    let message = "";
    fetch(url)
      .then( response => response.json())
      .then( json => {
        for(let i = 0; i < json.length; i++) {
          console.log(json[i]);
          message += json[i].name + "<br>";
          message += json[i].username + "<br>";
          message += json[i].email + "<br><br>";
        }
  
        theSpan.innerHTML = message;
      })
      .catch(e => console.log(e.message));
  }

window.addEventListener('load', start);