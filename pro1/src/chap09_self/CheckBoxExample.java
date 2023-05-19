package chap09_self;

public class CheckBoxExample {

	public static void main(String[] args) {
		CheckBox ckbx = new CheckBox();
		ckbx.OnSelectListener(new BackgroundChangeListener());
		ckbx.select();
	}

}
