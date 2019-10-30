const readline = require('readline');

const readInterface = readline.createInterface({
    input: process.stdin,
    console: false
});

readInterface.on('line', function(line) {
	line = line.trim();
	line = line.replace(/\+/g, ' \+ ');
	line = line.replace(/\-/g, ' - ');
	line = line.replace(/=/g, ' = ');
	
	let terms = line.split(' ');
    let result = 0;
	let op = "";
	for(let x = 0; x < terms.length; x++) {
		let term = terms[x];
		if (x === 0) {
			result = term * 1;
		} else if (term === '+' || term === '-') {
			op = term;
		} else if (term === '=') {
			break;
		} else {
			if (op == '+') {
				result += (term * 1);
			} else if (op == '-') {
				result -= (term * 1);
			}
		}
	}
	
	console.log(result);
});
