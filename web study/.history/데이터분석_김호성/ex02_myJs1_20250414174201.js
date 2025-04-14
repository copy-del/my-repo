let number = document.getElementById('number');
let for_button = document.getElementById("for_button");
let while_button = document.getElementById("while_button");
let space = document.getElementById("space");


let for_gugudan = function(){
    for (let i = 0; i<9;i++){
        result = `${number}'*'${i}'='${number*i}`
    space.innerHTML = result
    }
}
for_button.addEventListener('click',for_gugudan())

let while_gugudan = function(){
    i = 1;
    while(true){
        if(i>9){
            break
        }
        result = `${number}'*'${i}'='${number*i}`
        space.innerText
        i++;
    }
}
