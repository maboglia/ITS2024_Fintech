SELECT * FROM its_2024.films_tristi;
UPDATE its_2024.films_tristi set anno = replace(anno, '(', '') WHERE id > 0;
UPDATE its_2024.films_tristi set anno = replace(anno, ')', '') WHERE id > 0;
UPDATE its_2024.films_tristi
SET rating = CAST(REPLACE(rating, '%', '') AS UNSIGNED)
WHERE rating LIKE '%' and id > 0;

desc films_tristi