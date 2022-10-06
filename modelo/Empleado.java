package modelo;

public class Empleado
{
    private static int salarioMinimo = 1000000;
    private String nombreEmpleado;
    private int numHorasMes;
    private static int auxilioTransporte = 117172;
    private int salarioFinal;

    public Empleado(String pNombreEmpleado, int pNumHorasMes)
    {
        this.nombreEmpleado = pNombreEmpleado;
        this.numHorasMes = pNumHorasMes;
        this.salarioFinal = 0;
    }

    public Empleado()
    {
        this.nombreEmpleado = "";
        this.numHorasMes = 0;
        this.salarioFinal = 0;
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


    public void calcularSalario()
    {
        setSalarioFinal(getNumHorasMes() *  4166);

        if(getSalarioFinal() > 2000000)
        {
            setSalarioFinal(getAuxilioTransporte() + getSalarioFinal());
        }
    }

    public String toString()
    {
        return "DATOS DEL EMPLEADO" + "\nHoras de trabajo al mes: " + numHorasMes + "\nSalario Final: " + salarioFinal + "\nAuxilio de transporte: " + auxilioTransporte;
    }
}