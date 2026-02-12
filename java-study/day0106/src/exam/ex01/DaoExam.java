package exam.ex01;

public class DaoExam {
	
	public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
        System.out.println();
    }
	
	public static void main(String[] args) {
		
		DataAccessObject oracleDao = new OracleDAO();
        DataAccessObject mySqlDao = new MySQLDAO();

        dbWork(oracleDao);
        dbWork(mySqlDao);
	}
}
