package ni.edu.uam.facturacion.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 *
 * Con OpenXava Studio/Eclipse: Botón derecho del ratón > Run As > Java Application
 */

public class facturacion {

	public static void main(String[] args) throws Exception {
		DBServer.start("facturacion-db");
		AppServer.run("facturacion");
	}

}
