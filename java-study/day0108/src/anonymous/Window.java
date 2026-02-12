package anonymous;

public class Window {
	
	Button btn1 = new Button();
	Button btn2 = new Button();

	//필드로 익명 객체 대입 ==> listener 
	Button.OnclickListener listener = new Button.OnclickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	//생성자 매개값으로 필드 대입 ==> Window()
	public Window() {
		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(new Button.OnclickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}
