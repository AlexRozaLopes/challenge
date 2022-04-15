DROP TABLE IF EXISTS students;
CREATE TABLE students
(
    id   BIGINT NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_students PRIMARY KEY (id)
);