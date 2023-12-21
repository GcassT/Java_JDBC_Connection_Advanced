package datos;

import java.sql.*;

public class Conexion {
    //ATRIBUTOS DE LA CLASE
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test_jdbc?useSSL=false&useTimeZone=true&serverTimeZone=UTC$allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "gi18052930";

    //MÉTODOS PROPIOS DE LA CLASE
    public static Connection getConnection() throws SQLException {
      return DriverManager.getConnection(JDBC_URL,JDBC_USER, JDBC_PASSWORD);
    };

    //Utilizamos sobre carga en el método close pues al finalizar el proceso de conexion y consulta se deben cerrar todos los cursores
    public static void close(ResultSet rs) throws SQLException{
         rs.close();
    };

    public static void close(Statement stmnt) throws SQLException {
        stmnt.close();
    }

    public static void close(PreparedStatement stmnt) throws SQLException {
        stmnt.close();
    }

    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}
