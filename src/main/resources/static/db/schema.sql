drop table if exists `User`;

create table `User` (
  id identity,
  firstname varchar(25) not null,
  lastname varchar(25) not null,
  birth datetime not null,
  login varchar(25) not null,
  password varchar(25) not null,
  about varchar(255) not null,
  address varchar(100) not null,
  email varchar(50) not null,
);