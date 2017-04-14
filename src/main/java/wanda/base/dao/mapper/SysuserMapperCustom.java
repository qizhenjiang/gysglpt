package wanda.base.dao.mapper;

import java.util.List;

import wanda.base.pojo.vo.SysuserCustom;
import wanda.base.pojo.vo.SysuserQueryVo;

public interface SysuserMapperCustom {
	
	
	public     List<SysuserCustom>   findquerylist(SysuserQueryVo    sysuserQueryVo );
	
	
	public  int    count(SysuserQueryVo    sysuserQueryVo);

}
