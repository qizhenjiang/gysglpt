package wanda.base.service;

import java.util.List;

import wanda.base.pojo.po.Sysuser;
import wanda.base.pojo.vo.ActiveUser;
import wanda.base.pojo.vo.SysuserCustom;
import wanda.base.pojo.vo.SysuserQueryVo;

public interface UserService {
	
	
	public   List<SysuserCustom>   findList(SysuserQueryVo    sysuserQueryVo);
	public  Sysuser selectByPrimaryKey(String id);
	public     List<SysuserCustom>   findquerylist(SysuserQueryVo    sysuserQueryVo );
	public  int    count(SysuserQueryVo    sysuserQueryVo);
	
	public     void  insertSysuser(SysuserQueryVo    sysuserQueryVo)   throws  Exception;
	public Sysuser findSysuserByUserid(String userId) throws Exception;
	
	
	public ActiveUser checkUserInfo(String userid, String pwd) throws Exception;
	
	
	
	
	


}
