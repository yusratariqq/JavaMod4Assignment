public class Main {
    public static void main(String[] args) {
        System.out.println("Java Annotations Demo Running!");
        
        try {
            // Test annotation processing
            TestClass testObj = new TestClass();
            java.lang.reflect.Method[] methods = TestClass.class.getDeclaredMethods();
            
            for (java.lang.reflect.Method method : methods) {
                if (method.isAnnotationPresent(TestAnnotation.class)) {
                    TestAnnotation test = method.getAnnotation(TestAnnotation.class);
                    System.out.println("Found annotated method: " + method.getName());
                    System.out.println("Category: " + test.category());
                    System.out.println("Priority: " + test.priority());
                    method.invoke(testObj);
                    System.out.println("---");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}