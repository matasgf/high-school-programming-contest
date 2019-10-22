const readline = require('readline');

const readInterface = readline.createInterface({
    input: process.stdin,
    console: false
});

readInterface.on('line', function(line) {
    let words = line.split(' ');
    let welcome = 1;
    for(var x = 0; x < words.length; x++){
        let word = words[x];
        let firstChar = word.charAt(0).toString().toUpperCase();
        let lastChar = word.charAt(word.length - 1).toString().toUpperCase();

        if(firstChar != 'S' && lastChar != 'S') {
            welcome = 0;
            break;
        }
    }

    if(welcome == 1) {
        console.log('welcome');
    } else {
        console.log('denied');
    }



});
