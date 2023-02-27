package memento;

import java.util.HashMap;
import java.util.Map;

public class BaseDeDatos implements Clonnable {
    private Map<String,Persona> personaList = new HashMap<>();

    public void insertPersona(Persona persona){
        personaList.put(persona.getCi(), persona);
    }

    public Persona getPersona(String ci){
        if (!personaList.containsKey(ci))
            throw new RuntimeException("No existe una Persona con ci: '"+ci+"' en la Base de Datos");
        return personaList.get(ci);
    }

    public void mostrarTodasLasPersonas(){
        for (Persona p: personaList.values()) {
            System.out.println(p);
        }
    }

    private void setPersonaList(Map<String, Persona> personaList) {
        this.personaList = personaList;
    }

    @Override
    public BaseDeDatos clone() {
        BaseDeDatos clone = new BaseDeDatos();
        clone.setPersonaList(new HashMap<>(this.personaList));
        return clone;
    }
}
