public class LogInAdmin extends LogIn {
    
	@Override
    public void log (User user, ISQL sql) {        
        System.out.println("Has access to the website in admin mode");
        // Logic
    }
}


