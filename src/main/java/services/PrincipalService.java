package services;

import models.Applicant;
import models.Student;

public interface PrincipalService {
    void admitStudent(Applicant applicant);
    void expelStudent(Student student);
}
