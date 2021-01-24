create database if not exists epidemic default charset utf8 collate utf8_general_ci;
use epidemic;

set names utf8mb4;
set foreign_key_checks = 0;

-- ----------------------------
-- table structure for city
-- ----------------------------
drop table if exists `city`;
create table `city`  (
  `id` bigint(20) not null,
  `confirmed` int(11) not null,
  `deaths` int(11) not null,
  `lat` varchar(255) character set utf8mb4 collate utf8mb4_0900_ai_ci null default null,
  `log` varchar(255) character set utf8mb4 collate utf8mb4_0900_ai_ci null default null,
  `name` varchar(255) character set utf8mb4 collate utf8mb4_0900_ai_ci null default null,
  `recovered` int(11) not null,
  `rel_country_id` bigint(20) null default null,
  `updated` varchar(255) character set utf8mb4 collate utf8mb4_0900_ai_ci null default null,
  primary key (`id`) using btree
) engine = myisam auto_increment = 1 character set = utf8mb4 collate = utf8mb4_0900_ai_ci row_format = dynamic;

-- ----------------------------
-- table structure for country
-- ----------------------------
drop table if exists `country`;
create table `country`  (
  `id` bigint(20) not null,
  `abbreviation` varchar(255) character set utf8mb4 collate utf8mb4_0900_ai_ci null default null,
  `capital_city` varchar(255) character set utf8mb4 collate utf8mb4_0900_ai_ci null default null,
  `confirmed` int(11) not null,
  `continent` varchar(255) character set utf8mb4 collate utf8mb4_0900_ai_ci null default null,
  `country` varchar(255) character set utf8mb4 collate utf8mb4_0900_ai_ci null default null,
  `deaths` int(11) not null,
  `elevation_in_meters` varchar(255) character set utf8mb4 collate utf8mb4_0900_ai_ci null default null,
  `iso` int(11) not null,
  `life_expectancy` varchar(255) character set utf8mb4 collate utf8mb4_0900_ai_ci null default null,
  `location` varchar(255) character set utf8mb4 collate utf8mb4_0900_ai_ci null default null,
  `population` int(11) not null,
  `recovered` int(11) not null,
  `sq_km_area` int(11) not null,
  primary key (`id`) using btree
) engine = myisam auto_increment = 1 character set = utf8mb4 collate = utf8mb4_0900_ai_ci row_format = dynamic;

-- ----------------------------
-- table structure for hibernate_sequence
-- ----------------------------
drop table if exists `hibernate_sequence`;
create table `hibernate_sequence`  (
  `next_val` bigint(20) null default null
) engine = myisam auto_increment = 1 character set = utf8mb4 collate = utf8mb4_0900_ai_ci row_format = fixed;

set foreign_key_checks = 1;

