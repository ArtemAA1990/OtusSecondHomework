import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources({"classpath:${browser}.properties"})
public interface WebConfig extends Config {

    WebConfig BASE_CONFIG = ConfigFactory.create(WebConfig.class, System.getProperties());

    @Key("browser")
    String getBrowser();
}