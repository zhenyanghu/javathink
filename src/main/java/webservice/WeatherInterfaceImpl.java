package webservice;

import javax.jws.WebService;

/**
 * Created by Rocky on 2017/9/25.
 * SEI的实现类
 */
//必须的加上@WebService注解
@WebService
public class WeatherInterfaceImpl implements WeatherInterface {
    @Override
    public String getWeatherByCity(String city) {
        System.out.println("接收客户端发送的城市名称：" + city);

        // 查询天气
        String result = "今天好冷。。。";
        System.out.println("返回天气信息：" + result);
        return result;
    }
}
