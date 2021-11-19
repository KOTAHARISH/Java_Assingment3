package Assignment_3;
import java.util.Arrays;

public class Anagram {

	static void testAnagram( String str1, String str2)
	{
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		
		boolean status = true;
		if (s1.length() != s2.length() ){
			status = false;
		}else{
			char[] arrayS1 = s1.toLowerCase().toCharArray();
			char[] arrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arrayS1);
			Arrays.sort(arrayS2);
			status = Arrays.equals(ArrayS1,ArraysS2);
			
		}
		if(status){
			System.out.println(s1 +" and "+s2 +" are Anagram");
		}else{
			System.out.println(s1 +" and "+s2 +" are not Anagram");
		}
		
	}
	public static void main(String[] args) {
	      testAnagram("keep","peek");
	      testAnagram("dabc","abcd");

	
	}

}
