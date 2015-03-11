create table knowledges (
    knowledgeid int not null,
    title varchar(80) null,
    sort varchar(2) not null,
    summary varchar(80) null,
    knowledge varchar(80) null,
    comment varchar(80) null,
    constraint pk_knowledges primary key (knowledgeid)
);

