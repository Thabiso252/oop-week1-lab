package com.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void testUpdateGrade() {

        // Arrange
        Student student = new Student("John", 50);

        // Act
        student.updateGrade(80);

        // Assert
        assertEquals(80, student.grade);
    }
}
