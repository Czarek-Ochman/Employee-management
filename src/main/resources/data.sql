INSERT INTO address (id, country, city,street,zip_code)
VALUES (1, 'Polska', 'Kalety', 'Działkowa', '42-660');

INSERT INTO address (id, country, city,street,zip_code)
VALUES (2, 'Polska', 'Tarnowskie Góry', 'Jodłowa', '42-600');

INSERT INTO address (id, country, city,street,zip_code)
VALUES (3, 'Polska', 'Tarnowskie Góry', 'Piastowska', '42-600');

INSERT INTO address (id, country, city,street,zip_code)
VALUES (4, 'Polska', 'Misateczko śląskie', 'Piękna', '42-610');

INSERT INTO address (id, country, city,street,zip_code)
VALUES (5, 'Polska', 'Misateczko śląskie', 'Prosta', '42-610');

INSERT INTO address (id, country, city,street,zip_code)
VALUES (6, 'Polska', 'Kalety', 'Kosa', '42-660');

INSERT INTO address (id, country, city,street,zip_code)
VALUES (7, 'Polska', 'Tarnowskie Góry', 'Pokoju', '42-600');

INSERT INTO address (id, country, city,street,zip_code)
VALUES (8, 'Polska', 'Tarnowskie Góry', 'Hansena', '42-600');

INSERT INTO address (id, country, city,street,zip_code)
VALUES (9, 'Polska', 'Misateczko śląskie', 'Jana', '42-610');

INSERT INTO address (id, country, city,street,zip_code)
VALUES (10, 'Polska', 'Misateczko śląskie', 'Szczęśliwa', '42-610');


-- ////////////////////////////////////////////////////////////////////////////////

INSERT INTO person (id, first_name, last_name,age,address_id)
VALUES (1, 'Cezary', 'Ochman', 22, 1);

INSERT INTO person (id, first_name, last_name,age,address_id)
VALUES (2, 'Stefan', 'Koc', 28, 2);

INSERT INTO person (id, first_name, last_name,age,address_id)
VALUES (3, 'Wiola', 'Koper', 31, 3);

INSERT INTO person (id, first_name, last_name,age,address_id)
VALUES (4, 'Alex', 'Mazur', 51, 4);

INSERT INTO person (id, first_name, last_name,age,address_id)
VALUES (5, 'Patrycja', 'Lepek', 24, 5);

INSERT INTO person (id, first_name, last_name,age,address_id)
VALUES (6, 'Stanisław', 'Ochman', 19, 6);

INSERT INTO person (id, first_name, last_name,age,address_id)
VALUES (7, 'Helena', 'Knop', 35, 7);

INSERT INTO person (id, first_name, last_name,age,address_id)
VALUES (8, 'Eliza', 'Włoch', 37, 8);

INSERT INTO person (id, first_name, last_name,age,address_id)
VALUES (9, 'Magdalena', 'Parys', 41, 9);

INSERT INTO person (id, first_name, last_name,age,address_id)
VALUES (10, 'Marcin', 'Długaj', 23, 10);

-- ////////////////////////////////////////////////////////////////////////////////////////
INSERT INTO employee (id, bonus, section ,person_id)
VALUES (1, 'HARMFUL_PLACE', 'LABORATORY', 1);

INSERT INTO employee (id, bonus, section ,person_id)
VALUES (2, 'NO_BONUS', 'SALES', 2);

INSERT INTO employee (id, bonus, section ,person_id)
VALUES (3 , 'NO_BONUS', 'IT', 3);

INSERT INTO employee (id, bonus, section ,person_id)
VALUES (4, 'NO_BONUS', 'CONTROL', 4);

INSERT INTO employee (id, bonus, section ,person_id)
VALUES (5, 'WASHING_CLOTHES', 'PRODUCTION', 5);

INSERT INTO employee (id, bonus, section ,person_id)
VALUES (6, 'HARMFUL_PLACE', 'LABORATORY', 6);

INSERT INTO employee (id, bonus, section ,person_id)
VALUES (7, 'NO_BONUS', 'SALES', 7);

INSERT INTO employee (id, bonus, section ,person_id)
VALUES (8 , 'NO_BONUS', 'IT', 8);

INSERT INTO employee (id, bonus, section ,person_id)
VALUES (9, 'NO_BONUS', 'CONTROL', 9);

INSERT INTO employee (id, bonus, section ,person_id)
VALUES (10, 'WASHING_CLOTHES', 'PRODUCTION', 10);