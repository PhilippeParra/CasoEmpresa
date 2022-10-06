package ejecutable;

import modelo.Empleado;
import vista.VentanaPrincipal;
import controlador.Controlador;

public class Test 
{
    public static void main(String[] args) 
    {
        Empleado empleado1 = new Empleado();

        System.out.print(empleado1);

        VentanaPrincipal miVentana = new VentanaPrincipal();
        Empleado miEmpleado = null;
        Controlador miControlador = new Controlador(miVentana, miEmpleado);
    }
}
