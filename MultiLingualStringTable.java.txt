package base;

public class MultiLingualStringTable {
    public enum LanguageSetting {ENGLISH, KLINGON}
    private static LanguageSetting language = LanguageSetting.ENGLISH;

    private static final String[] englishMessages = {
        "Enter your name:", 
        "Welcome", 
        "Have a good time playing Abominodo"
    };

    private static final String[] klingonMessages = {
        "'el lIj pong:", 
        "nuqneH", 
        "QaQ poH Abominodo"
    };
    
    public static String getMessage(int index){
        if (language == LanguageSetting.ENGLISH) {
            return englishMessages[index];
        } else {
            return klingonMessages[index];
        }
    }
}
