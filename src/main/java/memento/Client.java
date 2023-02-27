package memento;

public class Client {
    public static void main(String[] args) {
        BackupManager backupManager = new BackupManager();

        BaseDeDatos bd = new BaseDeDatos();

        bd.insertPersona(new Persona("Celle","1985726181",18));
        bd.insertPersona(new Persona("Judie","6992356569",26));
        bd.insertPersona(new Persona("Smitty","0754306593",33));
        bd.insertPersona(new Persona("Roseanne","9805079856",42));
        bd.insertPersona(new Persona("Melly","8139597252",15));
        backupManager.addMemento(new Backup("enero", bd));

        bd.insertPersona(new Persona("Alanna","8699059256",62));
        bd.insertPersona(new Persona("Joann","2595192116",7));
        bd.insertPersona(new Persona("Sarena","3362817831",8));
        bd.insertPersona(new Persona("Steve","6666918207",9));
        bd.insertPersona(new Persona("Lucias","8247910047",10));
        backupManager.addMemento(new Backup("febrero", bd));


        bd.insertPersona(new Persona("Norris","4197902905",11));
        bd.insertPersona(new Persona("Cody","2572459043",12));
        bd.insertPersona(new Persona("Cammi","2504198213",35));
        bd.insertPersona(new Persona("Matilde","2331231923",13));
        bd.insertPersona(new Persona("Germaine","9910355906",16));
        bd.insertPersona(new Persona("Gillian","5588207963",17));
        bd.insertPersona(new Persona("Osmund","7953202042",18));
        bd.insertPersona(new Persona("Osbourn","1969932325",21));
        bd.insertPersona(new Persona("Hewett","3625480751",22));
        bd.insertPersona(new Persona("Julie","4280538727",50));
        backupManager.addMemento(new Backup("marzo", bd));


        bd.insertPersona(new Persona("Leela","2220446611",23));
        bd.insertPersona(new Persona("Siward","4399851414",24));
        bd.insertPersona(new Persona("Sheelagh","9344129681",25));
        bd.insertPersona(new Persona("Thorny","6148036525",15));
        bd.insertPersona(new Persona("Conney","6039818980",26));
        backupManager.addMemento(new Backup("abril", bd));


        bd.insertPersona(new Persona("Lizbeth","7801924274",27));
        bd.insertPersona(new Persona("Kerrill","5178709136",29));
        bd.insertPersona(new Persona("Sioux","0263823008",31));
        bd.insertPersona(new Persona("Rhea","4974436449",32));
        bd.insertPersona(new Persona("Filberto","6407023408",33));
        bd.insertPersona(new Persona("Wileen","8419514306",34));
        bd.insertPersona(new Persona("Egbert","6351643589",20));
        bd.insertPersona(new Persona("Bradford","0990281566",36));
        bd.insertPersona(new Persona("Konstance","6647040463",19));
        bd.insertPersona(new Persona("Andros","0701075902",40));
        bd.insertPersona(new Persona("Nicolai","5198542008",37));
        bd.insertPersona(new Persona("Ilysa","5935006855",14));
        bd.insertPersona(new Persona("Cathrine","2640514113",39));
        bd.insertPersona(new Persona("Maxy","3734516277",41));
        bd.insertPersona(new Persona("Marni","4005396119",42));
        bd.insertPersona(new Persona("Fonsie","0785857559",43));
        bd.insertPersona(new Persona("Ezri","0305371312",28));
        bd.insertPersona(new Persona("Rafaellle","2573751953",44));
        bd.insertPersona(new Persona("Cherey","2740436033",47));
        bd.insertPersona(new Persona("Hilda","4194704444",38));
        bd.insertPersona(new Persona("Derwin","6001606862",45));
        bd.insertPersona(new Persona("Joe","7048285737",46));
        bd.insertPersona(new Persona("Caitrin","5617408704",30));
        bd.insertPersona(new Persona("Idette","4173728867",49));
        bd.insertPersona(new Persona("Carlen","0431028087",48));
        backupManager.addMemento(new Backup("mayo", bd));

        BaseDeDatos bd_enero = backupManager.getMemento(0).getBaseDeDatos();
        BaseDeDatos bd_febrero = backupManager.getMemento(1).getBaseDeDatos();
        BaseDeDatos bd_marzo = backupManager.getMemento(2).getBaseDeDatos();
        BaseDeDatos bd_abril = backupManager.getMemento(3).getBaseDeDatos();
        BaseDeDatos bd_mayo = backupManager.getMemento(4).getBaseDeDatos();

        bd_febrero.mostrarTodasLasPersonas();
    }
}
