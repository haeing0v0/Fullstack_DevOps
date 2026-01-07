package exam.ex08;

public class MemberArrayListRun {
	public static void main(String[] args) {
		
		MemberArrayList mal = new MemberArrayList();
		
		Member mb1 = new Member(1001, "홍길동");
		Member mb2 = new Member(1002, "이순신");
		Member mb3 = new Member(1003, "강감찬");
		
		mal.addMember(mb1);
		mal.addMember(mb2);
		mal.addMember(mb3);
		
		mal.showAllMember();
		
		mal.removeMember(1001);
		mal.showAllMember();
		
		mal.insertMember(mb1, 2);
		mal.showAllMember();
	}
}
