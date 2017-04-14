package wanda.base.action;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import wanda.base.pojo.po.Sysuser;
import wanda.base.service.UserService;



@Controller

public class FirstAction {
	
	@Autowired
	private UserService   userservice;
	@RequestMapping("/first")
	public  String  first(Model   model){
		
		Sysuser    sysuser=userservice.selectByPrimaryKey("199");
		model.addAttribute("sysuser", sysuser);
		
		return "/base/first";
		
	}  

	@RequestMapping("/welcome")
	public  String  welcome(){
		return "/base/welcome";
		
}
}