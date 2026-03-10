create table topicos(

                        id bigint not null auto_increment,
                        titulo varchar(100) not null,
                        mensagem varchar(100) not null,
                        dataCriacao datetime not null,
                        autor varchar(100) not null,
                        status tinyint not null default 1,
                        primary key(id)

);