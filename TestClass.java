public class TestClass {
    @TestAnnotation(category = "unit", priority = 1)
    public void testMethod1() {
        System.out.println("Running test method 1");
    }
    
    @TestAnnotation(category = "integration", priority = 2)
    public void testMethod2() {
        System.out.println("Running test method 2");
    }
}