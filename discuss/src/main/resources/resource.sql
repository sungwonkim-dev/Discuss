CREATE TABLE user (
  id INT(11) unsigned not null auto_increment,
  uid varchar(40) not null unique ,
  password varchar(20) not null ,
  email varchar(40) not null unique,
  role char(5) not null default 'USER',
  created DATETIME not null DEFAULT CURRENT_TIMESTAMP,
  primary key (id)
);