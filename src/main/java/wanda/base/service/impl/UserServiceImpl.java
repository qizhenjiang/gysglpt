package wanda.base.service.impl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import wanda.base.dao.mapper.SysuserMapper;
import wanda.base.dao.mapper.SysuserMapperCustom;
import wanda.base.dao.mapper.UserjdMapper;
import wanda.base.pojo.po.Sysuser;
import wanda.base.pojo.po.SysuserExample;
import wanda.base.pojo.vo.ActiveUser;
import wanda.base.pojo.vo.SysuserCustom;
import wanda.base.pojo.vo.SysuserQueryVo;
import wanda.base.process.content.Config;
import wanda.base.process.result.ExceptionResultInfo;
import wanda.base.process.result.ResultInfo;
import wanda.base.process.result.ResultUtil;
import wanda.base.service.UserService;
import wanda.util.MD5;


public class UserServiceImpl  implements  UserService {
@Autowired   
private   SysuserMapper   sysusermaper;
@Autowired   
private SysuserMapperCustom   sysuserMapperCustom;
@Autowired
private UserjdMapper userjdMapper;

@Override
public List<SysuserCustom> findList(SysuserQueryVo sysuserQueryVo) {

	return sysusermaper.findList(sysuserQueryVo);
}

@Override
public Sysuser selectByPrimaryKey(String id) {
	
	return sysusermaper.selectByPrimaryKey(id);
}

@Override
public List<SysuserCustom> findquerylist(SysuserQueryVo sysuserQueryVo) {

	return sysuserMapperCustom.findquerylist(sysuserQueryVo);
}

@Override
public int count(SysuserQueryVo sysuserQueryVo) {

	return sysuserMapperCustom.count(sysuserQueryVo);
}


public Sysuser findSysuserByUserid(String userId) throws Exception {
	SysuserExample sysuserExample = new SysuserExample();
	SysuserExample.Criteria criteria = sysuserExample.createCriteria();
	// 设置查询条件，根据账号查询
	criteria.andUseridEqualTo(userId);
	List<Sysuser> list = sysusermaper.selectByExample(sysuserExample);

	if (list != null && list.size() == 1) {
		return list.get(0);
	}
	return null;
}

@Override
public void insertSysuser(SysuserQueryVo sysuserQueryVo) throws Exception {
		
  SysuserCustom   sysuserCustom=	sysuserQueryVo.getSysuserCustom();
  Sysuser   sysuser=this.findSysuserByUserid(sysuserCustom.getUserid());
  if(sysuser!=null){
ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 213, null));
  }

	sysusermaper.insert(sysuserCustom);
}

@Override
public ActiveUser checkUserInfo(String userid, String pwd) throws Exception {

	// 校验用户是否存在
	Sysuser sysuser = this.findSysuserByUserid(userid);
	if (sysuser == null) {
		// 用户不存在
		ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 101,
				null));

	}
	
	
	
	// 校验用户密码是否合法
	String pwd_db = sysuser.getPwd();// md5密文
	String pwd_md5 = new MD5().getMD5ofStr(pwd);
	if (!pwd_db.equalsIgnoreCase(pwd_md5)) {
		// 用户名或密码错误
		ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 114,
				null));
	}
	
	
	// 构建用户身份信息
	ActiveUser activeUser = new ActiveUser();
	activeUser.setUserid(userid);
	activeUser.setUsername(sysuser.getUsername());
	activeUser.setGroupid(sysuser.getGroupid());
	activeUser.setSysid(sysuser.getSysid());// 单位id（重要）
	
	
	return activeUser;
}


}






	
	

