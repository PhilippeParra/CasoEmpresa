package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Empleado;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Empleado model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Empleado pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("añadir"))
        {   
            //Validar datos entrada
            try
            {
                String nombreEmpleado = venPrin.miPanelEntradaDatos.getNombreEmpleado();
                int numHorasMes = Integer.parseInt(venPrin.miPanelEntradaDatos.getNumHorasMes());
                int fechaNacimiento = Integer.parseInt(venPrin.miPanelEntradaDatos.getFechaNacim());
                int fechaIngreso = Integer.parseInt(venPrin.miPanelEntradaDatos.getFechaEntrad());
            
                model = new Empleado(nombreEmpleado , numHorasMes, fechaNacimiento, fechaIngreso);
                
                venPrin.miPanelResultado.mostrarResultado("Se ha añadidio un empleado");
                venPrin.miPanelResultado.mostrarResultado("Su Nombre es " + model.getNombreEmpleado());
                venPrin.miPanelResultado.mostrarResultado("Su salario base es " + model.getSalarioMinimo());
                venPrin.miPanelResultado.mostrarResultado("Sus horas de trabajo son: " + model.getNumHorasMes());                
                venPrin.miPanelResultado.mostrarResultado("Fecha de nacimiento: " + model.getFechaNacim());
                venPrin.miPanelResultado.mostrarResultado("Fecha de ingreso: " + model.getFechaEntrad());
                
                venPrin.miPanelOperaciones.desactivarBotonAñadir();
                
                venPrin.miPanelOperaciones.activarBotones();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        
        if(comando.equals("calcularSalario"))
        {
            model.calcularSalario();
            if(model.getSalarioFinal() > 2000000)
            {
                venPrin.miPanelResultado.mostrarResultado("\nTras calcular, el salario actual es " + model.getSalarioFinal() + "\nSin subsidio de Transporte.");
            }
            else
            {
                venPrin.miPanelResultado.mostrarResultado("\nTras calcular, el salario actual es " + model.getSalarioFinal() + "\nCon subsidio de Transporte.");
            }
            
        }

        if(comando.equals("calcularEdad"))
        {
            model.calcularEdad();
            venPrin.miPanelResultado.mostrarResultado("\nTras calcular, la edad de " + model.getNombreEmpleado() + "\nSu edad es: "  + model.getEdadEmpleado());
        }
        
        if(comando.equals("cerrar"))
        {
            System.exit(0);
        }
    }    
}