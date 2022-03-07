import java.sql.*;
public class Jdbc {

// JDBC - Java Database Connectivity

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        System.out.println("Start");

        String className = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/trains";
        String sql = "SELECT * FROM trains.users";
        String user = "root";
        String password = "Kddhamo@24";

        Class.forName(className);
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()) {
            System.out.println(rs.getString(1) + " " +
                    rs.getString(2)+" " +
                    rs.getString(3));
        }
        System.out.println("End");
    }
}

