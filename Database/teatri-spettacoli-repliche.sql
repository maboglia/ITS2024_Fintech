-- Trova tutti i teatri situati a Milano.

select * from teatri where citta = 'milano';

-- Mostra l'elenco di tutti gli spettacoli ordinati per durata decrescente.

select * from spettacoli order by minuti desc;

-- Calcola il numero totale di repliche per ciascun teatro.

select id_teatro, count(*) as num_repliche 
from repliche  
group by id_teatro
order by id_teatro;

-- Trova lo spettacolo con il maggior numero di repliche.

select  id_spettacolo, count(*) as num_repliche
from repliche
group by id_spettacolo
order by num_repliche desc
limit 1;

-- Secondo modo con fk

select R.id_spettacolo,S.titolo, count(R.id_spettacolo) as num_repliche
from repliche as R, spettacoli as S 
where id_spettacolo = S.id 
group by id_spettacolo
order by num_repliche desc;

-- Aggiorna la durata di uno spettacolo.

update spettacoli
set minuti = 120
where id = 3;

-- Trova il teatro che ospita il maggior numero di spettacoli.

select  id_teatro, count(*) as num_repliche
from repliche
group by id_teatro
order by num_repliche desc
limit 1;

-- Conta quanti spettacoli diversi sono stati rappresentati in totale.

select count( distinct(id_spettacolo) ) as quante_repliche from repliche ;

-- Titoli con il tempo in ore in ordine descrescente

select titolo, (minuti/60) as ore from spettacoli order by minuti desc;

-- Titoli con minuti compresi tra 150 e 170 min

select titolo, (minuti/60) from spettacoli where minuti >= 150 and minuti <= 170;

-- Titoli che iniziano con La

select * from spettacoli where titolo like 'La%';

-- Titoli che finiscono con a

select * from spettacoli where titolo like '%a';

-- Titoli che contengono vi

select * from spettacoli where titolo like '%vi%';


