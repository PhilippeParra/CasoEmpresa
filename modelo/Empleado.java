package modelo;

public class Empleado
{
    private static int salarioMinimo = 1000000;
    private String nombreEmpleado;
    private int numHorasMes;
    private static int auxilioTransporte = 117172;
    private int fechaNacim;
    private int fechaEntra;
    private int edadEmpleado;
    private int salarioFinal;

    public Empleado(String pNombreEmpleado, int pNumHorasMes, int pFechaNacim, int pFechaEntra)
    {
        this.nombreEmpleado = pNombreEmpleado;
        this.numHorasMes = pNumHorasMes;
        this.fechaNacim= pFechaNacim;
        this.fechaEntra= pFechaEntra;
        this.salarioFinal = 0;
    }

    public Empleado()
    {
        this.nombreEmpleado = "";
        this.numHorasMes = 0;
        this.salarioFinal = 0;
        this.fechaNacim = 0;
        this.fechaEntra = 0;
    }

    public static int getSalarioMinimo()
    {
        return salarioMinimo;
    }

    public String getNombreEmpleado()
    {
        return this.nombreEmpleado;
    }

    public int getNumHorasMes()
    {
        return this.numHorasMes;
    }
    
    public static int getAuxilioTransporte()
    {
        return auxilioTransporte;
    }

    public int getEdadEmpleado()
    {
        return this.edadEmpleado;
    }

    public int getFechaNacim()
    {
        return this.fechaNacim;
    }

    public int getFechaEntrad()
    {
        return this.fechaEntra;
    }

    public int getSalarioFinal()
    {
        return this.salarioFinal;
    }
    
    public void setNombreEmpleado(String pNombreEmpleado)
    {
        this.nombreEmpleado = pNombreEmpleado;
    }
    
    public void setNumHorasMes(int pNumHorasMes)
    {
        this.numHorasMes = pNumHorasMes;
    }

    public void setSalarioFinal(int pSalarioFinal)
    {
        this.salarioFinal = pSalarioFinal;
    }

    public void setFechaNacim(int pFechaNacim)
    {
        this.fechaNacim = pFechaNacim;
    }

    public void setFechaEntra(int pFechaEntra)
    {
        this.fechaEntra = pFechaEntra;
    }

    public void setEdadEmpleado(int pEdadEmpleado)
    {
        this.edadEmpleado = pEdadEmpleado;
    }

    public void calcularSalario()
    {
        setSalarioFinal(getNumHorasMes() *  4166);

        if(getSalarioFinal() < 2000000)
        {
            setSalarioFinal(getAuxilioTransporte() + getSalarioFinal());
        }

        if(getSalarioFinal() < 1000000)
        {
            setSalarioFinal(getSalarioMinimo() + getAuxilioTransporte());
        }
    }

    public void calcularEdad()
    {
        setEdadEmpleado(getFechaEntrad() - getFechaNacim());
    }

    public String toString()
    {
        return "DATOS DEL EMPLEADO" + "\nHoras de trabajo al mes: " + numHorasMes + "\nSalario Final: " + salarioFinal + "\nAuxilio de transporte: " + auxilioTransporte;
    }
}