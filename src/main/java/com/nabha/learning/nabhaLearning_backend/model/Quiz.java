package com.nabha.learning.nabhaLearning_backend.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "quiz")
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    @Column(columnDefinition = "TEXT[]")  // PostgreSQL array
    private String[] options;  // e.g., {"A: Option1", "B: Option2"}

    @Column(name = "correct_answer")
    private String correctAnswer;  // e.g., "A"

    @Column(name = "course_id")
    private Long courseId;
}