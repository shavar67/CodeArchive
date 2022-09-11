package OopConcepts;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * [A-Za-a] - any uppercase AND LOWER CASE leters
 * [0-9] - any characters you want
 * [^A-G] any characters between a and g
 * \\s - whitespace
 * \\S no whitespace
 * \\looking for a word that is 2 = 20 characters in length
  *\\[A-Za-z]{2,20}  shorthand -> \\w{2,20}
 *\\search for min without a max {5,}
 * \\ . ^ + ? {} () \| () <== always requires a backslash
 * a . period represent anything but a new line
 *
 */
public class PatternMatcher {

    public static void regexChecker(String theRgex, String str2Check) {
        Pattern checkRegex = Pattern.compile(theRgex);
        Matcher regexMatcher = checkRegex.matcher(str2Check);
        while (regexMatcher.find()) {
            if (regexMatcher.group().length() != 0) {
                System.out.println(regexMatcher.group().trim());
            }

        }
    }

    public static void main(String[] args) {
        String longString = " Shavar Litchmore MD DA 21208 DE (443)204-5750 slitchmore3@gmail.com";
        String strangeStr = " 1Z aaa **** *** {{{ {{ { ";


        regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
        //zipcode 5 digits long
        System.out.println("Looking for a zipcode");
        regexChecker("\\s\\d{5}\\s", longString);
        System.out.println("searching for states");

        regexChecker("M[A-Za-z]|D[A-Za-z]", longString);

        System.out.println("Search for email");
        regexChecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}", longString);
        System.out.println("Searching for phone number:");
        regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longString);

    }
}
