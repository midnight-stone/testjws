package springMvcDemo;

import javax.xml.ws.Endpoint;

import springMvcDemo.service.impl.SayHiServiceImpl;
/**
 * main方法发布
 * @author Administrator
 *
 */
public class ServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:8080/testjws/service/sayHi", new SayHiServiceImpl());
	}

}
