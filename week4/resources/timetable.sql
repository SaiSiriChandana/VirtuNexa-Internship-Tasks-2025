
CREATE TABLE teachers (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL
);

CREATE TABLE subjects (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    teacherId INTEGER,
    FOREIGN KEY (teacherId) REFERENCES teachers(id)
);

INSERT INTO teachers (name) VALUES ('Mr. A'), ('Ms. B'), ('Dr. C');
INSERT INTO subjects (name, teacherId) VALUES ('Math', 1), ('Physics', 2), ('English', 3);
