package problem01;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Boolean> settings = new HashMap<>();

        settings.put("newUI", false);
        settings.put("darkTheme", true);

        ConfigurationManager configurationManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configurationManager2 = ConfigurationManager.getInstance();

        configurationManager1.printSettings();

        configurationManager1.loadSettings(settings);
        configurationManager1.printSettings();

        configurationManager1.changeSetting("newUI", true);
        configurationManager1.changeSetting("darkTheme", false);
        configurationManager1.changeSetting("ipv6", true);
        configurationManager1.printSettings();

        configurationManager2.printSettings();
    }
}
