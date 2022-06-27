package SampleProject1.SampleProject1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "SivaRamaKrishna";
		int length = str.length();
		String reverse="";
		
		for (int i=length-1; i>=0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
System.out.println(reverse);
	}

}
