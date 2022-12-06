Create an application named StudentsStanding.java that allows you to enter student data that consists of an ID number, first name, last name, and grade point average. Have the program accept input until ZZZ is entered for the ID number. Depending on whether the student’s grade point average is at least 2.0, output each record either to a file of students in good standing (StudentsGoodStanding.txt) or those on academic probation (StudentsAcademicProbation.txt).

Create an application named StudentsStanding2.java that displays each record in the two files created in the StudentsStanding application. Display a heading to introduce the list produced from each file. For each record, display the ID number, first name, last name, grade point average, and the amount by which the grade point average exceeds or falls short of the 2.0 cutoff. For example, the output should be formatted as follows (note that the student info may vary):

Probationary Standing

ID #10  Mike  Green  GPA: 1.9    -0.10000000000000009 from 2.0 cutoff

Good Standing

ID #100  Jill  Green  GPA: 2.0    0.0 from 2.0 cutoff
ID #50  Jane  Doe  GPA: 3.7    1.7000000000000002 from 2.0 cutoff