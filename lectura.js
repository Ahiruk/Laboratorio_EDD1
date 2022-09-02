const fs = require("fs");

fs.open("Datos.txt", "r", (err, file) => {
   if (err) throw err;
   console.log(file);
});

fs.rename("Datos.txt", "Datos_De_Tarjetas_De_Credito.txt", (err) => {
    if (err) throw err;
    console.log("File renamed!");
})