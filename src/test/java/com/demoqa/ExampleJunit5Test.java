package com.demoqa;
import org.junit.jupiter.api.*;

public class ExampleJunit5Test {

    @BeforeAll
    static void configure() {
        System.out.println("Test Inited!");
    }
    @BeforeEach
    void prepareTest() {
        System.out.println("Pause!");
    }
    @Test
    void firstTest(){
        Assertions.assertTrue(1==1);
        System.out.println("Test1 Passed!");
    }

    @Test
    void secondTest(){
        Assertions.assertTrue(1==1);
        System.out.println("Test2 Passed!");
    }


    @AfterAll
    static void tearDown(){
        System.out.println("Test Cleaned!");
    }
}
