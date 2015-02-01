package leon.ssi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class apptest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		ApplicationContext ctx = new FileSystemXmlApplicationContext(path
//				+ "\\src\\main\\resources\\spring\\applicationContext.xml");
//		+ "\\src\\main\\resources\\spring\\testContext.xml");
		+ "\\src\\main\\resources\\spring\\bean.xml");
		System.out.println("end...");
	}

}
