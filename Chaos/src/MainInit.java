import java.awt.Dimension;
import java.awt.Toolkit;

import com.java.constants.Constants;

public class MainInit {
	public MainInit() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Constants.windowWidth = (int)screenSize.getWidth();
		Constants.windowHeight = (int)screenSize.getHeight();
	}
}
