package mana.base.dao.mapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;
import wanda.base.pojo.po.Sysuser;

public class SysuserMapperTest extends TestCase {
	
	
	
	private ApplicationContext  applicationContext;
	
	

	

	protected void setUp() throws Exception {
		applicationContext=	new ClassPathXmlApplicationContext(new String[]{
			
			"spring/applicationContext.xml",
			"spring/applicationContext-dao.xml"
			
	});
	
	}

	protected void tearDown() throws Exception {

	}

	public void testFindbyid() {
//		SysuserMapper	sysuserMapper=(SysuserMapper) applicationContext.getBean("sysuserMapper");
//	Sysuser  sysuser=	sysuserMapper.findbyid("199");
//	System.out.println(sysuser.getUsername());
	}

}
