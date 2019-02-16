INSERT into user_entity (user_entity_email, user_entity_name)
VALUES ('test@1.com', 'test1');

INSERT into user_entity (user_entity_email, user_entity_name)
VALUES ('test@2.com', 'test2');

INSERT into user_entity (user_entity_email, user_entity_name)
VALUES ('test@3.com', 'test3');

create INDEX user_entity_email_index on user_entity using hash (user_entity_email);