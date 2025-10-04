public class User {
    @Length(min = 3, max = 50)
    public String username;
    
    @Length(min = 6)
    public String password;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}