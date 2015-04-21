import java.util.HashMap;

public class Anagram
{
    public static boolean isAnagram(String originalStr, String anagramStr)
    {
        HashMap<Character, Integer> letterMap = new HashMap<Character, Integer>();
        char[] chars = originalStr.toCharArray();
        for (char c : chars)
        {
            if (c != ' ')
            {
                int cnt = letterMap.get(c) == null ? 0 : letterMap.get(c);
                letterMap.put(c, ++cnt);
            }
        }

        chars = anagramStr.toCharArray();
        for (char c : chars)
        {
            if (c != ' ')
            {
                Integer cnt = letterMap.get(c);
                if (cnt == null)
                    return false;
                if (--cnt == 0)
                    letterMap.remove(c);
                else
                    letterMap.put(c, cnt);
            }
        }
        
        if(!letterMap.isEmpty())
            return false;

        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(isAnagram("this", "ist h"));
    }
}
