package observer;

public class Client {
    public static void main(String[] args) {
        CompaniaTelefonica entel = new CompaniaTelefonica();
        Persona p1 = new Persona("Pedro", "243252");
        Persona p2 = new Persona("Maria", "125343");
        Persona p3 = new Persona("Eynar", "784358");

        p1.addTipoNotificacion("premios")
                .addTipoNotificacion("promociones");

        p2.addTipoNotificacion("noticias");

        p3.addTipoNotificacion("precios_llamadas")
                .addTipoNotificacion("promociones")
                .addTipoNotificacion("premios")
                .addTipoNotificacion("noticias");

        entel.attach(p1);
        entel.attach(p2);
        entel.attach(p3);

        Anuncio a1 = new Anuncio("Precios actualizados!!",
                "Los precios de las llamadashan sido actualizados, " +
                        "visite la siguiente pagina para mas informacion: entel.com",
                "precios_llamadas");
        Anuncio a2 = new Anuncio("Promocion Navideña",
                "Instala tu conexion por fibra optica a solo 1Bs",
                "promociones");
        Anuncio a3 = new Anuncio("Sorteo Carnavalero",
                "El dia 10 de marzo se realizará el sorteo de 5000Bs",
                "premios");
        Anuncio a4 = new Anuncio("Noticia de último momento",
                "El Gerente de la compañia ha dejado el cargo",
                "noticias");

        entel.notifyClients(a2);
        entel.notifyClients(a1);
        entel.notifyClients(a4);
        entel.notifyClients(a3);


    }
}
