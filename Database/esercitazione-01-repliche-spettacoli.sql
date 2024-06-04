/*Trova tutti i teatri situati a Milano*/

SELECT * FROM teatri WHERE citta = 'milano';

/*Mostra l'elenco di tutti gli spettacoli ordinati per durata decrescente.*/

SELECT * FROM spettacoli order by minuti desc;

/*Calcola il numero totale di repliche per ciascun teatro.*/

SELECT id_teatro, count(*) as num_repliche 
FROM repliche 
group by id_teatro
order by id_teatro;

/*Elenca gli spettacoli per maggior numero di repliche.*/

select repliche.id_spettacolo, 
S.titolo,
count(R.id_spettacolo) as num_repliche
FROM repliche as R, spettacoli as S
where R.id_spettacolo = S.id
group by id_spettacolo
order by num_repliche desc;

/*Aggiorna la durata di uno spettacolo.*/

update spettacoli
set minuti = 90
where id = 3;

/*Trova il teatro che ospita il maggior numero di spettacoli.*/

select id_teatro, count(*) as num_repliche -- seleziona gli id teatri, li conta e li memorizza in una colonna provvisoria
FROM repliche
group by id_teatro
order by num_repliche desc
limit 2; -- mostra i primi due risultati

/*Conta quanti spettacoli diversi sono stati rappresentati in totale.*/

select count( distinct (id_spettacolo) ) as quante_repliche from repliche; -- uso di distinct per selezionare id_univoci