let ppp = document.getElementById("pp"); 
let like = document.getElementById("like");
let dislike = document.getElementById("dislike");
let chogihwa = document.getElementById("chogihwa");

ppp.innerHTML = 0;

like_click = function(){
    let num = parseInt(ppp.innerHTML)
    num+=1;
    ppp.innerHTML = num;
}
dislike_click = function(){
    let num = parseInt(ppp.innerHTML)
    if(num>0){
        num-=1;
        ppp.innerHTML = num;
    }
}
chogihwa_click = function(){
    location.reload();
}

like.addEventListener('click',like_click)




// let ppp = document.getElementById("pp"); 
// let like = document.getElementById("like");
// let dislike = document.getElementById("dislike");
// ppp.innerHTML = 0; 
// like.addEventListener("click", function(){
//     let num = parseInt(ppp.innerHTML);
//     num +=1; 
//     ppp.innerHTML = num; 
// })
// dislike.addEventListener("click",function(){
//     let num = parseInt(ppp.innerHTML);
//     if(num > 0){ 
//         num -= 1;
//         ppp.innerHTML = num; 
//     }   
// })

// chogihwa.addEventListener("click",function(){
//     location.reload();
// })
        
