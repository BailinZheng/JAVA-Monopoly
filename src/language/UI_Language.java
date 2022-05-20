package language;

// Design Pattern Singleton
public class UI_Language {
	private static AllLanguages al = null;
	
	public static AllLanguages getLanguage()
	{
		if (null == al) al = new AllLanguages();
		
		
		return al;
	}
}
