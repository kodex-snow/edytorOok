package kot.kotsnow.ookEditor;

public class Style {

	private static String openTagKeyword="<font color=\"red\">";
	private static String closeTagKeyword="</font>";

	public String getOpenTagKeyword() {
		return openTagKeyword;
	}

	public String getCloseTagKeyword() {
		return closeTagKeyword;
	}

	public void setFontColor(double red, double green, double blue) {
		Style.openTagKeyword = "<font color=\"rgb("+red+","+green+","+blue+")\">";
		System.out.println(openTagKeyword);
	}


}
//Ook! Ook!