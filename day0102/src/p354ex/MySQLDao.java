package p354ex;

public class MySQLDao implements UserInfoDao {

	@Override
	public void driver() {
		System.out.println("MySQLDao.driver() 실행");
	}

	@Override
	public void url() {
		System.out.println("MySQLDao.url() 실행");
	}

	@Override
	public void username() {
		System.out.println("MySQLDao.username() 실행");
	}

	@Override
	public void password() {
		System.out.println("MySQLDao.password() 실행");
	}
}
