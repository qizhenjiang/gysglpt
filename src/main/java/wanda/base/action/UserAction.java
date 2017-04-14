package wanda.base.action;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wanda.base.pojo.vo.PageQuery;
import wanda.base.pojo.vo.SysuserCustom;
import wanda.base.pojo.vo.SysuserQueryVo;
import wanda.base.process.content.Config;
import wanda.base.process.result.DataGridResultInfo;
import wanda.base.process.result.ResultInfo;
import wanda.base.process.result.ResultUtil;
import wanda.base.process.result.SubmitResultInfo;
import wanda.base.service.UserService;

@Controller
@RequestMapping("/user")
public class UserAction {
	@Autowired
	private UserService   userservice;
	
	
	@RequestMapping("/query")
	public  String  query(){
		return "/base/user/queryuser";
		
	}  
	
	//将java对象转换为json
	@RequestMapping("/findlist")
	public  @ResponseBody    DataGridResultInfo    querylist(SysuserQueryVo  sysuserQueryVo,
			int page,//页码
			int rows//每页显示个数
			){
		
		
		
	System.out.println(page);
		//非空校验
		sysuserQueryVo = sysuserQueryVo!=null?sysuserQueryVo:new SysuserQueryVo();
		int total=userservice.count(sysuserQueryVo);
			
		PageQuery   pageQuery=new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		sysuserQueryVo.setPageQuery(pageQuery);
		
		List<SysuserCustom>   list=userservice.findquerylist(sysuserQueryVo);
		
		DataGridResultInfo   dataGridResultInfo=new  DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		
		return dataGridResultInfo;
	} 
	
	
	//添加用户页面
	@RequestMapping("/addsysuser")
	public String addsysuser(Model model)throws Exception{
		
		return "/base/user/addsysuser";
	}
	
	
	@RequestMapping("/addsysusersubmit")
	public  @ResponseBody   SubmitResultInfo   addsysusersubmit(SysuserQueryVo  sysuserQueryVo)  throws  Exception{
	
		
		userservice.insertSysuser(sysuserQueryVo);
		
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
		
		
		
	}
	
	
	
}
