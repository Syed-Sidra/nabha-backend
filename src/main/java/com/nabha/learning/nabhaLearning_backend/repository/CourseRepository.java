package com.nabha.learning.nabhaLearning_backend.repository;

import com.nabha.learning.nabhaLearning_backend.model.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByGradeLevel(int gradeLevel);  // Courses by grade
}