package wanda.base.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wanda.base.pojo.po.Sysuser;
import wanda.base.pojo.po.SysuserExample;
import wanda.base.pojo.vo.SysuserCustom;
import wanda.base.pojo.vo.SysuserQueryVo;

public interface SysuserMapper {

    int countByExample(SysuserExample example);


    int deleteByExample(SysuserExample example);


    int deleteByPrimaryKey(String id);

  
    int insert(Sysuser record);


    int insertSelective(Sysuser record);


    List<Sysuser> selectByExample(SysuserExample example);

   
    Sysuser selectByPrimaryKey(String id);


    int updateByExampleSelective(@Param("record") Sysuser record, @Param("example") SysuserExample example);

  
    int updateByExample(@Param("record") Sysuser record, @Param("example") SysuserExample example);


    int updateByPrimaryKeySelective(Sysuser record);

   
    int updateByPrimaryKey(Sysuser record);
    
    List<SysuserCustom> findList(SysuserQueryVo   sysuserQueryVo);
    
}