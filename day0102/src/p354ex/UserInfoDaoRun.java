package p354ex;

public class UserInfoDaoRun {

	public static void main(String[] args) {
		
		UserInfoDao uid1 = new OracleDao();
		UserInfoDao uid2 = new MySQLDao();
		UserInfoDao uid3 = new MsSQLDao();
		
//		uid1.driver();
//		uid1.url();
//		uid1.username();
//		uid1.password();
		
		uid1.templeteMethod(); //위 코드 4줄을 1줄로 요약 가능
		uid2.templeteMethod();
		uid3.templeteMethod();
	}
}
