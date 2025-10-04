@Role("ADMIN")
@Role("USER")
@Role("MODERATOR")
public class AdminUser {
    @SuppressWarnings("unused")
    private String name;
    
    public AdminUser(String name) {
        this.name = name;
    }
}
