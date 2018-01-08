package my.test.app.myspringboot.prf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(path = "/hallo", method = RequestMethod.GET)
	public String sayOk() {
		return "ok von mytestbranch";
	}

}
