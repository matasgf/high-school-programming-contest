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
    unique.sort((a, b) => {return b-a});
    console.log(unique.slice(0, 3).join(' '));
});
