package com.donggi;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {
    @Test
    void create() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("StudyTest.create");
    }

    @Test
    void create1() {
        System.out.println("StudyTest.create1");
    }

    @BeforeAll
    static void beforeAllTest() {
        System.out.println("StudyTest.beforeAllTest");
    }

    @AfterAll
    static void afterAllTest() {
        System.out.println("StudyTest.afterAllTest");
    }

    @BeforeEach
    void beforeEachTest() {
        System.out.println("StudyTest.beforeEachTest");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("StudyTest.afterEachTest");
    }
}
