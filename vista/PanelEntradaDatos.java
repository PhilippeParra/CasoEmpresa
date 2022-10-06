package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbEmpleado;
    private JLabel lbNumHoras;
    private JLabel lbFechaNac;
    private JLabel lbFechaEntra;
    private JTextField tfEmpleado;
    private JTextField tfNumHoras;
    private JTextField tfFechaNac;
    private JTextField tfFechaEntra;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/empleadoImg.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,220,176);
        add(lbImagen);
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbEmpleado = new JLabel("Nombre Empleado= ");
        lbEmpleado.setBounds(230,10,130,20);
        add(lbEmpleado);
        
        lbNumHoras = new JLabel("#Horas al mes= ");
        lbNumHoras.setBounds(230,40,130,20);
        add(lbNumHoras);
        
        lbFechaNac = new JLabel("Fecha de nacimiento= ");
        lbFechaNac.setBounds(230,70,130,20);
        add(lbFechaNac);

        lbFechaEntra = new JLabel("Fecha de entrada= ");
        lbFechaEntra.setBounds(230,100,130,20);
        add(lbFechaEntra);
        
        //Creación y adición de campos de texto
        tfEmpleado = new JTextField("Juan");
        tfEmpleado.setBounds(360, 10, 60, 20);
        add(tfEmpleado);
        
        tfNumHoras = new JTextField("10");
        tfNumHoras.setBounds(360, 40, 60, 20);
        add(tfNumHoras);
        
        tfFechaNac = new JTextField("1990");
        tfFechaNac.setBounds(360, 70, 60, 20);
        add(tfFechaNac);

        tfFechaEntra = new JTextField("2010");
        tfFechaEntra.setBounds(360, 100, 60, 20);
        add(tfFechaEntra);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNombreEmpleado()
    {
        return tfEmpleado.getText();
    }
    
    public String getNumHorasMes()
    {
        return tfNumHoras.getText();
    }
    
    public String getFechaNacim()
    {
        return tfFechaNac.getText();
    }

    public String getFechaEntrad()
    {
        return tfFechaEntra.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfEmpleado.setText("");
        tfNumHoras.setText("");
        tfFechaNac.setText("");
    }
}