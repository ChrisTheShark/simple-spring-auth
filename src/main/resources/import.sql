-- Insert role
insert into role (name) values ('ROLE_USER');

-- Insert users (passwords are both 'password')
insert into user (username, enabled, password, role_id) values ('user', true, '$2a$06$bZEEXHdkSZwplkR2DTR3y.iXgekJwIXQ6fqnK6M3BRFE2sC/gehTK', 1);
insert into user (username, enabled, password, role_id) values ('user2', true, '$2a$06$bZEEXHdkSZwplkR2DTR3y.iXgekJwIXQ6fqnK6M3BRFE2sC/gehTK', 1);

-- Insert tasks
insert into task (complete,description, user_id) values (true,'Code Task entity', 1);
insert into task (complete,description, user_id) values (false,'Discuss users and roles', 1);
insert into task (complete,description, user_id) values (false,'Enable Spring Security', 2);
insert into task (complete,description, user_id) values (false,'Test application', 2);