package Arrays.Strings;

import java.util.HashSet;
// implement an algorithm to determine if a string has all unique characters.

public class uniqueCharacterString {
	public static boolean findUnique (String s)
	{ 
		HashSet<Character> h = new HashSet<Character>();
		
		int length = s.length();
		for (int i = 0; i < length; i++)
		{
			char c = s.charAt(i);
			if(!h.contains(c))
				h.add(c);
			else return false;
		}	
		return true;
	}
	// CC 150 solution
	public static boolean isUniqueChar2(String str)
	{
		if (str.length() > 128)
			return false;
		boolean[] char_set = new boolean[256];
		
		for (int i = 0; i < str.length(); i++)
		{
			int val = str.charAt(i);
			
			if (char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;
	}
	public static void main(String[] args)
	{
		//String s = "abcdl";
		String s = "ghashga";
		System.out.println(findUnique(s));
		System.out.println(isUniqueChar2(s));
	}
}
