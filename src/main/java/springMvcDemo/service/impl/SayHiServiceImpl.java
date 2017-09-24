package springMvcDemo.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import springMvcDemo.service.SayHiService;

@WebService(endpointInterface = "springMvcDemo.service.SayHiService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class SayHiServiceImpl implements SayHiService{

	public void SayHiDefault() {
		System.out.println("Hi, Johness!");
	}

	public void SayHi(String name) {
		System.out.println("Hi, " + name + "!");
	}

	public int CheckTime(Date clientTime) {
		String dateServer = new java.sql.Date(System.currentTimeMillis()).toString()
		+ " "
		+ new java.sql.Time(System.currentTimeMillis());
		String dateClient = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(clientTime);
		return dateServer.equals(dateClient) ? 1 : 0;
	}
	
}
