package tests;

import org.junit.*;
import org.junit.experimental.categories.Categories;

public class Day02_JUnitAnnotations {

    @BeforeClass
    public static void setUpClass(){
        System.out.println("Before Class runs before the entire class ONCE");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class runs after the entire class ONCE");
    }

    @Before
    public void setUp(){
        System.out.println("Before Method runs before each @Test annotation");
    }

    @After
    public void tearDown(){
        System.out.println("After Method Runs after each @Test annotation");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }

    @Test @Ignore
    public void test3(){
        System.out.println("Test 3");
    }

    @Test
    public void test4(){
        System.out.println("Test 4");
    }

    @Test
    public void test5(){
        System.out.println("Test 5");
    }
}
