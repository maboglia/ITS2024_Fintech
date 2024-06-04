-- 1. Crea la tabella "prodotti"
CREATE TABLE prodotti (
    id INT PRIMARY KEY,
    nome VARCHAR(50),
    prezzo DECIMAL(6,2),
    quantita INT CHECK (quantita <= 100)
);

-- 2. Aggiungi il campo "descrizione" alla tabella "prodotti"
ALTER TABLE prodotti
ADD COLUMN descrizione TEXT AFTER nome;