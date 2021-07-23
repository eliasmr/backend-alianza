
DROP TABLE IF EXISTS cliente;

CREATE TABLE cliente (
shared_key VARCHAR(20) NOT NULL,
business_ID VARCHAR(128) NOT NULL,
email VARCHAR(50) NOT NULL,
phone VARCHAR(15) NOT NULL,
data_add DATE NOT NULL,
PRIMARY KEY (shared_key)
);

insert into cliente (shared_key,business_ID,email,phone,data_add) values('jgutierrez','Juliana Gutierrez','jgutierrez@gmail.com','3219876543',To_DATE('20/05/2019','dd/MM/yyyy'));
insert into cliente (shared_key,business_ID,email,phone,data_add) values('Mmartinez','Manuel Martinez','mmartinez@gmail.com','321987543',To_DATE('20/05/2019','dd/MM/yyyy'));
insert into cliente (shared_key,business_ID,email,phone,data_add) values('aruiz','Ana Ruiz','aruiz@gmail.com','321987543',To_DATE('20/05/2019','dd/MM/yyyy'));
insert into cliente (shared_key,business_ID,email,phone,data_add) values('ogarcia','Oscar Garcia','ogarcia@gmail.com','321987543',To_DATE('20/05/2019','dd/MM/yyyy'));
insert into cliente (shared_key,business_ID,email,phone,data_add) values('tramos','Tania Ramos','tramos@gmail.com','321987543',To_DATE('20/05/2019','dd/MM/yyyy'));
insert into cliente (shared_key,business_ID,email,phone,data_add) values('cariza','Carlos Ariza','cariza@gmail.com','321987543',To_DATE('20/05/2019','dd/MM/yyyy'));
insert into cliente (shared_key,business_ID,email,phone,data_add) values('rvillaneda','Rodrigo Villaneda','rvillaneda@gmail.com','321987543',To_DATE('20/05/2019','dd/MM/yyyy'));
insert into cliente (shared_key,business_ID,email,phone,data_add) values('mfonseca','Mauricio Fonseca','ffonseca@gmail.com','321987543',To_DATE('20/05/2019','dd/MM/yyyy'));

