var url = 'htpp://mylogger.io/log';

//define the module

function log(message) {
	// Send an http request
	console.log(message);
}


//export it 
module.exports.log = log;
