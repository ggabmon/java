package chap09_self;

public class BackgroundChangeListener implements CheckBox.OnSelectListener {

	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다.~~~"); 
		
	}
	
	/*
	 * public void onSelect() { System.out.println("배경을 변경합니다."); }
	 */
	
	
}
