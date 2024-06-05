public class LogInUser extends LogIn {
	
	@Override
    public void log (User user, ISQL sql) {
        System.out.println("Has access to the website");
        sql.insertUserInDatabase(user);
        // Logic
    }    
}

