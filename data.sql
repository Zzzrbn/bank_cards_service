REPLACE INTO my_db.users (id, name, password, role)
VALUES
    (1, 'Zarubin', '$2y$05$RZUyjJBgFd3xN19k4in5D.zpAlrOVOd9t7VALUzyBJE8POwuVuSXu', 'ROLE_ADMIN'),
    (2, 'Ivanov', '$2y$05$14yPmv7l1noycewcczxfAOAyIoOf2XzqCaxbQAxn1xHfmQIt2qQ92', 'ROLE_USER'),
    (3, 'Petrov', '$2y$05$bap6h.hrKr6/AFlIvu1BW.SCZtt1ynnosYDF9gCscmxWt/drF4GtO', 'ROLE_USER');
    
REPLACE INTO my_db.bankcards (id, number, user_id, expdate, status, balance)
VALUES
    (1,'1234567890001234', 1, '2025-12-31', 'ACTIVE', 500),
    (2,'1234567890001235', 1, '2025-11-30', 'ACTIVE', 1500),
    (3,'1234567890001236', 2, '2025-11-30', 'ACTIVE', 1500),
    (4,'1234567890001237', 2, '2025-11-30', 'BLOCKED', 1500),
    (5,'1234567890001238', 2, '2025-10-31', 'EXPIRED', 2500),
    (6,'1234567890001239', 2, '2025-10-31', 'EXPIRED', 3500);