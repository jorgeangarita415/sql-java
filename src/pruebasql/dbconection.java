package pruebasql;

import java.sql.*;

/**
 *
 * @author jade
 */
public class dbconection {
    static String url = "jdbc:mysql://localhost:3306/sis_ventas";  // 
    static String user = "root";
    static String pass = "";

    public static Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }

        return con;
    }
}
