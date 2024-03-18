// ESERCIZI DI INTERAZIONE COL DATABASE

// 1) SELECT * FROM public."Clienti" WHERE nome = 'Mario'
//    ORDER BY numero_cliente ASC

// 2) SELECT nome, cognome FROM public."Clienti" WHERE anno_di_nascita = 1982

// 3)

// 4) SELECT * FROM public."Prodotti"
//WHERE EXTRACT(YEAR FROM data_attivazione)= 2017
//AND  in_commercio = 'si'

// 5) SELECT * FROM public."Fatture"
//WHERE importo < 1000

//6) SELECT * FROM public."Fatture"
//WHERE importo < 1000
//JOIN Clienti C on F.id_cliente= C.numero_cliente ??
