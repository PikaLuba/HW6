INSERT INTO worker (id,name,birthday,level,salary) VALUES (1, 'Gleb_worker', '2000-01-01', 'Trainee', 200);
INSERT INTO worker (id,name,birthday,level,salary) VALUES (2, 'Sergey_worker', '2001-02-02', 'Junior', 700);
INSERT INTO worker (id,name,birthday,level,salary) VALUES (3, 'Anton_worker', '2002-03-03', 'Middle', 50000);
INSERT INTO worker (id,name,birthday,level,salary) VALUES (4, 'Igor_worker', '2003-04-05', 'Middle', 30000);
INSERT INTO worker (id,name,birthday,level,salary) VALUES (5, 'Paul_worker', '1999-05-06', 'Senior', 100000);
INSERT INTO worker (id,name,birthday,level,salary) VALUES (6, 'Michelle_worker', '1998-06-07', 'Middle', 20000);
INSERT INTO worker (id,name,birthday,level,salary) VALUES (7, 'Helen_worker', '1997-07-08', 'Senior', 90000);
INSERT INTO worker (id,name,birthday,level,salary) VALUES (8, 'Laura_worker', '1996-08-09', 'Middle', 10000);
INSERT INTO worker (id,name,birthday,level,salary) VALUES (9, 'Sarah_worker', '1995-09-10', 'Junior', 700);
INSERT INTO worker (id,name,birthday,level,salary) VALUES (10, 'Sofia_worker', '1994-10-04', 'Trainee', 500);
INSERT INTO client (id,name) VALUES (1, 'Gleb_client');
INSERT INTO client (id,name) VALUES (2, 'Sergey_client');
INSERT INTO client (id,name) VALUES (3, 'Anton_client');
INSERT INTO client (id,name) VALUES (4, 'Igor_client');
INSERT INTO client (id,name) VALUES (5, 'Paul_client');
INSERT INTO progect (id,client_id,start_date,finish_date,name) VALUES (1, 1, '2017-03-03', '2024-03-03', 'ProgectA');
INSERT INTO progect (id,client_id,start_date,finish_date,name) VALUES (2, 1, '2016-02-02', '2024-02-03', 'ProgectB');
INSERT INTO progect (id,client_id,start_date,finish_date,name) VALUES (3, 2, '2024-01-03', '2024-03-03', 'ProgectC');
INSERT INTO progect (id,client_id,start_date,finish_date,name) VALUES (4, 2, '2020-04-05', '2022-03-03', 'ProgectD');
INSERT INTO progect (id,client_id,start_date,finish_date,name) VALUES (5, 3, '2021-03-03', '2021-04-03', 'ProgectE');
INSERT INTO progect (id,client_id,start_date,finish_date,name) VALUES (6, 4, '2023-06-07', '2025-03-03', 'ProgectF');
INSERT INTO progect (id,client_id,start_date,finish_date,name) VALUES (7, 4, '2022-07-08','2026-05-03', 'ProgectG');
INSERT INTO progect (id,client_id,start_date,finish_date,name) VALUES (8, 5, '2023-08-09', '2024-05-03', 'ProgectH');
INSERT INTO progect (id,client_id,start_date,finish_date,name) VALUES (9, 4, '2023-09-01', '2024-06-03', 'ProgectI');
INSERT INTO progect (id,client_id,start_date,finish_date,name) VALUES (10, 1, '2022-07-04', '2024-07-03', 'ProgectJ');
INSERT INTO progect_worker (progect_id,worker_id) VALUES (1, 5);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (1, 6);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (1, 8);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (1, 4);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (1, 1);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (2, 1);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (2, 2);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (2, 7);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (2, 10);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (3, 7);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (3, 3);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (4, 8);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (4, 9);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (4, 4);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (4, 7);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (5, 5);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (6, 4);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (6, 9);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (7, 8);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (7, 2);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (7, 1);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (8, 10);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (8, 5);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (9, 3);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (9, 1);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (9, 9);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (10, 6);
INSERT INTO progect_worker (progect_id,worker_id) VALUES (10, 10);
