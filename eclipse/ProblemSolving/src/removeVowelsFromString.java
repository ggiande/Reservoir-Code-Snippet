import java.util.HashSet;
/* 1119. Remove Vowels from a String */

class removeVowelsFromString{
    public static void main(String[] args) {
        String S = "leetcodeisacommunityforcoders";
        String check = "ltcdscmmntyfrcdrs";
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (!set.contains(S.charAt(i))) sb.append(S.charAt(i));
        }
;
        if(sb.toString().equals(check)){
            System.out.println("WORKS");
        } else {
            System.out.println("FAILED :(");
        }

    }
}