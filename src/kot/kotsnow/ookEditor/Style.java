package kot.kotsnow.ookEditor;

public class Style {

	private static String openTagKeyword="<span style=\"color:red\">";
	private static String closeTagKeyword="</span>";
	private Theme theme=Theme.DEFAULT;

	private static Style INSTANCE;

    private Style(){}

    public static Style getInstance(){
        if(INSTANCE==null)
            INSTANCE = new Style();
        return INSTANCE;
    }


	public String getOpenTagKeyword() {
		return openTagKeyword;
	}

	public String getCloseTagKeyword() {
		return closeTagKeyword;
	}

	public void setTheme(Theme theme){
		this.theme = theme;
		setKeywordColor(theme.getKeywordColor());

	}

	private void setKeywordColor(String fontColor) {
		Style.openTagKeyword = "<span style=\"color:"+fontColor+"\">";
	}




}
//Ook! Ook!