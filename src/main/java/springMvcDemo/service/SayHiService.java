package springMvcDemo.service;

import java.util.Date;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SayHiService {
	
	void SayHiDefault();
	
	void SayHi(@WebParam(name = "name") String name);
	/**
	 * 执行测试的WebService方法(用于时间校验)
	 * @param clientTime 客户端时间
	 * @return 0表示时间校验失败 1表示校验成功
	 */
	int CheckTime(@WebParam(name = "clientTime") Date clientTime);
}
