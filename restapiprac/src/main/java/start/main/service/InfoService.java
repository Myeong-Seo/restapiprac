package start.main.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import start.main.model.Project;

@Service
public class InfoService {
	
	public Project getProjectInfo() {
		
		Project pro = new Project();
		pro.setProjectName("PMS");
		pro.setAuthor("PMS");
		pro.setCreateDate(new Date());
		
		return pro;
		
	}
	
	
}
