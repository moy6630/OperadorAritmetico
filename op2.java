package Acti3;
import java.io.*;
import java.util.Scanner;
public class op2 {

		
		public static int suma (int numero1,int numero2){
			int sum=0;
			sum=numero1+numero2;
			return sum;
		}

		public static int resta (int numero1,int numero2)throws FileNotFoundException,IOException{
			int resta=0;
			resta=numero1-numero2;
			return resta;
		}
		public static int multiplicacion (int numero1,int numero2)throws FileNotFoundException,IOException{
			int mult=0;
			mult=numero1*numero2;
			return mult;
		}
		public static double divi (int numero1,int numero2)throws FileNotFoundException,IOException{
			double divi=0;
			divi=numero1/numero2;
			return divi;
		}
		public static double modulo (int numero1,int numero2)throws FileNotFoundException,IOException{
			int modulo=0;
			modulo=numero1%numero2;
			return modulo;
		}
		
		
}
