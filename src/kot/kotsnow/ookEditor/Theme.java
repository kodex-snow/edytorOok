package kot.kotsnow.ookEditor;

public enum Theme {
    DEFAULT ("domyœlny","white","black","red"),
    CONTRAST("kontrastowy","black","yellow", " pink");

    private final String name;
    private final String backgroundColor;
    private final String fontColor;
    private final String keywordColor;

    Theme(String name, String backgroundColor, String fontColor, String keywordColor) {
        this.name = name;
        this.backgroundColor=backgroundColor;
        this.fontColor =fontColor;
        this.keywordColor=keywordColor;
    }

	public String getName() {
		return name;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public String getFontColor() {
		return fontColor;
	}

	public String getKeywordColor() {
		return keywordColor;
	}

	public static Theme getTheme(String name){

		for(Theme theme: Theme.values()){
			if((theme.getName().equals(name))){
				return theme;
			}
		}

		return DEFAULT;
	}

}
