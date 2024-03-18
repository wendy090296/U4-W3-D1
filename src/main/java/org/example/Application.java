// ESERCIZI DI INTERAZIONE COL DATABASE

// 1) SELECT * FROM public."Clienti" WHERE nome = 'Mario'
//

// 2) SELECT nome, cognome FROM public."Clienti" WHERE anno_di_nascita = 1982

// 3) SELECT COUNT(*) FROM Fatture WHERE Iva = 20;

// 4) SELECT * FROM public."Prodotti"
//WHERE EXTRACT(YEAR FROM data_attivazione)= 2017
//AND  (in_commercio = true OR in_produzione = true);

// 5) SELECT *
//FROM "Fatture" f
//JOIN "Clienti" c ON f.id_cliente = c.numero_cliente
//WHERE importo < 1000

// 6) SELECT numero_fattura, importo, iva, data_fattura
//FROM "Fatture" F
//JOIN "Fornitori" Fo USING(numero_fornitore);

// 7) SELECT EXTRACT(YEAR FROM data_fattura) as Anno, COUNT(*) AS NumeroFatture
//FROM "Fatture"
//WHERE iva = 20
//GROUP BY Anno;

// 8) SELECT EXTRACT(YEAR FROM data_fattura) AS Anno,
//COUNT(*) AS NumeroFatture,
//SUM (importo) AS SommaImporti
//FROM "Fatture"
//GROUP BY Anno;

// 9) SELECT EXTRACT(YEAR FROM data_fattura) AS Anno , COUNT (*) AS NumeroFatture FROM "Fatture"
//WHERE tipologia = 'A'
//GROUP BY Anno
//HAVING COUNT (*)>2

// 10 ) SELECT regione_residenza, SUM(importo) as "somma importo fatture"
//FROM "Fatture" f JOIN "Clienti" c ON f.id_cliente = c.numero_cliente
//GROUP BY regione_residenza

//11)SELECT COUNT(DISTINCT C.numero_cliente) AS NumeroClienti
//FROM "Clienti" C
//JOIN "Fatture" F ON C.numero_cliente = F.id_cliente
//WHERE EXTRACT(YEAR FROM C.data_nascita) = 1980
//AND F.importo > 50;
