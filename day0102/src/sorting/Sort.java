package sorting;

public interface Sort {
	
	void ascending(int[] arr);
	void descending(int[] arr);
	
	//자바 8부터 default 예약어를 명시하면 기본 메서드로 사용 가능
	default void description() { 
		System.out.println("정렬 알고리즘입니다.");
	}
}
