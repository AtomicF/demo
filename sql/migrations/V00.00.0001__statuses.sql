-- Status table.

CREATE TABLE names
(
    name_id BIGSERIAL,
    name      TEXT NOT NULL,
    CONSTRAINT pk_status PRIMARY KEY (name_id)
);

INSERT INTO names (name)
VALUES  ('Nikita'),
       ('Pavel');
