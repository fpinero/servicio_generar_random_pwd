package com.fpe.srv_random_pwd;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PwdController {
	
	java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
	
	@GetMapping(value = "genpwd", produces=MediaType.TEXT_PLAIN_VALUE)
	public String generatePwd() {
		
		PwdLogic pwdLogic = new PwdLogic();
						
		String passwd = pwdLogic.generatePassayPassword();
		
		logger.info("passwd generada=" + passwd);
		
		return "--> su passwd solicitada es: " + passwd;
		
	}

}
