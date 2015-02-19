package fi.androidconsulting.maventa;

import com.maventa.secure.v11.MaventaApiPort;
import com.maventa.secure.v11.MaventaServiceLocator;
import org.junit.Test;

import java.net.URL;

public class LocatorTest {
    @Test
    public void thisAlwaysPasses() throws Exception{
        MaventaServiceLocator locator = new MaventaServiceLocator();
        MaventaApiPort port = locator.getMaventaApiPort(new URL("https://testing.maventa.com/apis/v1.1/api/"));
        org.junit.Assert.assertEquals("Expecting maventa to respond ok from hello world", "Hello from Maventa API v1.1", port.hello_world());
    }
}
