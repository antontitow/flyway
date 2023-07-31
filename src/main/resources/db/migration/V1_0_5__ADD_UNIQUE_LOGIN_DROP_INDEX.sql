drop index UNIQUE_LOGIN;
alter table users add unique (login);