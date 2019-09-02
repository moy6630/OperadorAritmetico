package Acti3;
import java.io.*;
import java.util.*;
public class BisiestoPrin {
	public static void main(String []args) {
int a=0;
System.out.println("¿Que año se va a comparar?");
Scanner num1=new Scanner(System.in);
a=num1.nextInt();
AñoBiciesto añ = new AñoBiciesto();

File op = new File ("C:\\Users\\luism\\bisiesto.txt");
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
texto = new FileWriter("C:\\\\Users\\\\luism\\\\bisiesto.txt",false);
pw=new PrintWriter(texto);
pw.println((añ.año(a)));
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

