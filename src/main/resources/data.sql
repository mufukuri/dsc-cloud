drop table todo;


create table todo (
  id varchar(36) not null,
  description varchar(255) not null,
  created timestamp,
  modified timestamp,
  completed boolean,
  primary key (id)
);

insert into todo values ('7fd921cfd2b64dc7b995633e8209f385','Buy Vegetables','2019-07-07 15:00:01','2019-07-07 15:00:01',true);
insert into todo values ('5820a4c2abe74f409da89217bf905a0c','Knowledge share','2019-07-07 16:00:01','2019-07-07 16:00:01',true);
insert into todo values ('a44b6db26aef49e39d1b68622f55c347','Go to the Gym','2019-07-07 18:00:00','2019-07-07 19:00:00',true);
