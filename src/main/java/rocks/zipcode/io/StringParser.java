package rocks.zipcode.io;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringParser {
    // TODO - remove this declaration upon completion of method stubs
    private static UnsupportedOperationException methodNotYetImplemented = new UnsupportedOperationException("Method not yet implemented");

    public static Character[] parseCharacters(String input) {

        int wordCount = input.length();
        Character[] charArray = new Character[wordCount];

        for (int i = 0; i < wordCount; i++) {
            charArray[i] = input.charAt(i);
        }

        return charArray;
    }

    public static Integer[] parseIntegers(String input) {

        String[] stringArray = parseStrings(input);
        Integer[] result = new Integer[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {

            String currentString = stringArray[i];
            result[i] = Integer.parseInt(currentString);
        }
        return result;
    }

    public static List<String> toList(String[] input) {

        List<String> list = new ArrayList<String>(input.length);

        for(String str : input) {

            list.add(str);
        }
        return list;
    }

    public static String[] parseStrings(String input) {

        if (input == null) {

            return null;
        }
        return input.split("");
    }
}
