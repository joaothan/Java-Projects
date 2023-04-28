import java.sql.*;

public class MySQLGet 
{	
    public static void main(String[] args) throws ClassNotFoundException 
{	
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	


     try
{
            // connect to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://root:test@localhost:3306/myschema");

            // create statement
            Statement stmt = conn.createStatement();

            // execute query
            ResultSet rs = stmt.executeQuery("select ID, Name, Age from people");

            // display rows
            while (rs.next()) 
{
                int id = rs.getInt("ID");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                System.out.println(id + ": " + name + ": " + age + ": ");
}

            // close connection
            conn.close();
} 
        catch (SQLException e) 
{
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }
}