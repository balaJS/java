import java.sql.*;

class Db {
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/song","root","");
		} catch (Exception e) {
			System.out.println("Connection failed.");
		}
		return conn;
	}

	public static short save(Song song) {
		short status = 0;
		Connection conn = Db.getConn();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("insert into song (id, title, singer, company) values(?, ?, ?, ?)");
			ps.setInt(1, song.getId());
			ps.setString(2, song.getTitle());
			ps.setString(3, song.getSinger());
			ps.setString(4, song.getCompany());

			status = (short) ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}
