package DataBaseConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

	/**
	 * @param args
	 */
        public DB() {}

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

