package hex.test.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import leon.ssi.dao.LoginDAO;
import leon.ssi.model.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class crud {
	
	@Autowired
	LoginDAO loginDAO;
	
	@Test
	public void r_test() throws Exception{
		Map<String,String> map = new HashMap<String, String>();
			map.put("abc", "abc");
		List<User> ls = loginDAO.getUserListByParam(map);
		for (User u : ls){
			System.out.println(u);
		}
	}

}
