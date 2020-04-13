/**
 * 
 */
package exp17b.di.dis.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author ilker
 *
 */
@Service
public class Service1 implements EchoService {
	private static final Logger logger = LoggerFactory.getLogger(Service1.class);
	
	@Override
	public String echoService(String msg) {
		logger.debug("BEF Service1.echoService({})", msg);
		return msg;
	}
}
