package test.dao;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wxl.user.dao.UserDao;
import com.wxl.user.dao.UserDaoImpl;
import com.wxl.user.service.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class DaoBlogTest {
	private static Logger logger = Logger.getLogger(DaoBlogTest.class);
	@Resource
	private UserDaoImpl userDaoImpl = null;
	@Autowired
	private UserServiceImpl userService = null;

	@Test
	public void test() {
		// User user = userDao.selectByPrimaryKey(1);
		// System.out.println(user.getName());
//		userService.print(1);
		userService.show();
		// logger.info("值："+user.getUserName());
		// logger.info(JSON.toJSONString(user));
	}

	public static void main(String[] args) {
		try {
			Class<?> forName = Class.forName("com.mysql.jdbc.Driver");
			System.out.println(forName);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
