public class Person {
    @JsonField(name = "full_name", required = true)
    public String name;
    
    @JsonField(name = "years_old")
    public int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
