package prototype;

import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        Celular cel1 = new Celular();
        cel1.setModelo("SamsungR10");
        cel1.setBluetooth(true);
        cel1.setMemoria("4GB");
        cel1.setCamaras(3);
        cel1.setMemoriasExternas(0);
        cel1.setProcesadores(4);
        cel1.setVersionAndroid("8-Oreo");
        cel1.setTamanio("15cm");
        cel1.setTiempoUsoDeBateria("48 Horas");
        cel1.setSim(new Sim("Entel","9876543"));
        cel1.setAccesorios(List.of("Audifonos", "Cargador", "Estuche"));

        // Clones
        Celular cel2 = cel1.clone();
        cel2.setSim(new Sim("Tigo","8769432"));
        Celular cel3 = cel1.clone();
        cel3.setSim(new Sim("Tigo","1234567"));
        Celular cel4 = cel1.clone();
        cel4.setSim(new Sim("Entel","7584932"));
        Celular cel5 = cel1.clone();
        cel5.setSim(new Sim("Viva","3849200"));

    }
}
