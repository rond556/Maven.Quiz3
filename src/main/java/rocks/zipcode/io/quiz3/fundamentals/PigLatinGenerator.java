package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    static Boolean isVowel(Character c){
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public String translate(String str) {
        StringBuilder sb = new StringBuilder();
        Integer length = str.length();
        Integer index = -1;
        String[] stringArray = str.split(" ");

        if(VowelUtils.startsWithVowel(str)) {return str + "way";}
        if (!VowelUtils.hasVowels(str)) {
            return str + "ay";
        }

        for (int i = 0; i < length; i++) {
            if (isVowel(str.charAt(i))) {
                index = 1;
                break;
            }
        }

        if(stringArray.length > 1) {
            for(String s : stringArray){
                returnVowel(s);
                sb.append(s.substring(index) + s.substring(0, index) + "ay ");
            }
            return sb.toString();
        }
        return str.substring(index) + str.substring(0, index) + "ay";
    }

    private boolean returnVowel(String str) {
        if (isVowel(str.charAt(0))) {
            return true;
        }
        return false;
    }
}
