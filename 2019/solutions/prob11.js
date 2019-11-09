const readline = require('readline');

const readInterface = readline.createInterface({
    input: process.stdin,
    console: false
});

readInterface.on('line', function(line) {
    numbers = line.split(' ');
    let unique = [...new Set(numbers)];
    unique = unique.map((val, index) => {
        return val * 1;
    });
    let list_sorted = unique.sort((a, b) => {return a-b});

    let output = '';
    for(var page = 0; page < list_sorted.length; page++) {
        if(page == 0) {
            output = list_sorted[page].toString();
        } else if (list_sorted[page] - list_sorted[page - 1] > 1) {
            output += ', ' + list_sorted[page].toString();
        } else if (page == list_sorted.length - 1) {
            output += '-' + list_sorted[page].toString();
        } else if (list_sorted[page+1] - list_sorted[page] > 1) {
            output += '-' + list_sorted[page].toString();
        }
    }

    console.log(output);

});
