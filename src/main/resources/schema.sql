create sequence entity_sequence start with 1 increment by 1;

create table Person (
    id bigint primary key,
    name varchar(200)
)