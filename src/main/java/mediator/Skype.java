package mediator;

import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalComunication {

    private Map<String, Profesional> chat = new HashMap<>();

    public Skype addProfesionalToTheChat(Profesional profesional) {
        chat.put(profesional.getCi(),profesional);
        return this;
    }

    @Override
    public void send(String message, Profesional persona) {
        for (String ci : chat.keySet()) {
            Profesional prof = chat.get(ci);
            if (!persona.getCi().equals(ci)) {
                prof.received(message);
            }
        }
    }
}
