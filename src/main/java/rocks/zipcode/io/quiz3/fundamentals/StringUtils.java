package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String changedWord = str.substring(0,indexToCapitalize) + str.substring(indexToCapitalize,indexToCapitalize+1).toUpperCase() + str.substring(indexToCapitalize+1);
        return changedWord;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> allSubstringList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length() + 1; j++) {
                if(!allSubstringList.contains(string.substring(i,j)))
                allSubstringList.add(string.substring(i,j));
            }
        }

        String[] allSubString = new String[allSubstringList.size()];
        for(int i = 0; i < allSubstringList.size();i++){
            allSubString[i] = allSubstringList.get(i);
        }
        return allSubString;
    }

    public static Integer getNumberOfSubStrings(String input){
        Integer count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length() + 1; j++) {
                count++;
            }
        }
        return count - 1;
    }
}
