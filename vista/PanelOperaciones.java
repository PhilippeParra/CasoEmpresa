package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton bAñadir;
    public JButton bSalario;
    public JButton bEdad;
    public JButton bCerrar;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        bAñadir = new JButton("Añadir");
        bAñadir.setFont(new Font("Arial", BOLD, 12));
        bAñadir.setBounds(10,20,90,20);
        add(bAñadir);
        bAñadir.setActionCommand("añadir");
        
        
        bSalario = new JButton("Calcular Salario");
        bSalario.setFont(new Font("Arial", BOLD, 12));
        bSalario.setBounds(110,20,130,20);
        add(bSalario);
        bSalario.setActionCommand("calcularSalario");
        bSalario.setEnabled(false);
        
        bEdad = new JButton("Calcular Edad");
        bEdad.setFont(new Font("Arial", BOLD, 12));
        bEdad.setBounds(250,20,120,20);
        add(bEdad);
        bEdad.setActionCommand("calcularEdad");
        bEdad.setEnabled(false);
        
        bCerrar = new JButton("Cerrar");
        bCerrar.setFont(new Font("Arial", BOLD, 12));
        bCerrar.setBounds(380,20,80,20);
        add(bCerrar);
        bCerrar.setActionCommand("cerrar");
        bCerrar.setEnabled(false);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        bAñadir.addActionListener(pAL);
        bSalario.addActionListener(pAL);
        bEdad.addActionListener(pAL);
        bCerrar.addActionListener(pAL);
    }
    
    public void desactivarBotonAñadir()
    {
        bAñadir.setEnabled(false);
    }
    
    public void activarBotones()
    {
        bSalario.setEnabled(true);
        bEdad.setEnabled(true);
        bCerrar.setEnabled(true);
    }
}