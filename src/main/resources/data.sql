insert into users(usr_id, usr_name, usr_lastname, USR_BIRTHDAY)
values (10001,'Dani', 'Serrano', '1989-01-06');

insert into groups (grp_id, grp_name, grp_description)
values (20001, 'ADMIN', 'All permissions');

insert into user_group (UGRP_ID, UGRP_USR_ID, UGRP_GRP_ID)
values (30001, 10001,20001);