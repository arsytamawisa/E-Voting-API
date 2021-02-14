INSERT INTO topic (start_date, name, end_date) VALUES ('2021-02-13', 'Pemilihan Umum Hokage ke-8', '2021-02-16');
INSERT INTO topic (start_date, name, end_date) VALUES ('2021-02-11', 'Pemilihan Ketua Kelas Batch-6 Pascal', '2021-02-12');


INSERT INTO candidate (name, topic_id) VALUES ('Boruto', 1);
INSERT INTO candidate (name, topic_id) VALUES ('Sarada', 1);
INSERT INTO candidate (name, topic_id) VALUES ('Iqbal', 2);
INSERT INTO candidate (name, topic_id) VALUES ('Noval', 2);
INSERT INTO candidate (name, topic_id) VALUES ('Dimas', 2);


INSERT INTO election (elector, election_date, candidate_id, topic_id) VALUES ('Naruto', '2021-02-25 10:54:11.000000', 2, 1);
INSERT INTO election (elector, election_date, candidate_id, topic_id) VALUES ('Sasuke', '2021-02-25 10:54:11.000000', 1, 1);
INSERT INTO election (elector, election_date, candidate_id, topic_id) VALUES ('Hinata', '2021-02-25 10:54:11.000000', 1, 1);
INSERT INTO election (elector, election_date, candidate_id, topic_id) VALUES ('Wisa', '2021-02-11 10:54:11.000000', 3, 2);
INSERT INTO election (elector, election_date, candidate_id, topic_id) VALUES ('Hari', '2021-02-11 10:54:11.000000', 4, 2);
INSERT INTO election (elector, election_date, candidate_id, topic_id) VALUES ('Salman', '2021-02-12 10:54:11.000000', 5, 2);
INSERT INTO election (elector, election_date, candidate_id, topic_id) VALUES ('Mario', '2021-02-12 10:54:11.000000', 3, 2);
INSERT INTO election (elector, election_date, candidate_id, topic_id) VALUES ('Ilham', '2021-02-12 10:54:11.000000', 4, 2);