
<<<<<<< Updated upstream
    drop table if exists beer;

    drop table if exists customer;

    create table beer (
       id varchar(36) not null,
        beer_name varchar(50) not null,
        beer_style smallint not null,
        created_date datetime(6),
        price decimal(38,2) not null,
        quantity_on_hand integer,
        upc varchar(255) not null,
        update_date datetime(6),
        version integer,
        primary key (id)
    ) engine=InnoDB;

    create table customer (
       id varchar(36) not null,
        created_date datetime(6),
        name varchar(255),
        update_date datetime(6),
        version integer,
        primary key (id)
    ) engine=InnoDB;
=======
drop table if exists beer;

drop table if exists customer;

create table beer (
                      beer_style tinyint not null check (beer_style between 0 and 9),
                      price decimal(38,2) not null,
                      quantity_on_hand integer,
                      version integer,
                      created_date datetime(6),
                      update_date datetime(6),
                      id varchar(36) not null,
                      beer_name varchar(50) not null,
                      upc varchar(255) not null,
                      primary key (id)
) engine=InnoDB;

create table customer (
                          version integer,
                          created_date datetime(6),
                          update_date datetime(6),
                          id varchar(36) not null,
                          name varchar(255) not null,
                          primary key (id)
) engine=InnoDB;
>>>>>>> Stashed changes
