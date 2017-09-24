package springMvcDemo;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import springMvcDemo.client.SayHiService;
import springMvcDemo.client.SayHiServiceImplService;

public class ClientMain {

	public static void main(String[] args) throws DatatypeConfigurationException {
		// TODO Auto-generated method stub
		SayHiService service = new SayHiServiceImplService().getSayHiServiceImplPort();
		service.sayHiDefault();
		service.sayHi("tom");
		GregorianCalendar calender = new GregorianCalendar();
		calender.setTime(new Date(System.currentTimeMillis()));
		XMLGregorianCalendar xmldate = DatatypeFactory.newInstance().newXMLGregorianCalendar(calender);
		System.out.println(service.checkTime(xmldate));
	}

}
