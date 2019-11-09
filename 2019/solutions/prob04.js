const readline = require('readline');

const readInterface = readline.createInterface({
    input: process.stdin,
    console: false
});

readInterface.on('line', function(line) {
    const water_weight = 62.4;
    let [volume, weight, buoyancy] = line.split(' ').map((val) => {return val * 1.0});
    let supported = volume * buoyancy * water_weight;
    if(supported > weight) {
        console.log('safe');
    } else {
        console.log('heavy');
    }
});
