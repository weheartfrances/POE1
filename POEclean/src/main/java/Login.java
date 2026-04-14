
public class Login {
    private String username;
    private String password;
  
// Constructor added for better personal understanding
    
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public boolean checkUsername() { 
    return username.contains("-") && username.length() <= 5;
    }
    }
