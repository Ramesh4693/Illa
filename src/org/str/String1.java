package org.str;

public class String1 {
	public static void main(String[] args) {
	String a="WelcomE";
    char op=0;
    char ap=0;
	System.out.println(a.length());
	for (int i = 0; i < a.length(); i++) {
		char b =a.charAt(i);
		if(Character.isUpperCase(b)) {
		char lowerCase =Character.toLowerCase(b);
		op=lowerCase;
		}
		else if(Character.isLowerCase(b)){
			char upperCase = Character.toUpperCase(b);
			ap=upperCase;
		}
		System.out.println(op);
		System.out.println(ap);
	}

}
}