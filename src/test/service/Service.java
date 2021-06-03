package test.service;

import test.dao.TestDao;
import test.service.Service;
import test.dao.TestDao;

public class Service {
	private static Service service = new Service();
	private Service() {}
	private TestDao dao = TestDao.getInstance();
	public static Service getInstance(){
		return service;
	}
	public boolean login(String id, String pwd) {
		return dao.login(id,pwd);
	}
}
