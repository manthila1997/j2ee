import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;


public class registerDao {
	String url = "jdbc:mysql://localhost:3306/users";
	String username = "root";
	String password = "";
	String sql = "select * from actors where name? and pword?";
	String Driver = "com.mysql.jdbc.Driver";
	
	public void loadDriver(String Driver) {
		try {
			Class.forName(Driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	public Connection getConnection() {
		
		Connection con = null;
		try {
			con=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public String insert (Member member) {
		
		Connection con = getConnection();
		loadDriver(Driver);
		
		String result = "data succesful";
		String sql="insert into users.actors values(?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setString(2, member.getPword());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			result = "unsuscces";
		}
		return result;
	}

}
