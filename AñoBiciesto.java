package Acti3;

public class A�oBiciesto {
	
	public static String a�o(int a) {
		String a�o="";
		if(a%100!=0) {
			a�o="Es bisiesto";
		}
		else {
			a�o="No es bisiesto";
		}
		 if(a%400==0) {
			 a�o="Es bisiesto";
		}
		 else {
				a�o="No es bisiesto"; 
		 }
		return a�o;
	}

}
