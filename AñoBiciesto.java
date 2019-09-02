package Acti3;

public class AñoBiciesto {
	
	public static String año(int a) {
		String año="";
		if(a%100!=0) {
			año="Es bisiesto";
		}
		else {
			año="No es bisiesto";
		}
		 if(a%400==0) {
			 año="Es bisiesto";
		}
		 else {
				año="No es bisiesto"; 
		 }
		return año;
	}

}
