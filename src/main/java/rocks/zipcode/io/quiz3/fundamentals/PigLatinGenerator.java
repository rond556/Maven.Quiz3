package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {
        StringBuilder sb = new StringBuilder();
        String[] stringArray = str.split(" ");

        if(VowelUtils.startsWithVowel(str)) {return str + "way";}
        if (!VowelUtils.hasVowels(str)) {
            return str + "ay";
        }
        if(stringArray.length > 1) {
            for(String s : stringArray) {
                if (VowelUtils.startsWithVowel(s)) {
                    sb.append(s + "way ");
                } else {
                    sb.append(s.substring(VowelUtils.getIndexOfFirstVowel(s)) + s.substring(0, VowelUtils.getIndexOfFirstVowel(s)) + "ay ");
                }
            }
            String pigLatinSentence = sb.toString();
            return pigLatinSentence.trim();
        }
        return str.substring(VowelUtils.getIndexOfFirstVowel(str)) + str.substring(0, VowelUtils.getIndexOfFirstVowel(str)) + "ay";
    }
}
