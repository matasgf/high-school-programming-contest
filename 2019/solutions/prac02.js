const readline = require('readline');

const readInterface = readline.createInterface({
    input: process.stdin,
    console: false
});

readInterface.on('line', function(line) {
    words = line.split(' ');
    console.log(words[0] + ' is ' + words[1] + ' today!');
});
