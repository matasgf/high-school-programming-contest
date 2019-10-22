const readline = require('readline');

const readInterface = readline.createInterface({
    input: process.stdin,
    console: false
});

let line_number = 1;
let decode = {};
let decoded_words = [];

readInterface.on('line', function(line) {

    if(line_number == 1) {
        let keys = line.split(' ');
        let key = '';

        for(var x = 0; x < keys.length; x++) {
            if(key == '') {
                key = keys[x];
            } else {
                let val = keys[x];
                if(!decode.hasOwnProperty(key)) {
                    decode[key] = val;
                }
                key = '';
            }
        }
    } else if(line_number == 2) {
        let encoded = line.split(' ');
        for(var x = 0; x < encoded.length; x++) {
            let encoded_word = encoded[x];
            decoded_words.push(decode[encoded_word]);
        }

        console.log(decoded_words.join(' '));
    }


    line_number++;

});
