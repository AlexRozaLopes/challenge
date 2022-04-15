DROP TABLE IF EXISTS students;
DROP TABLE IF EXISTS house;

CREATE TABLE house
(
    id    BIGINT NOT NULL,
    house_name VARCHAR(255),
    CONSTRAINT pk_house PRIMARY KEY (id)
);

CREATE TABLE students
(
    id             UUID NOT NULL,
    name           VARCHAR(255),
    house_model_id BIGINT,
    CONSTRAINT pk_students PRIMARY KEY (id)
);

ALTER TABLE students
    ADD CONSTRAINT FK_STUDENTS_ON_HOUSE_MODEL FOREIGN KEY (house_model_id) REFERENCES house (id);