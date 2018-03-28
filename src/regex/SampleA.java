/**
 * Copyright on vntime(2018).
 */
package regex;

import java.util.regex.Pattern;

/**
 * @author vntime
 *
 */
public class SampleA {

    /**
     * 
     */
    public SampleA() {
    }

    public static void main(String[] args) {
        String s = "123100";
        String pStr = "^" + s.substring(0, 4) + "(\\d)+";
        String input = "123122";
        System.out.println(pStr);
        if (Pattern.matches(pStr, input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
