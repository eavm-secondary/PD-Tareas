package command;

// concrete object
public class Personaje {
    private String nombre;
    private int nivel;
    private int salud;

    public Personaje(String nombre, int nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    //actions

    public void saltar(){
        System.out.println(nombre+"> salta");
    }

    public void correr(){
        System.out.println(nombre+"> corre");
    }

    public void golpear(){
        System.out.println(nombre+"> golpea");
    }
    public void cubrirse(){
        System.out.println(nombre+"> se cubre");
    }
    public void curarse(){
        System.out.println(nombre+"> se cura");
    }


}
