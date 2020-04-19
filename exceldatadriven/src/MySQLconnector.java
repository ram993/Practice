import java.sql.*;

public class MySQLconnector {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8080/Datacheck");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM Cars_check");

        while(resultSet.next()){
            System.out.println(resultSet.getString(1));
        }


    }
}
