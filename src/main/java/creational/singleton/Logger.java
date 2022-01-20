package creational.singleton;

import java.util.ArrayList;
import java.util.List;

public final class Logger {

    private static Logger instance = new Logger();
    private final ArrayList<String> logs = new ArrayList<>();

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public String log(String message) {
        logs.add(message);
        return message;
    }
    public int printLogCount() {
        return logs.size();
    }
    public List<String> getLogs() {
        return logs;
    }
}