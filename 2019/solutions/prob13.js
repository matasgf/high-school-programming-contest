const readline = require('readline');

const readInterface = readline.createInterface({
    input: process.stdin,
    console: false
});

function isUpperCase(str) {
    return str == str.toUpperCase() && str != str.toLowerCase();
}

function isLowerCase(str) {
    return str == str.toLowerCase() && str != str.toUpperCase();
}

readInterface.on('line', function(line) {
    let letters = line.trim();


    //# Process each letter
    let encoded_letters = [];
    for(var x = 0; x < letters.length; x++) {
        let letter = letters[x];
        let encoded_letter = '';

        if(isUpperCase(letter)) {
            encoded_letter = String.fromCharCode(letter.charCodeAt(0) + 13);
            if(!isUpperCase(encoded_letter)) {
                encoded_letter = String.fromCharCode(letter.charCodeAt(0) - 13);
            }
        } else if (isLowerCase(letter)) {
            encoded_letter = String.fromCharCode(letter.charCodeAt(0) + 13);
            if(!isLowerCase(encoded_letter)) {
                encoded_letter = String.fromCharCode(letter.charCodeAt(0) - 13);
            }
        } else {
            encoded_letter = letter;
        }

        encoded_letters.push(encoded_letter);
    }

    console.log(encoded_letters.join(''));


});
