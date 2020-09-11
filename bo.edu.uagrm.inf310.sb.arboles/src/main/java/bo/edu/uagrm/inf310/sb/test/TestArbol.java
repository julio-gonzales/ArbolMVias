package bo.edu.uagrm.inf310.sb.test;

import java.util.Scanner;

import bo.edu.uagrm.inf310.sb.arboles.AVL;
import bo.edu.uagrm.inf310.sb.arboles.ArbolB;
import bo.edu.uagrm.inf310.sb.arboles.ArbolBinarioBusqueda;
import bo.edu.uagrm.inf310.sb.arboles.ArbolMViasBusqueda;
import bo.edu.uagrm.inf310.sb.arboles.ExcepcionClaveNoExiste;
import bo.edu.uagrm.inf310.sb.arboles.ExcepcionClaveYaExiste;
import bo.edu.uagrm.inf310.sb.arboles.ExcepcionOrdenInvalido;
import bo.edu.uagrm.inf310.sb.arboles.IArbolBusqueda;

public class TestArbol {
	public static void main(String[] argumentos) throws ExcepcionClaveYaExiste ,ExcepcionClaveNoExiste, ExcepcionOrdenInvalido {
		IArbolBusqueda<Integer,String> arbolDePrueba = new ArbolMViasBusqueda();
		int opcion = 0;
		int subOpcion = 0;
		int nivel = 0;
		Integer clave = 0;
		String valor = "";
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("ARBOLES DE BUSQUEDA");
		System.out.println("1.  ARBOL M VIAS BUSQUEDA");
		System.out.println("2.  ARBOL B");
		System.out.println("Seleccione con que arbol desea trabajar");
		opcion = teclado.nextInt();
		
		switch (opcion) {
		case 1:
			arbolDePrueba = new ArbolMViasBusqueda<>();
			break;

		case 2:
			arbolDePrueba = new ArbolB<>();
			break;
		}
		
		
		do {
			System.out.println("MENU");
			System.out.println("1.  INSERTAR");
			System.out.println("2.  BUSCAR");
			System.out.println("3.  ELIMINAR");
			System.out.println("4.  RECORRIDO IN ORDEN");
			System.out.println("5.  RECORRIDO PRE ORDEN");
			System.out.println("6.  RECORRIDO POST ORDEN");
			System.out.println("7.  RECORRIDO POR NIVELES");
			System.out.println("8.  NIVEL");
			System.out.println("9.  ALTURA");
			System.out.println("10.  VACIAR");
			System.out.println("11.  CANTIDAD DE NODOS CON DATOS VACIOS - MVIAS");
			System.out.println("12.  SOLO HAY HOJAS EN ULTIMO NIVEL - MVIAS");
			System.out.println("13.  BALANCEADO SEGUN LAS REGLAS DEL ARBOL B - MVIAS");
			System.out.println("14. CANTIDAD DE NODOS CON TODOS LOS HIJOS DISTINTO DE VACIO(EXCEPTO LAS HOJAS");
			System.out.println("15. CANTIDAD DE NODOS CON DATOS VACIOS - ARBOL B");
			System.out.println("16. CANTIDAD DE NODOS CON DATOS VACION SOLO EN EL NIVEL N");
			System.out.println("17. SALIR");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("DIGITE LA CLAVE: ");
				clave = teclado.nextInt();
				System.out.println("DIGITE EL VALOR: ");
				valor = teclado.next();
				arbolDePrueba.insertar(clave, valor);
				break;

			case 2:
				System.out.println("DIGITE LA CLAVE A BUSCAR");
				clave = teclado.nextInt();
				System.out.println("el valor de la clave es: " + arbolDePrueba.buscar(clave));
				break;

			case 3:
				System.out.println("DIGITE LA CLAVE A ELIMINAR: ");
				clave = teclado.nextInt();
				valor = arbolDePrueba.eliminar(clave);
				System.out.println("el valor de la clave eliminada es: " + valor);
				break;
			case 4:
				System.out.println("RECORRIDO INORDEN: " + arbolDePrueba.recorridoEnInOrden());
				break;
			case 5:
				System.out.println("RECORRIDO PRE-ORDEN: " + arbolDePrueba.recorridoEnPreOrden());
				break;
			case 6:
				System.out.println("RECORRIDO POST-ORDEN: " + arbolDePrueba.recorridoEnPostOrden());
				break;
			case 7:
				System.out.println("RECORRIDO POR NIVELES: " + arbolDePrueba.recorridoPorNiveles());
				break;
			case 8:
				System.out.println("EL NIVEL DEL ARBOL ES: " + arbolDePrueba.nivel());
				break;
			case 9:
				System.out.println("LA ALTURA DEL ARBOL ES: " + arbolDePrueba.altura());
				break;
			case 10:
				arbolDePrueba.vaciar();
				System.out.println("EL ARBOL SE VACIO");
				break;
			case 11:
				System.out.println("LA CANTIDAD DE NODOS: "+
				((ArbolMViasBusqueda)arbolDePrueba).cantidadDeNodosConDatosVacios());
				break;
			case 12:
				System.out.println("HAY SOLOS HOJAS EN EL ULTIMO NIVEL: " + 
						((ArbolMViasBusqueda)arbolDePrueba).soloHayHojasEnUltimoNivel());
				break;
			case 13:
				System.out.println("el arbol esta balanceado segun las reglas del arbol B "
				+ ((ArbolMViasBusqueda)arbolDePrueba).estaBalanceado()	);
				
				break;
			case 14:
				System.out.println("digite el nivel : ");
				nivel = teclado.nextInt();
				System.out.println("LA CANTIDAD DE NODOS CON DATOS VACIOS CON HIJOS DISTINTOS DE VACIOS: "+
						((ArbolMViasBusqueda)arbolDePrueba).nodosConHijosDistintosDeVacios(nivel));

				break;
			case 15:
				System.out.println("LA CANTIDAD DE NODOS CON DATOS VACIOS ES: " +
						((ArbolB)arbolDePrueba).cantidadDeNodosConDatosVaciosB());
				break;
			case 16:
				System.out.println("digite el nivel");
				nivel = teclado.nextInt();
				System.out.println("la cantidad de nodos con datos vacios solo en el nivel n es: "
						+ ((ArbolB)arbolDePrueba).nodoConDatosVaciosRec(nivel));

				break;

			}
			
		}
		
		while(opcion != 17);
		
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
}
