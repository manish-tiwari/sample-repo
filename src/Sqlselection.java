import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sqlselection 
    {
        public static void main(String[] args)
        {
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                String userName = "sa";
                String password = "pass$123";
                String url = "jdbc:sqlserver://localhost:1433"+";databaseName=employee";
                Connection con = DriverManager.getConnection(url, userName, password);
                Statement s1 = con.createStatement();
                ResultSet rs = s1.executeQuery("SELECT * FROM Employee");
                String[] result = new String[20];
                if(rs!=null){
                    while (rs.next()){
                    	System.out.println(rs);
                    }
                }

                //String result = new result[20];

            } catch (Exception e)
            {
                e.printStackTrace();
            }
    }


}