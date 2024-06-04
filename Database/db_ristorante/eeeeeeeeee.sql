create table tipi_piatto(
	id int auto_increment primary key,
    nome varchar(20));
    
INSERT INTO tipi_piatto (nome) VALUES
 ('Primo'),
 ('Secondo'),
 ('Dessert'),
 ('Bevanda');


select * from tipi_piatto;


CREATE TABLE piatti (
 id INT AUTO_INCREMENT PRIMARY KEY,
 nome VARCHAR(100),
 prezzo DECIMAL(5, 2),
 tipo_piatto_id INT,
 FOREIGN KEY (tipo_piatto_id) REFERENCES tipi_piatto(id));
 
 
 INSERT INTO piatti (nome, prezzo, tipo_piatto_id) VALUES
 ('Ravioli al ragù', 5.00, 1), -- 1 corrisponde a "Primo"
 ('Torta pasqualina', 6.00, 1),
 ('Torta di pinoli', 3.00, 3), -- 3 corrisponde a "Dessert"
 ('Birra', 1.50, 4), -- 4 corrisponde a "Bevanda"
 ('Trenette al pesto', 4.00, 1),
 ('Stoccafisso alla Genovese', 5.00, 2),
 ('Torta di mele', 2.50, 3),
 ('Vino rosso', 2.00, 4),
 ('Minestrone', 3.50, 1),
 ('Polpo in aglio e prezzemolo', 4.50, 2),
 ('Tiramisù', 3.00, 3),
 ('Acqua', 1.00, 4),
('Pansotti in salsa di noci', 5.50, 1),
 ('Cima', 4.50, 2),
 ('Torta di rose', 2.50, 3),
 ('Vino bianco', 2.00, 4);
 
 select * from piatti;
 
 select p.nome as portata, p.prezzo, categoria .nome as tipo 
 from piatti p, tipi_piatto as categoria
 where 
 p.tipo_piatto_id = categoria.id
 and
 categoria.nome = 'Secondo'
 ;
  -- join tra tabelle prendendo come ref l chiave primaria delle ctegorie e la fk dei piatti --
  
  select * from piatti where tipo_piatto_id = 1;
  
  update piatti set tipo_piatto_id = 2 where id = 2;
  -- ordinazioni --
  
  -- ordinazioni tavolo --
  
  CREATE TABLE ordinazioni_tavolo (
 id INT AUTO_INCREMENT PRIMARY KEY,
 id_tavolo INT,
 id_ordine INT,
 FOREIGN KEY (id_ordine) REFERENCES ordinazioni(id));
 
 INSERT INTO ordinazioni_tavolo (id_tavolo, id_ordine)
VALUES
 (1, 1), -- Ordine del tavolo 1 (id_ordine 1)
 (1, 3), -- Ordine del tavolo 1 (id_ordine 3)
 (2, 2), -- Ordine del tavolo 2 (id_ordine 2)
 (3, 4), -- Ordine del tavolo 3 (id_ordine 4)
 (3, 5), -- Ordine del tavolo 3 (id_ordine 5)
 (4, 6), -- Ordine del tavolo 4 (id_ordine 6)
 (4, 7), -- Ordine del tavolo 4 (id_ordine 7)
 (4, 8); -- Ordine del tavolo 4 (id_ordine 8)
