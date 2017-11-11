package tk.scompo.programmone.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Index {@link Controller}.
 */
@Controller
@RequestMapping("/")
public class IndexController {

	/**
	 * Returns the index page for the application.
	 * 
	 * @return the index page for the application.
	 */
	@RequestMapping
	public String index() {
		return "index";
	}
}
