const readline = require('readline');

const readInterface = readline.createInterface({
    input: process.stdin,
    console: false
});

let magazine = null;
let message = null;
let lineNumber = 1;

readInterface.on('line', function(line) {
    // Read exactly two lines of input: magazine and message
    // Ignore all other lines
    if (lineNumber == 1) {
        // Read first line
        magazine = line;
    }
    else if (lineNumber == 2) {
        // Read second line, perform calculations
        message = line;
        console.log('Magazine: ' + magazine);
        console.log('Message: ' + message);
    }

    lineNumber++;
});
