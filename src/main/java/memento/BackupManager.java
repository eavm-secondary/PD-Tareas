package memento;

import java.util.ArrayList;
import java.util.List;

public class BackupManager {
    private List<Backup> backupList = new ArrayList<>();

    public BackupManager addMemento(Backup backup){
        backupList.add(backup);
        return this;
    }

    public Backup getMemento(int index){
        return backupList.get(index);
    }


}
