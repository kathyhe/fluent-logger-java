import java.util.HashMap;
import java.util.Map;
import org.fluentd.logger.FluentLogger;

public class main {
	private static FluentLogger LOG = FluentLogger.getLogger("app");

    public void doApplicationLogic() {
        // ...
        Map<String, String> data = new HashMap<String, String>();
        data.put("from", "userA");
        data.put("to", "userB");
        LOG.log("follow", data);
        // ...
    }
	
}


