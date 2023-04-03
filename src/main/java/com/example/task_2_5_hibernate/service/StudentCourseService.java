package com.example.task_2_5_hibernate.service;

import com.example.task_2_5_hibernate.dao.StudentCourseDao;
import com.example.task_2_5_hibernate.entity.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class StudentCourseService {
    private final StudentCourseDao studentCourseDao;

    public List<Student> getStudentsByCourseName(String courseName) {
        log.info("Getting students by course name");
        return studentCourseDao.findStudentsByCourseName(courseName);
    }

    public void addStudentToCourse(int studentId, int courseId) {
        log.info("Adding student to course");
        studentCourseDao.saveStudentToCourse(studentId, courseId);
    }

    public void deleteStudentFromCourse(int studentId, int courseId) {
        log.info("Deleting student from course");
        studentCourseDao.removeStudentFromCourse(studentId, courseId);
    }

    public void deleteStudentCourse(int studentId) {
        log.info("Deleting record with student id: " + studentId);
        studentCourseDao.removeStudentCourse(studentId);
    }

    public List<Student> getStudentsByCourseId(int courseId) {
        log.info("Getting student by course id: " + courseId);
        return studentCourseDao.findStudentsByCourseId(courseId);
    }
}
