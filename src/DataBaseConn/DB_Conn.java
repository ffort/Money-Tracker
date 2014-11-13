package DataBaseConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Conn {
	
	private static final String USERNAME = "drico7041";
	private static final String PASSWORD = "gastate23";
	private static final String CONN_STRING = "jdbc:mysql://www.db4free.net:3306/bankdricnando";
	private static Connection conn = null;
	public static void main(String[] args) throws SQLException {
		
        DB db = new DB();
        Connection conn=db.dbConnect(CONN_STRING,USERNAME,PASSWORD);
       
        
        db.dbClose(conn);
        
       /* try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" Unable to load driver. ");
        }

        try {
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
             System.out.println(" Connection Established. ");
        } catch (SQLException e) {
            System.out.println(" Error connecting to database:  "
                    + e);
        }
	*/
        }

}
