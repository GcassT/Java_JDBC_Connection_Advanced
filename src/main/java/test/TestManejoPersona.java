package test;

import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class TestManejoPersona {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        List<Persona> personas = personaDao.getPersonas();

        for (Persona persona: personas) {
            System.out.println("Persona: "+ persona);
        }
    }
}
