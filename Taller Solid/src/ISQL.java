
public interface ISQL {
	public void insert(String statement);
    public void select(String statement);
    public void delete(String statement);
    public void update(String statement);
    public void insertUserInDatabase(User user);
}
