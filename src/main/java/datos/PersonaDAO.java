package datos;

import domain.Persona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static datos.Conexion.*;

public class PersonaDAO {
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";

    //MÉRTODOS PROPIOS DE LA CLASE

    //Método para obtener los objetos persona de la base de datos
    public List<Persona> getPersonas(){
        Connection conn = null;
        PreparedStatement statament = null;
        ResultSet resultado = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        //Nos conectamos a la base de datos
        try {
            conn = getConnection();
            statament = conn.prepareStatement(SQL_SELECT);
            resultado = statament.executeQuery();
            while(resultado.next()){
                int idPersona = resultado.getInt("id_persona");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String email = resultado.getString("email");
                String telefono = resultado.getString("telefono");

                persona = new Persona(idPersona, nombre, apellido, email, telefono);

                personas.add(persona);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(resultado);
                Conexion.close(statament);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return personas;
    }
}
