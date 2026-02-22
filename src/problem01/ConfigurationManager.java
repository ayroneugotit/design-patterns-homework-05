package problem01;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance = null;
    private Map<String, Boolean> settings = new HashMap<>();

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void loadSettings(Map<String, Boolean> settings) {
        this.settings = settings;
    }

    public void changeSetting(String setting, boolean value) {
       settings.put(setting, value);
    }

    public void printSettings() {
        System.out.println("-------------------------[SETTINGS]-------------------------");
        if (settings.isEmpty()) {
            System.out.println("Settings are empty");
        } else {
            for (Map.Entry<String, Boolean> e : settings.entrySet()) {
                System.out.println("[" + e.getKey() + "]: " + e.getValue());
            }
        }
        System.out.println("------------------------------------------------------------");
    }
}
