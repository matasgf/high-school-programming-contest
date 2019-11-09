const readline = require('readline');
//# Associate phone keypad letters to digits according to this arrangement
const dialpad = {
    'A': '2', 'B': '2', 'C': '2',
    'D': '3', 'E': '3', 'F': '3',
    'G': '4', 'H': '4', 'I': '4',
    'J': '5', 'K': '5', 'L': '5',
    'M': '6', 'N': '6', 'O': '6',
    'P': '7', 'Q': '7', 'R': '7', 'S': '7',
    'T': '8', 'U': '8', 'V': '8',
    'W': '9', 'X': '9', 'Y': '9', 'Z': '9',
};

const readInterface = readline.createInterface({
    input: process.stdin,
    console: false
});

readInterface.on('line', function(line) {
    //# Remove trailing whitespace
    line = line.trim();





    //# Decode each digit from dialpad map
    let decoded_digits = [];
    for(var x = 0; x < line.length; x++) {
        let digit = line.charAt(x).toUpperCase();
        if(dialpad[digit]){
            digit = dialpad[digit];
        }
        decoded_digits.push(digit);
    }

    console.log(decoded_digits.join(''));

    //# Repeat for each input line


});
