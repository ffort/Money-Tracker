package DataBaseConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

	/**
	 * @param args
	 */
	
	public static final String USERNAME = "drico7041";
	public static final String PASSWORD = "gastate23";
	public static final String CONN_STRING = "jdbc:mysql://www.db4free.net:3306/bankdricnando";
	public static Connection conn = null;
	
        public DB() {
        	
            try
            {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection conn = DriverManager.getConnection(
                    		CONN_STRING, USERNAME, PASSWORD);
  
                    System.out.println("Database has been connected to " + CONN_STRING);
                    
            }
            catch (Exception e)
            {
                    e.printStackTrace();
            }
        	
        }

        public Connection dbConnect(String db_connect_string,
          String db_userid, String db_password)
        {

            try
            {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection conn = DriverManager.getConnection(
                      db_connect_string, db_userid, db_password);
  
                    System.out.println("Database has been connected to " + db_connect_string);
                    return conn;
                    
            }
            catch (Exception e)
            {
                    e.printStackTrace();
                    return null;
            }
        	
        }
        
        public Connection dbClose(Connection dbconnection){

        	try {
				dbconnection.close();
				System.out.println("Database session has been closed");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return dbconnection;

        }
};

