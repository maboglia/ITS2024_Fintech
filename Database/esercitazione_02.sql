-- 1) Quali sono i nomi completi degli studenti?

SELECT CONCAT(nome, ' ', cognome)  
FROM its_2024.studenti 
ORDER BY nome;

-- 2) Quali corsi sono disponibili e quanti crediti offrono ciascuno?
SELECT nome_corso, crediti from corsi;

-- 3) Chi sono i docenti e qual è la loro email?
SELECT cognome, nome,  email from docenti;

-- 4) Quali esami sono stati sostenuti da uno specifico studente?

SELECT * FROM esami WHERE matricola = 1001;
SELECT * FROM studenti WHERE matricola = 1001;
SELECT * FROM corsi WHERE cod_corso = 101;
SELECT * FROM corsi WHERE cod_corso = 102;

-- 5) Quali sono i voti ottenuti dagli studenti in un corso specifico?

SELECT studenti.nome, studenti.cognome, esami.data, esami.voto 
FROM esami, studenti 
WHERE 
esami.cod_corso = 101 
	and 
esami.matricola = studenti.matricola;

-- 6) Quali studenti hanno superato un determinato corso con un voto superiore a 25?

SELECT studenti.nome, studenti.cognome, esami.data, esami.voto 
FROM esami, studenti 
WHERE 
esami.cod_corso = 101 
	and 
esami.matricola = studenti.matricola
	and
esami.voto > 25
;

-- 7) Qual è la media dei voti ottenuti dagli studenti in tutti i corsi?

SELECT (AVG(voto)  / 3 * 11) as media from esami;

SELECT s.nome, s.cognome, e.data as data_esame, e.voto 
FROM esami as e, studenti as s 
WHERE 
e.cod_corso = 101 
	and 
e.matricola = s.matricola
	and
e.voto > 25
;

-- 8) Quali corsi hanno ottenuto la media dei voti più alta?

SELECT c.nome_corso, COUNT(e.voto) as quanti, SUM(e.voto) as totale, AVG(e.voto) as media
FROM corsi c, esami e
WHERE c.cod_corso = e.cod_corso
GROUP BY c.nome_corso
ORDER BY AVG(e.voto) DESC;

-- 9) Quali sono i corsi che nessuno ha ancora sostenuto?

SELECT c.nome_corso
FROM corsi c
WHERE 
c.cod_corso 
not in 
(select cod_corso from esami);-- sub-query

/*
SELECT c.nome_corso
FROM corsi c, esami e 
WHERE c.cod_corso = e.cod_corso
AND e.matricola IS NULL;
*/
-- 9bis) Quali sono gli studenti che hanno ottenuto i voti 27 e 29?

SELECT s.cognome, e.voto, c.nome_corso
FROM studenti s, esami e, corsi c
where
s.matricola = e.matricola AND
c.cod_corso = e.cod_corso AND
/*(e.voto = 27 OR e.voto = 29)*/
e.voto IN (27,29);

-- 10) Quali sono i corsi tenuti da un docente specifico?

SELECT d.cognome as Docente, c.nome_corso as Corso
FROM docenti d, corsi c
WHERE c.cod_docente = d.CodDocente
ORDER BY d.cognome, c.nome_corso;





