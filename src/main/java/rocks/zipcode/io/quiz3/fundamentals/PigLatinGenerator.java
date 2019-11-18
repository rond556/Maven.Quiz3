package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {
        StringBuilder sb = new StringBuilder();
        Integer length = str.length();
        Integer index = 1;
        String[] stringArray = str.split(" ");

        if(VowelUtils.startsWithVowel(str)) {return str + "way";}
        if (!VowelUtils.hasVowels(str)) {
            return str + "ay";
        }
        if(stringArray.length > 1) {
            for(String s : stringArray){
                sb.append(s.substring(index) + s.substring(0, index) + "ay ");
            }
            return sb.toString();
        }
        return str.substring(index) + str.substring(0, index) + "ay";
    }
}
