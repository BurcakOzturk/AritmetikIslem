import java.util.Scanner;

public class odev {

	public static void main(String[] args) {
	        
		     int a,b,c,sonuc;
		    
	         Scanner inp = new Scanner (System.in);
	         
	         System.out.print("a degerini giriniz:");
	         a = inp.nextInt();
			
	         System.out.print("b degerini giriniz:");
	         b = inp.nextInt();
			
	         
	         System.out.print("c degerini giriniz:");
	         c = inp.nextInt();
	         
	         
	         sonuc = (a+b*c-b);
		
	         System.out.println("sonuc : "+ sonuc);
	}

}
