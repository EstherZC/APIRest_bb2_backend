create schema bb2_api;
create sequence bb2_api.item_seq;
create sequence bb2_api.user_seq;
create sequence bb2_api.supplier_seq;
create sequence bb2_api.price_reduction_seq;

create table bb2_api.user_information (iduser BIGINT PRIMARY KEY, username varchar(50) not null unique, password varchar not null);

create table bb2_api.item (iditem  BIGINT PRIMARY KEY, itemcode BIGINT unique not null, description varchar, price DOUBLE, state NUMERIC(1) default 0 not null,
  creation DATE, creator BIGINT not null references bb2_api.user_information);

create table bb2_api.supplier (idsupplier BIGINT PRIMARY KEY, name varchar(100), country varchar,
    iduser BIGINT references bb2_api.user_information);

create table bb2_api.price_reduction (idreduction BIGINT PRIMARY KEY, pricereduction DOUBLE, startdate DATE, enddate DATE);

create table bb2_api.items_suppliers (
  itemcode BIGINT NOT NULL,
  idsupplier BIGINT NOT NULL,
  PRIMARY KEY (itemcode , idsupplier),
  FOREIGN KEY (itemcode) REFERENCES  bb2_api.item(itemcode) ,
  FOREIGN KEY (idsupplier) REFERENCES bb2_api.supplier(idsupplier));

create table bb2_api.items_price_reductions (
  itemcode BIGINT NOT NULL,
  idreduction BIGINT NOT NULL,
  PRIMARY KEY (itemcode , idreduction),
  FOREIGN KEY (itemcode) REFERENCES  bb2_api.item(itemcode) ,
  FOREIGN KEY (idreduction) REFERENCES bb2_api.price_reduction(idreduction));
