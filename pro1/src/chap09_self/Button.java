package chap09_self;

public class Button {
	static interface OnClickListner{
		void onClick();
	}
	
	OnClickListner listner;
	
	void setOnClickListner(OnClickListner listner) {
		this.listner = listner;
	}
	
	void touch() {
		listner.onClick();
	}
	
	
}
