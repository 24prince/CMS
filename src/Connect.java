
import java.sql.*;

public class Connect 
{

    /*private static final String URL="jdbc:sqlserver://208.91.198.174:1433;/databaseName=iihsdb";    
    private static final String USER="prince";
    private static final String PASS="Prince@123"; */
    private static final String URL="jdbc:sqlserver://DESKTOP-B0JPMER\\SQLEXPRESS:1433;databaseName=iihs_db;user=prince;password=giri";    
    
//    private static final String url="jdbc:mysql://sql6.freesqldatabase.com:3306/sql6461993";
//    private static final String user="sql6461993";
//    private static final String pass="giri@123";
    
    public static final Connection connect() throws Exception
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection(URL);
        return con;        
    }
}
