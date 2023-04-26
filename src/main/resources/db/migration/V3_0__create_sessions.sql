--drop table is exists sessionz;

create table sessionz (
guid varchar PRIMARY KEY,
ip varchar,
dt_send timestamp,
dt_recieved timestamp);