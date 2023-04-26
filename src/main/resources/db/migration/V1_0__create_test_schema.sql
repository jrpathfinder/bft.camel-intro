drop table test if not exists;

create table test (
id_train integer PRIMARY KEY,
dt_start timestamp,
id_station_start integer,
train_name varchar);