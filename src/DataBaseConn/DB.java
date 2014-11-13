package DataBaseConn;

import java.sql.Connection;
import java.sql.DriverManager;

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
      
                        System.out.println("connected");
                        return conn;
                        
                }
                catch (Exception e)
                {
                        e.printStackTrace();
                        return null;
                }
        }
};

