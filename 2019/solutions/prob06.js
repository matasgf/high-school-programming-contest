const readline = require('readline');

const readInterface = readline.createInterface({
    input: process.stdin,
    console: false
});

readInterface.on('line', function(line) {
    let numbers = line.split(' ');
    let unique = [...new Set(numbers)];
    unique = unique.map((val, index) => {
        return val * 1;
    });
    let list_sorted = unique.sort((a, b) => {return a-b});

    //# Check the distance between each pair. Determine position of smallest distance
    let distance = 999;
    let position = 0;
    for(var x = 0; x < list_sorted.length - 1; x++){
        let item1 = list_sorted[x];
        let item2 = list_sorted[x+1];
        let item_diff = item2 - item1;

        if (item_diff < distance) {
            distance = item_diff;
            position = x;

        }
    }

    //# Output two closest integers from list
    if(list_sorted.length > 1){
        console.log(list_sorted[position], list_sorted[position+1]);
    }
    else {
        console.log(list_sorted[position]);
    }

    //# Repeat for each input line

});
