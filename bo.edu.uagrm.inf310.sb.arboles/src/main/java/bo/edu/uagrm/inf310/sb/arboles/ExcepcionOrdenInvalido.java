package bo.edu.uagrm.inf310.sb.arboles;

public class ExcepcionOrdenInvalido extends Exception {
	public ExcepcionOrdenInvalido() {
		super("el orden de su arbol debe ser mayor o igual a 3");
	}
	
	public ExcepcionOrdenInvalido (String mensaje) {
		super (mensaje);
	}
}
