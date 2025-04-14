let Margin_move = function(){
    let margin = 0;
    return function(direction) {
        if (direction === 'left') {
            margin -= 10;
        } else if (direction === 'right') {
            margin += 10;
        }
        return margin;
    };
}