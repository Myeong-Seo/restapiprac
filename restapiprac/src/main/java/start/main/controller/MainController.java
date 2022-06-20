package start.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import start.main.model.Project;
import start.main.service.InfoService;

@RestController
public class MainController {
	
	private InfoService info;
	
	public MainController(InfoService info) {
		this.info = info;
	}
	
	@GetMapping("/main")
	public Project main() {
		Project pro = info.getProjectInfo();
		return pro;
	}
	
}
