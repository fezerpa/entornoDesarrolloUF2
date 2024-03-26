package practica1;
import java.util.Scanner;

/**
 * Clase notas
 * Contiene las variables y metodos para el calculo de las notas
 * 
 * @author Fernando Zerpa
 * @version 1.0
 * @since 25/03/2024
 */
public class notas {
	//declaramos la variables que nos hacen falta
	/**
	 * Declaracion de variables
	 */
//HOLA
	//CAMBIO DOS
	//CAMBIO 3
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;

	//utilizamos ecaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
		
	/**
	 * Metodo por el cual se capturaran las notas deseadas. 
	 */
	public void IngresaNotas() {
		//cuando ejecutamos este metodo lo primero que queremos es que nos pida notas
		
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}
	
	
	/**
	 *  Metodo que mediante condicionales verifica que las notas introducidas sean correctas.  
	 */
	public void comprobarcion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	

	/**
	 * Metodo por el cual se calcula la nota de cada UF  y la nota definitiva
	 */
	public void Calculonotas() {
		// metodo para calcular nota


		acu1= uf1 - 0.20;
		acu2 = uf2 + 0.90;
		acu3 = uf3 / 0.60;
		
		def = acu1 + acu2+ acu3;
		
		//hasta aqui la tenemos calculada peor no la mostramos
	}
	
	/**
	 * Metodo que imprime las notas introducidas y la nota definitiva
	 */
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		/**
		 * La siguiente linea imprime la nota definitiva
		 */
		System.out.println(" nota definitiva es = "+ def);
		
	}

	/**
	 * Metodo que usando condicionales verifica si la nota definitiva es suficiente para aprobar.
	 */
	public void aprobado() {

			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
	/**
	 * Aqui se crea una instancia de la clase notas para que pueda ser llamada.
	 * @param args Argumentos de la línea de comandos.
	 */
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase

		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}