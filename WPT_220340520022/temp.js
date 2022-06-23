let dbparams =
{
	host: 'localhost',
	user: 'root',
	password: 'cdac',
	database: 'pleasework',
	port: 3306
};
const mysql = require('mysql2');
const con = mysql.createConnection(dbparams);
const express = require('express');
const app = express();
app.use(express.static("abc"));


console.log("Database connected");

app.get('/getitem', (req, res) => {
	
	let input = req.query.x;
	let output = { bookidfoundstatus: false, bookdetails: { bookid: 10, bookname: 'web', price: 288 } };
	con.query('select * from book where bookid=?', [input], (error, rows) => {
		if (rows.length > 0) {
			output.bookidfoundstatus = true;
			output.bookdetails = rows[0];
		}
		res.send(output);
	});
});


app.get('/updatebook', (req, res) => {
	
	let output = false;
	let input = { bookid: req.query.bookid, bookname: req.query.bookname, price: req.query.price };
	con.query('update book set price=? where bookid=?', [input.price, input.bookid], (error, rows) => {
		if (error) {
			
		}
		else if (rows.affectedRows > 0) {
			output = true;
		}
		res.send(output);
	});

});




app.listen(8081, function () {
    console.log("server listening at port 8081...");
});