package leon.ssi.test;

import java.util.HashMap;
import java.util.Map;

import leon.ssi.dao.LoginDAO;
import leon.ssi.dao.StudentDAO;
import leon.ssi.dao.impl.LoginDAOImpl;
import leon.ssi.model.Student;
import leon.ssi.service.LoginService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class apptest {
	
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
		String path = System.getProperty("user.dir");
		ApplicationContext ctx = new FileSystemXmlApplicationContext(path
				+ "\\src\\main\\resources\\spring\\applicationContext.xml");
		// + "\\src\\main\\resources\\spring\\testContext.xml");
		// + "\\src\\main\\resources\\spring\\bean.xml");
		
//		LoginService ls = (LoginService) ctx.getBean("loginServiceImpl");
//		Map search = new HashMap<String, String>();
//		search.put("abc", "abc");
//		ls.getUserListByParam(search);
//
//		LoginDAO ldao = (LoginDAO) ctx.getBean("loginDAOImpl");
//		ldao.queryRoleAsList();
		
//		StudentDAO sdao = (StudentDAO) ctx.getBean("studentDAOImpl");
//		Map addstu = new HashMap<String, String>();
//		addstu.put("stdId", "99");
//		addstu.put("stdName", "b2");
//		sdao.addStudent(addstu);
		
		simpleJDBC jdbc = (simpleJDBC)ctx.getBean("simpleJDBC");
		
		jdbc.getJdbc().update("INSERT INTO t_student (student_id,student_name) VALUES ('98','d11');");

		System.out.println("end...");
	}

}
