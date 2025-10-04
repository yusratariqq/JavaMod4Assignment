import java.lang.reflect.Field;
public class ValidationUtil {
    public static void validate(Object obj) throws Exception {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Length length = field.getAnnotation(Length.class);
                String value = (String) field.get(obj);
                if (value.length() < length.min() || value.length() > length.max()) {
                    throw new IllegalArgumentException("Invalid length for " + field.getName());
                }
            }
        }
    }
}