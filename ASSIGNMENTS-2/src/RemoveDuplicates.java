import java.util.Scanner;

public class RemoveDuplicates {
	public static char[] reverse(char[] ch) {
		char [] ch1=new char[ch.length];
		int count=0;
		for(int i=ch.length-1;i>=0;i--) {
			ch1[count]=ch[i];
			count++;
		}
		return ch1;
	}
	public static void main(String[] args){
		Scanner name = new Scanner(System.in);
		System.out.print("Enter the name :");
		String s1=name.nextLine();
		char [] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
				if(j==0) {
					System.out.print(ch[i]+" ");
				}
				else if(i==0) {
					System.out.print(ch[j]+" ");
				}
				else if(i==ch.length-1) {
					char [] sb=reverse(ch);
					System.out.println(sb[j]);
				}
			}
			System.out.println();
		}
	}
}
