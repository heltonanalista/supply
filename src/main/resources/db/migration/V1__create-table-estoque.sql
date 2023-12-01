 create table estoque (
       id bigint not null,
        fornecedorid bigint,
        pecaid bigint,
        quantidade integer,
        primary key (id)
    ) engine=InnoDB;