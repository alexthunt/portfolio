function start() {
    let american_flag = document.getElementById('american_flag');
    american_flag.addEventListener('mouseover', americanFlagMouseOver);
    american_flag.addEventListener('mouseout', americanFlagMouseOut);
    let brazilian_flag = document.getElementById('brazilian_flag');
    brazilian_flag.addEventListener('mouseover', brazilianFlagMouseOver);
    brazilian_flag.addEventListener('mouseout', brazilianFlagMouseOut);
    let french_flag = document.getElementById('french_flag');
    french_flag.addEventListener('mouseover', frenchFlagMouseOver);
    french_flag.addEventListener('mouseout', frenchFlagMouseOut);
}

function americanFlagMouseOver() {
    let h1 = document.getElementById('h1');
    h1.innerHTML = 'America';
    let map_view = document.getElementById('map_view');
    map_view.src="images/america.gif";
}

function americanFlagMouseOut() {
    let h1 = document.getElementById('h1');
    h1.innerHTML = 'Countries and Flags';
    let map_view = document.getElementById('map_view');
    map_view.src="";
}

function brazilianFlagMouseOver() {
    let h1 = document.getElementById('h1');
    h1.innerHTML = 'Brazil';
    let map_view = document.getElementById('map_view');
    map_view.src="images/brazil.gif";
}

function brazilianFlagMouseOut() {
    let h1 = document.getElementById('h1');
    h1.innerHTML = 'Countries and Flags';
    let map_view = document.getElementById('map_view');
    map_view.src="";
}

function frenchFlagMouseOver() {
    let h1 = document.getElementById('h1');
    h1.innerHTML = 'France';
    let map_view = document.getElementById('map_view');
    map_view.src="images/france.gif";
}

function frenchFlagMouseOut() {
    let h1 = document.getElementById('h1');
    h1.innerHTML = 'Countries and Flags';
    let map_view = document.getElementById('map_view');
    map_view.src="";
}

window.addEventListener('load', start);