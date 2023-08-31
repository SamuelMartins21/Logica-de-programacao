import java.text.BreakIterator;
import java.util.Locale;

public class Teste1 {
    public String truncate(String input) {
        if (input.codePointCount(0, input.length()) <= 5) {
            return input;
        } else {
            BreakIterator boundary = BreakIterator.getCharacterInstance(Locale.getDefault());
            boundary.setText(input);

            int endIndex = 0;
            int codePoints = 0;
            
            while (codePoints < 5 && endIndex < input.length()) {
                endIndex = boundary.following(endIndex);
                codePoints++;
            }
            
            return input.substring(0, endIndex);
        }

    }
}
