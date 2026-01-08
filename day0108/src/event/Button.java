package event;

public class Button {
	
	OnclickListener listener;
	
	void setOnClickListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnclickListener {
		void onClick();
	}
}
