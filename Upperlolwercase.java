package sumave1;

public class Upperlolwercase {

	public static void main(String[] args) {
		String s="hAi";
		char ch;
		String a="";
for(int i=0;i<s.length();i++){
	ch=s.charAt(i);
	if(ch>=65 && ch<=91){
		a+=(char)(ch+32);
	}
	else if(ch>=97 && ch<=122){
		a+=(char)(ch-32);
	}
}
System.out.println("original string"+s);
System.out.println("upper and lower case string is"+a);

	}

}
