package p354ex;

public class MsSQLDao implements UserInfoDao {

	@Override
	public void driver() {
		System.out.println("MsSQLDao.driver() 실행");
	}

	@Override
	public void url() {
		System.out.println("MsSQLDao.url() 실행");
	}

	@Override
	public void username() {
		System.out.println("MsSQLDao.username() 실행");
	}

	@Override
	public void password() {
		System.out.println("MsSQLDao.password() 실행");
	}
}
