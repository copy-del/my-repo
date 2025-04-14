let boxes = document.getElementsByClassName('box');
let margin_move = document.getElementById('margin_move');
let border_radius_hwohwa = document.getElementById('border_radius_hwohwa');

margin_move.addEventListener('click',function(){
    for (let i = 0; i < boxes.length; i++) {
    boxes[i].style.marginLeft = `${i*100}px`;
}
})
border_radius_hwohwa.addEventListener('click', function() {
    for (let i = 0; i < boxes.length; i++) {
    boxes[i].style.borderTopRightRadius = '40px';
    boxes[i].style.borderBottomLeftRadius = '40px';
    }
});
