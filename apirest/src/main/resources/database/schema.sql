create schema bb2_api;
create sequence bb2_api.item_seq;
create sequence bb2_api.user_seq;
create sequence bb2_api.price_reduction_seq;

create table bb2_api.supplier (iduser BIGINT PRIMARY KEY, username varchar(50) not null unique, password varchar not null, name varchar(100), country varchar);

create table bb2_api.item (iditem  BIGINT PRIMARY KEY, itemcode BIGINT unique not null, description varchar, price DOUBLE, state NUMERIC(1),
  creation DATE, creator BIGINT references bb2_api.supplier);


create table bb2_api.price_reduction (idreduction BIGINT PRIMARY KEY, pricereduction DOUBLE, startdate DATE, enddate DATE);

create table bb2_api.items_suppliers (
  iditem BIGINT NOT NULL,
  idsupplier BIGINT NOT NULL,
  PRIMARY KEY (iditem , idsupplier),
  FOREIGN KEY (iditem) REFERENCES  bb2_api.item(iditem) ,
  FOREIGN KEY (idsupplier) REFERENCES bb2_api.supplier(iduser));

create table bb2_api.items_price_reductions (
  iditem BIGINT NOT NULL,
  idreduction BIGINT NOT NULL,
  PRIMARY KEY (iditem , idreduction),
  FOREIGN KEY (iditem) REFERENCES  bb2_api.item(iditem) ,
  FOREIGN KEY (idreduction) REFERENCES bb2_api.price_reduction(idreduction));
