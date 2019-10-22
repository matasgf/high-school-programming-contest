const readline = require('readline');

const readInterface = readline.createInterface({
    input: process.stdin,
    console: false
});

readInterface.on('line', function(line) {
    line = line.replace('=', '');
    console.log(eval(line));
});
