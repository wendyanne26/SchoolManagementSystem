package services;

import models.Assignment;
import models.Course;
import models.Exam;
import models.Student;

import java.util.List;

public interface StudentService {
    String takeCourse(Course course);
    int getTotalNumberOfCoursesTaken(Student student);
    void takeExam(Course course, Exam exam);
    String submitAssignment(Assignment assignment, Course course);
    void payFees(double amount);
    List<Course> getCoursesTaken(Student student);
}
