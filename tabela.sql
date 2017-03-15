create database CoursesManagement;
use CoursesManagement;

create table Student
(ID_Student int PRIMARY KEY,
Nume nvarchar(50),
Birth dat date,
Adresa nvarchar(50));

create table Courses
(ID_Courses int PRIMARY KEY,
Nume nvarchar(50),
Teacher nvarchar(50),
Year of study int); 

create table StudentEnroll
(ID_Student int,
ID_Courses int);

alter table StudentEnroll
add constraint fk_StudentEnroll_Student
foreign key (ID_Student)
references Student(ID_Student)
on update cascade
on delete cascade;

alter table StudentEnroll
add constraint fk_StudentEnroll_Courses
foreign key(ID_Courses)
references Courses(ID_Courses)
on update cascade
on delete cascade;