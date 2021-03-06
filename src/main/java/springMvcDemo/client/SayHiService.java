
package springMvcDemo.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SayHiService", targetNamespace = "http://service.springMvcDemo/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SayHiService {


    /**
     * 
     * @param name
     */
    @WebMethod(operationName = "SayHi")
    @Action(input = "http://service.springMvcDemo/SayHiService/SayHiRequest", output = "http://service.springMvcDemo/SayHiService/SayHiResponse")
    public void sayHi(
        @WebParam(name = "name", partName = "name")
        String name);

    /**
     * 
     */
    @WebMethod(operationName = "SayHiDefault")
    @Action(input = "http://service.springMvcDemo/SayHiService/SayHiDefaultRequest", output = "http://service.springMvcDemo/SayHiService/SayHiDefaultResponse")
    public void sayHiDefault();

    /**
     * 
     * @param clientTime
     * @return
     *     returns int
     */
    @WebMethod(operationName = "CheckTime")
    @WebResult(partName = "return")
    @Action(input = "http://service.springMvcDemo/SayHiService/CheckTimeRequest", output = "http://service.springMvcDemo/SayHiService/CheckTimeResponse")
    public int checkTime(
        @WebParam(name = "clientTime", partName = "clientTime")
        XMLGregorianCalendar clientTime);

}
