CREATE TABLE IF NOT EXISTS public.USERS (
id serial,
login varchar(100),
password_hash varchar(300)
);

CREATE TABLE IF NOT EXISTS public.SESSION_LOG (
user_id integer,
password_hash varchar(300)
);