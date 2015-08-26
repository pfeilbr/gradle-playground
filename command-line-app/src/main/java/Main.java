import com.google.common.base.Joiner;
import com.google.common.html.HtmlEscapers;
import com.oracle.tools.packager.UnsupportedPlatformException;

public class Main {
    public static void main(String[] args) {
    	System.out.printf("Hello %s\n", "World");
        HtmlEscapers.htmlEscaper();
        final String join = Joiner.on(",").join(new String[]{"1", "2", "3"});
        System.out.printf("join = %s", join);
    }
}
