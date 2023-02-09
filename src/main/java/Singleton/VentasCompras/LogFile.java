package Singleton.VentasCompras;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;

public class LogFile {
    private static LogFile logFile = new LogFile();
    private File file;
    private Calendar calendar = Calendar.getInstance();

    private LogFile() {
        try {
            file = new File("src\\main\\java\\Singleton\\VentasCompras\\log.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static LogFile getInstance() {
        return logFile;
    }

    public void writeLog(String logMessage) {
        try {
            String now = calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND)+":"+calendar.get(Calendar.MILLISECOND);
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(now+"  "+logMessage);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
