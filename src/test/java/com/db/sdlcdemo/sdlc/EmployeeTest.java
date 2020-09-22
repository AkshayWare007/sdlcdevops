package com.db.sdlcdemo.sdlc;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class EmployeeTest {

    Employee employee = new Employee(19, "Akshay");

    //TODO
    @Test
    void getId() {
        assertEquals(19, employee.getId());
    }

    //TODO
    @Test
    void setId() {

    }

    //TODO
    @Test
    void getName() {
    }

    //TODO
    @Test
    void setName() {
    }
}