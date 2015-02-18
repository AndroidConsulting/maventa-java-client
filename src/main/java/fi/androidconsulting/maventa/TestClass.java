package fi.androidconsulting.maventa;


import com.maventa.secure.ApiKeys;
import com.maventa.secure.CompanyParamsOut;
import com.maventa.secure.MaventaApiPort;
import com.maventa.secure.MaventaServiceLocator;

import javax.xml.namespace.QName;
import java.net.URL;

/**
 * Created by jpori on 14.2.15.
 */
public class TestClass {

    public void run() throws Exception {
        MaventaServiceLocator locator = new MaventaServiceLocator();
        MaventaApiPort port = locator.getMaventaApiPort(new URL("https://testing.maventa.com/apis/v1.1/api/"));

        System.out.println(port.hello_world());

    }

    public static final void main(String[] args) throws Exception {
        new TestClass().run();
    }
}
