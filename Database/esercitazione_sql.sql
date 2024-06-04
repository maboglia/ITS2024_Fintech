create table prodotti (
id int not null primary key auto_increment,
nome varchar(50),
 prezzo double,
 quantita int(100)
 );
 
 alter table prodotti add descrizione varchar(100) after nome;
 
 
 


