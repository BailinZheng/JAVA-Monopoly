package language;

// Design Pattern Singleton
public class UI_Language {
	private static AlleSprachen al = null;
	
	public static AlleSprachen getLanguage()
	{
		if (null == al) al = new AlleSprachen();
		
		
		return al;
	}
}
