package string;

public class strings {

	public static void main(String[] args) {
		String str1 = "The quick brown fox ate my homework :(";
		StringBuilder s= new StringBuilder();
		char c;
		
		for (int i = 1; i < str1.length(); i++) {
			
			if (str1.charAt(i) == ' ') {// detect white space, then go one index back to uppercase
				c =str1.toUpperCase().charAt(i - 1);
				s.append(c);
			}
			else s.append(str1.charAt(i-1));
		}
		
		c =str1.toUpperCase().charAt(str1.length()-1);
		s.append(c); //upper case last letter
		
		System.out.println(s);
	}

}
