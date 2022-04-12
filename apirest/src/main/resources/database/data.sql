INSERT INTO bb2_api.supplier(iduser, username, password, name, country)
 VALUES (bb2_api.user_seq.nextval, 'prueba', '$2a$10$DIgASOccRVFWGmIufjkmXeQDFFsPgZ1WOyUN9uRZPNo6wC8iIuln6', 'Pepe Juan', 'España');
INSERT INTO bb2_api.supplier(iduser, username, password, name, country)
VALUES (bb2_api.user_seq.nextval, 'prueba2', '$2a$10$DIgASOccRVFWGmIufjkmXeQDFFsPgZ1WOyUN9uRZPNo6wC8iIuln6', 'Zurita', 'España');
INSERT INTO bb2_api.supplier(iduser, username, password, name, country)
VALUES (bb2_api.user_seq.nextval, 'prueba3', '$2a$10$DIgASOccRVFWGmIufjkmXeQDFFsPgZ1WOyUN9uRZPNo6wC8iIuln6', 'All In One', 'España');
INSERT INTO bb2_api.supplier(iduser, username, password, name, country)
VALUES (bb2_api.user_seq.nextval, 'prueba4', '$2a$10$DIgASOccRVFWGmIufjkmXeQDFFsPgZ1WOyUN9uRZPNo6wC8iIuln6', 'SML', 'Filandia');

INSERT INTO bb2_api.price_reduction (idreduction, pricereduction, startdate, enddate)
VALUES(bb2_api.price_reduction_seq.nextval, 5.0, TO_DATE('10/05/2022', 'DD/MM/YYYY'), TO_DATE('17/05/2022', 'DD/MM/YYYY'));
INSERT INTO bb2_api.price_reduction (idreduction, pricereduction, startdate, enddate)
VALUES(bb2_api.price_reduction_seq.nextval, 15.55, TO_DATE('11/05/2022', 'DD/MM/YYYY'), TO_DATE('17/05/2022', 'DD/MM/YYYY'));

INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 234, 'Product: Lamp, Colour: Blue/Black, Waterproof:No',
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

INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (1, 1);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (4, 2);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (2, 2);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (1, 4);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (5, 4);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (6, 4);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (2, 3);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (3, 3);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (4, 3);
INSERT INTO bb2_api.items_price_reductions (iditem, idreduction) VALUES (2, 1);
INSERT INTO bb2_api.items_price_reductions (iditem, idreduction) VALUES (3, 2);
