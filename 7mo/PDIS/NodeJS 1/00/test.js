let express = require('express')

let app = express()

app.set('view engine', 'express')

app.get('/', (req, res) => {
    
})

let server = app.listen(3000, function() {
    console.log('Server is running at http://localhost:3000')
})




