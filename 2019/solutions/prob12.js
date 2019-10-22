const readline = require('readline');

const readInterface = readline.createInterface({
    input: process.stdin,
    console: false
});

let line_number = 1;
let mag_letters = [];
let msg_letters = [];
readInterface.on('line', function(line) {
    line = line.trim().replace(/ /g,'');

    if(line_number == 1) {
        for(var x = 0; x < line.length; x++) {
            mag_letters.push(line[x]);
        }
    } else if (line_number == 2) {
        let incomplete = 0;

        //# Save each message character to a list. Ignore spaces.
        for(var x = 0; x < line.length; x++) {
            let msg_letter = line[x];
            if(mag_letters.filter(value => value == msg_letter).length) {
                msg_letters.push(msg_letter);

                const index = mag_letters.indexOf(msg_letter);
                mag_letters.splice(index, 1);
            } else {
                incomplete = 1;
                break;
            }
        }

        if(incomplete == 0) {
            console.log('true')
        }
        else {
            console.log('false')
        }

    }


    line_number++;

});
