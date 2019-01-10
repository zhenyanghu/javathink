package webservice;

import javax.xml.ws.Endpoint;

/**
 * Created by Rocky on 2017/9/25.
 */
public class WeatherServer {

    public static void main(String[] args) {
        String address = "http://127.0.0.1:12345/weather";
        WeatherInterfaceImpl impl = new WeatherInterfaceImpl();
        //String result =  impl.getWeatherByCity("北京");
        Endpoint.publish(address, impl);
    }
}
