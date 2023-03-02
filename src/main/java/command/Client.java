package command;

public class Client {
    public static void main (String []args){
        Personaje personaje = new Personaje("Mario", 2, 200);

        ICommand correr = new Correr(personaje);
        ICommand saltar = new Saltar(personaje);
        ICommand golpear = new Golpear(personaje);
        ICommand cubrirse = new Cubrirse(personaje);
        ICommand curarse = new Curarse(personaje);

        GeneradorAcciones nivel1 = new GeneradorAcciones("Correr");
        nivel1.addCommand(correr);

        GeneradorAcciones nivel2 = new GeneradorAcciones("Regeneracion");
        nivel2.addCommand(cubrirse)
                .addCommand(curarse);

        GeneradorAcciones nivel3 = new GeneradorAcciones("Atacar");
        nivel3.addCommand(saltar)
                .addCommand(correr)
                .addCommand(golpear);

        GeneradorAcciones nivel4 = new GeneradorAcciones("Contraataque");
        nivel4.addCommand(correr)
                .addCommand(saltar)
                .addCommand(correr)
                .addCommand(saltar)
                .addCommand(cubrirse)
                .addCommand(golpear)
                .addCommand(curarse)
                .addCommand(correr);

        nivel1.run();
        nivel2.run();
        nivel3.run();
        nivel4.run();
    }
}
