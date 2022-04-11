INSERT INTO bb2_api.supplier(iduser, username, password, name, country)
 VALUES (bb2_api.user_seq.nextval, 'prueba', 'prueba', 'Pepe Juan', 'España');
INSERT INTO bb2_api.supplier(iduser, username, password, name, country)
VALUES (bb2_api.user_seq.nextval, 'prueba2', 'prueba2', 'Zurita', 'España');

INSERT INTO bb2_api.price_reduction (idreduction, pricereduction, startdate, enddate)
VALUES(bb2_api.price_reduction_seq.nextval, 5.0, TO_DATE('10/05/2022', 'DD/MM/YYYY'), TO_DATE('17/05/2022', 'DD/MM/YYYY'));

INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 234, 'Product: Lamp, Colour: Blue/Black, Waterproof:No',
10.59, 1, TO_DATE('10/05/2021', 'DD/MM/YYYY'), 1);
INSERT INTO bb2_api.item (iditem, itemcode, description, price, state, creation, creator)
VALUES(bb2_api.item_seq.nextval, 12, 'Product: Table, Colour:White, Waterproof:Yes',
32.0, 1, TO_DATE('08/04/2022', 'DD/MM/YYYY'), 1);

INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (1, 1);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (1, 2);
INSERT INTO bb2_api.items_suppliers (iditem, idsupplier) VALUES (2, 2);
INSERT INTO bb2_api.items_price_reductions (iditem, idreduction) VALUES (2, 1);
