# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table `Users` (`id` INTEGER NOT NULL PRIMARY KEY,`name` VARCHAR(254) NOT NULL);

# --- !Downs

drop table `Users`;

