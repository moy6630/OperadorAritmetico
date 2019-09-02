package Acti3;
import java.io.*;
import java.util.Scanner;
public class princi {
	public static void main(String[] args) {
		int numero1=0;
		int numero2=0;
		double divi,modulo;
		int suma,multiplica,resta;
		System.out.println("Escribe el primer numero");
		Scanner num1=new Scanner(System.in);
		numero1=num1.nextInt();
		System.out.println("Escribe el segundo numero");
		Scanner num2=new Scanner(System.in);
		numero2=num2.nextInt();
	op2 o =new op2();
	


		File op = new File ("C:\\Users\\luism\\ola.txt");
		try {
			if(op.createNewFile()) {
				System.out.println("Se creo el documento con exito");
			}else {
				System.out.println("No se creo el documento o ya estaba creado");
			}
		}catch(IOException io) {
			
		}
		FileWriter texto=null;
		PrintWriter pw=null;
		try {
		texto = new FileWriter("C:\\\\Users\\\\luism\\\\ola.txt",false);
		pw=new PrintWriter(texto);
		pw.println(("Numero 1: "+numero1+" Numero 2: \n"+numero2+"\n"+" \nDivision: "+o.divi(numero1, numero2)+" \nSuma: "+o.suma(numero1, numero2)+" \nMultiplicacion: "+o.multiplicacion(numero1, numero2)+" \nModulo: "+o.modulo(numero1, numero2)+" \nResta: "+o.resta(numero1, numero2)));
	}
	catch(Exception e) {
		e.printStackTrace();	
	}finally {
		try {
			if(null!=texto) {
				texto.close();
			}
		}catch(Exception e2) {
			e2.printStackTrace();
		}
		
}
	}
	}
	

