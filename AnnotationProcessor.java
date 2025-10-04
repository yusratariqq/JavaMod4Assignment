import java.lang.reflect.Method;
public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Class<TestClass> clazz = TestClass.class;
        Method[] methods = clazz.getDeclaredMethods();
        
        for (Method method : methods) {
            if (method.isAnnotationPresent(TestAnnotation.class)) {
                TestAnnotation test = method.getAnnotation(TestAnnotation.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Category: " + test.category());
                System.out.println("Priority: " + test.priority());
                method.invoke(clazz.getDeclaredConstructor().newInstance());
                System.out.println("---");
            }
        }
    }
}
