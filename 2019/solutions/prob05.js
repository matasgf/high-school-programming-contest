const readline = require('readline');

const readInterface = readline.createInterface({
    input: process.stdin,
    console: false
});

readInterface.on('line', function(line) {
    let lower = 0;
    let upper = 0;

    // Count number of lowercase and uppercase letters
    for(var x = 0; x < line.length; x++){
        let char = line.charAt(x);
        if ('a' <= char && char <= 'z') lower++;
        if ('A' <= char && char <= 'Z') upper++;
    }

    //Determine if balanced or not
    if (lower == upper) {
        console.log('true');
    } else {
        console.log('false');
    }

    //Repeat for each input line
});
