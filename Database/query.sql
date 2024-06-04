UPDATE `its_2024`.`fintech_piazzaaffari` set id = NULL where id != 0;

ALTER TABLE `its_2024`.`fintech_piazzaaffari` 
CHANGE COLUMN `id` `id` INT NOT NULL AUTO_INCREMENT ,
CHANGE COLUMN `Titolo` `Titolo` VARCHAR(255) NULL DEFAULT NULL ,
CHANGE COLUMN `Raccomandazioni (**)` `Raccomandazioni` VARCHAR(10) NULL DEFAULT NULL ,
CHANGE COLUMN `Capital MLN â‚¬` `CapitalMLN` INT NULL DEFAULT NULL ,
ADD PRIMARY KEY (`id`);
;
