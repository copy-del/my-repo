let number = document.getElementById('number');
let for_button = document.getElementById("for_button");
let while_button = document.getElementById("while_button");
let space = document.getElementById("space");



let for_gugudan = function(){
    let num = parseInt(number.value);
    let result = '';
    for (let i = 1; i<10;i++){
        result += `${num}X${i}=${num*i}<br>`
    space.innerHTML = result
    }
}
for_button.addEventListener('click',for_gugudan)

let while_gugudan = function(){
    let num = parseInt(number.value);
    let i = 1;
    let result = ''
    while(i){
        result = `${num}X${i}=${num*i}<br>`;
        i++;
    }
    space.innerHTML = result
    
}
while_button.addEventListener('click',while_gugudan)