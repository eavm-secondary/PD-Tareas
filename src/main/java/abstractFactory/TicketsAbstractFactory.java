package abstractFactory;

import java.util.Map;

public class TicketsAbstractFactory {

    private static Map<String,IPasaje> mapaPasajes = Map.of(
            "stardard",new PasajeStandard(),
            "solidario",new PasajeSolidario(),
            "infente",new PasajeInfante()
    );

    public static IPasaje make(String tipoPasaje){
        return mapaPasajes.getOrDefault(tipoPasaje,new PasajeStandard());
    }
}
