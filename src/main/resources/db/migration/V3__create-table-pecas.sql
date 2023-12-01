create table peca (
       id bigint not null auto_increment,
        marca varchar(255),
        modelo varchar(255),
        nome varchar(255),
        preco float(53) not null,
        primary key (id)
    ) engine=InnoDB;