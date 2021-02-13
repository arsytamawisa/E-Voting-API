INSERT INTO unit (id, code, description, created_date) VALUES (1, 'kg', 'Kilogram', '2001-01-01');
INSERT INTO unit (id, code, description, created_date) VALUES (2, 'l', 'Liter', '2001-01-01');

INSERT INTO item (id, name, price, unit_id, created_date) VALUES (1, 'Air Mineral', 2, 2500, '2001-01-01');
INSERT INTO item (id, name, price, unit_id, created_date) VALUES (2, 'Beras', 1, 2500, '2001-01-01');
INSERT INTO item (id, name, price, unit_id, created_date) VALUES (3, 'Gula Pasir', 1, 2500, '2001-01-01');
INSERT INTO item (id, name, price, unit_id, created_date) VALUES (4, 'Gula Merah', 1, 2500, '2001-01-01');
INSERT INTO item (id, name, price, unit_id, created_date) VALUES (5, 'Garam Halus', 1, 2500, '2001-01-01');
INSERT INTO item (id, name, price, unit_id, created_date) VALUES (6, 'Tepung Terigu', 1, 2500, '2001-01-01');
INSERT INTO item (id, name, price, unit_id, created_date) VALUES (7, 'Bawang Merah', 1, 2500, '2001-01-01');
INSERT INTO item (id, name, price, unit_id, created_date) VALUES (8, 'Bawang Putih', 1, 2500, '2001-01-01');
INSERT INTO item (id, name, price, unit_id, created_date) VALUES (9, 'Cabai Merah Kering', 1, 2500, '2001-01-01');
INSERT INTO item (id, name, price, unit_id, created_date) VALUES (10, 'Cabai Rawit Setan', 2, 2500, '2001-01-01');

INSERT INTO stock (item_id, quantity, total_price, created_date) VALUES (1, 6000, 10000, '2020-01-01');
INSERT INTO stock (item_id, quantity, total_price, created_date) VALUES (2, 500, 10000, '2020-01-01');
INSERT INTO stock (item_id, quantity, total_price, created_date) VALUES (3, 500, 10000, '2020-01-01');
INSERT INTO stock (item_id, quantity, total_price, created_date) VALUES (4, 100, 10000, '2020-01-01');
INSERT INTO stock (item_id, quantity, total_price, created_date) VALUES (5, 500, 10000, '2020-01-01');
INSERT INTO stock (item_id, quantity, total_price, created_date) VALUES (6, 250, 10000, '2020-01-01');
INSERT INTO stock (item_id, quantity, total_price, created_date) VALUES (7, 100, 10000, '2020-01-01');
INSERT INTO stock (item_id, quantity, total_price, created_date) VALUES (8, 100, 10000, '2020-01-01');
INSERT INTO stock (item_id, quantity, total_price, created_date) VALUES (9, 50, 10000, '2020-01-01');
INSERT INTO stock (item_id, quantity, total_price, created_date) VALUES (10, 50, 10000, '2020-01-01');