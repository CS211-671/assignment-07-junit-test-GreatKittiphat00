package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    void testAddNewStudent() {
        StudentList list = new StudentList();
        list.addNewStudent("John", "Doe");
        list.addNewStudent("Joy", "Doe");
        list.addNewStudent("Tony", "Doe");
        assertEquals(3, list.getStudents().size());

    }

}