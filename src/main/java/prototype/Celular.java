package prototype;

import java.util.List;

public class Celular implements ICelular{

    private String modelo;
    private String tamanio;
    private int procesadores;
    private String memoria;
    private Sim sim;
    private String versionAndroid;
    private int camaras;
    private boolean bluetooth;
    private int memoriasExternas;
    private String tiempoUsoDeBateria;
    private List<String> accesorios;

    @Override
    public Celular clone() {
        Celular clone = new Celular();

        clone.setModelo(this.modelo);
        clone.setTamanio(this.tamanio);
        clone.setProcesadores(this.procesadores);
        clone.setMemoria(this.memoria);
        clone.setSim(this.sim);
        clone.setVersionAndroid(this.versionAndroid);
        clone.setCamaras(this.camaras);
        clone.setBluetooth(this.bluetooth);
        clone.setMemoriasExternas(this.memoriasExternas);
        clone.setTiempoUsoDeBateria(this.tiempoUsoDeBateria);
        clone.setAccesorios(this.accesorios);

        return clone;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getProcesadores() {
        return procesadores;
    }

    public void setProcesadores(int procesadores) {
        this.procesadores = procesadores;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public int getCamaras() {
        return camaras;
    }

    public void setCamaras(int camaras) {
        this.camaras = camaras;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getMemoriasExternas() {
        return memoriasExternas;
    }

    public void setMemoriasExternas(int memoriasExternas) {
        this.memoriasExternas = memoriasExternas;
    }

    public String getTiempoUsoDeBateria() {
        return tiempoUsoDeBateria;
    }

    public void setTiempoUsoDeBateria(String tiempoUsoDeBateria) {
        this.tiempoUsoDeBateria = tiempoUsoDeBateria;
    }

    public List<String> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(List<String> accesorios) {
        this.accesorios = accesorios;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
