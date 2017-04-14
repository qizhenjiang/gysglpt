package mana.base.dao.mapper;




import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import wanda.base.dao.mapper.SysuserMapper;
import wanda.base.pojo.po.Sysuser;
import wanda.base.pojo.po.SysuserExample;
import wanda.util.UUIDBuild;

public class SysuserMapper2Test  {
	
	private ApplicationContext  applicationContext;
	private SysuserMapper  sysuserMapper;
	@Before
	public void setUp() throws Exception {
		
		applicationContext=	new ClassPathXmlApplicationContext(new String[]{
				
				"spring/applicationContext.xml",
				"spring/applicationContext-dao.xml"
				
		});
		sysuserMapper=(SysuserMapper) applicationContext.getBean("sysuserMapper");
	}

	@After
	public void tearDown() throws Exception {
	}
//删除
	public void testDeleteByPrimaryKey() {
		sysuserMapper.deleteByPrimaryKey("199");
	}
	
	
	//增加
	@Test
	public void testInsert() {
		
		
		Sysuser  sysuser=new Sysuser();
		sysuser.setId(UUIDBuild.getUUID());//生成主键
		System.out.println(sysuser.getId());
		
		sysuser.setUserid("");
		sysuser.setUsername("");
		sysuserMapper.insert(sysuser);

	}
//根据多个查询条件进行查询

	public void testSelectByExample() {
		
		SysuserExample   sysuserExample=new SysuserExample();
		  SysuserExample.Criteria  criteria=    sysuserExample.createCriteria();
		  criteria.andUsernameEqualTo("京城石砦村卫生室");
		  criteria.andUseridEqualTo("jcszc");
		  
		 List<Sysuser>  list= sysuserMapper.selectByExample(sysuserExample);
	System.out.println(list.get(0).getUsername()+"---------"+list.get(0).getUserid());
		

	}

//根据主键查询
	public void testSelectByPrimaryKey() {
	Sysuser   sysuser=	sysuserMapper.selectByPrimaryKey("199");
	System.out.println(sysuser.getUsername());

	}

 //根据主键更新  传入po类属性不为空才更新
	public void testUpdateByPrimaryKeySelective() {
		//先设置一个对象
	Sysuser   sysuser=new Sysuser();
	//对象设置id
	sysuser.setId("199");	
	//再设置要更新的值
	sysuser.setUsername("99999999999");	
	sysuserMapper.updateByPrimaryKeySelective(sysuser);
	
	} 

//根据主键更新  不管传入的po类属性是否为空 都更新  
	public void testUpdateByPrimaryKey() {
		//先根据id查询这条值
		Sysuser   sysuser=	sysuserMapper.selectByPrimaryKey("199");
	//然后再更新要更新的数据
		sysuser.setUsername("999999");
		//最后执行方法
		sysuserMapper.updateByPrimaryKey(sysuser);
	}

}
