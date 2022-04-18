INSERT INTO bb2_api.supplier(iduser, username, password, type, name, country)
 VALUES (bb2_api.user_seq.nextval, 'prueba', '$2a$10$DIgASOccRVFWGmIufjkmXeQDFFsPgZ1WOyUN9uRZPNo6wC8iIuln6', 2, 'Pepe Juan', 'España');
INSERT INTO bb2_api.supplier(iduser, username, password, type, name, country)
VALUES (bb2_api.user_seq.nextval, 'prueba2', '$2a$10$DIgASOccRVFWGmIufjkmXeQDFFsPgZ1WOyUN9uRZPNo6wC8iIuln6', 2, 'Zurita', 'España');
INSERT INTO bb2_api.supplier(iduser, username, password, type, name, country)
VALUES (bb2_api.user_seq.nextval, 'prueba3', '$2a$10$DIgASOccRVFWGmIufjkmXeQDFFsPgZ1WOyUN9uRZPNo6wC8iIuln6', 2, 'All In One', 'España');
INSERT INTO bb2_api.supplier(iduser, username, password, type, name, country)
VALUES (bb2_api.user_seq.nextval, 'prueba4', '$2a$10$DIgASOccRVFWGmIufjkmXeQDFFsPgZ1WOyUN9uRZPNo6wC8iIuln6', 1, 'SML', 'Filandia');
INSERT INTO bb2_api.supplier(iduser, username, password, type, name, country)
VALUES (bb2_api.user_seq.nextval, 'prueba5', '$2a$10$DIgASOccRVFWGmIufjkmXeQDFFsPgZ1WOyUN9uRZPNo6wC8iIuln6', 1, 'L&D', 'España');

INSERT INTO bb2_api.price_reduction (idreduction, pricereduction, startdate, enddate)
VALUES(bb2_api.price_reduction_seq.nextval, 5.0, TO_DATE('10/05/2022', 'DD/MM/YYYY'), TO_DATE('17/05/2022', 'DD/MM/YYYY'));
INSERT INTO bb2_api.price_reduction (idreduction, pricereduction, startdate, enddate)
VALUES(bb2_api.price_reduction_seq.nextval, 15.55, TO_DATE('11/05/2022', 'DD/MM/YYYY'), TO_DATE('17/05/2022', 'DD/MM/YYYY'));

INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 11, 'Product: Lamp, Colour: Blue/Black, Waterproof:No',
10.59, 1, TO_DATE('10/05/2021', 'DD/MM/YYYY'), 1);
INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 12, 'Product: Table, Colour:White, Waterproof:Yes',
32.0, 1, TO_DATE('08/04/2021', 'DD/MM/YYYY'), 1);
INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 13, 'Product: Chair, Colour:White, Waterproof:Yes',
72.0, 1, TO_DATE('08/10/2021', 'DD/MM/YYYY'), 4);
INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 14, 'Product: Table, Colour:Blue',
22.89, 1, TO_DATE('18/01/2022', 'DD/MM/YYYY'), 2);
INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 15, 'Product: Door, Colour:Black',
52.0, 1, TO_DATE('28/04/2022', 'DD/MM/YYYY'), 1);
INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 16, 'Product: Door, Colour:Black',
52.0, 0, TO_DATE('28/04/2021', 'DD/MM/YYYY'), 1);

INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 17, 'Product: Lamp, Colour: Blue/Black, Waterproof:No',
5.59, 1, TO_DATE('10/05/2021', 'DD/MM/YYYY'), 5);
INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 18, 'Product: Table, Colour:White, Waterproof:Yes',
178.59, 0, TO_DATE('29/12/2011', 'DD/MM/YYYY'), 5);
INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 19, 'Product: Chair, Colour:White, Waterproof:Yes',
72.45, 0, TO_DATE('11/11/2011', 'DD/MM/YYYY'), 5);
INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 20, 'Product: Table, Colour:Blue',
23.89, 1, TO_DATE('8/01/2022', 'DD/MM/YYYY'), 5);
INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 21, 'Product: Door, Colour:Black',
64.50, 1, TO_DATE('8/10/2021', 'DD/MM/YYYY'), 5);
INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 22, 'Product: Door, Colour:Black',
200.55, 1, TO_DATE('18/04/2020', 'DD/MM/YYYY'), 5);

INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (1, 1);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (4, 2);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (2, 2);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (1, 4);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (5, 4);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (6, 4);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (2, 3);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (3, 3);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (4, 3);

INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (7, 1);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (8, 1);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (7, 2);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (8, 2);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (8, 3);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (9, 3);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (9, 4);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (10, 4);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (10, 1);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (11, 1);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (11, 2);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (12, 2);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (12, 3);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (12, 5);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (10, 5);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (1, 5);

INSERT INTO bb2_api.items_price_reductions (iditem, idreduction) VALUES (2, 1);
INSERT INTO bb2_api.items_price_reductions (iditem, idreduction) VALUES (3, 2);
