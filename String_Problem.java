package practice;

public class String_Problem {

	public static void main(String[] args) {
		
		String str = "I am Aadhitya. I am From Tambaram. My mark is 90.";
		int letters=0,space=0,spchar=0,numbers = 0;
		char ch [] = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isAlphabetic(ch[i])) {
				letters++;
			}
			else if(Character.isDigit(ch[i])) {
				numbers++;
			}
			else if(Character.isSpace(ch[i])) {
				space++;
			}
			else {
				spchar++;
			}
		}
		System.out.println(str);
		System.out.println("Letters : "+letters+"\nSpaces : "+space+"\nNumbers : "+numbers+"\nSpecial Charaters : "+spchar);
	}

}
