package miPrincipal;

public class DivisionLocal extends Division {
    // Atributos
    private String estado;

    // Constructor
    public  DivisionLocal(String nombre, int numeroEmpleados, String estado)
    {
        super(nombre, numeroEmpleados);
        setEstado( estado );
    }

    // Metodos set/get
    public void setEstado( String estado )
    {
        // No hay nada que validar
    }

    public String getEstado()
    {
        return "";
    }

    // Implementar metodo de instancia tipoDivision
    public String tipoDivision()
    {
        return "";
    }

    // Metodo toString()
    public String toString()
    {
        String resultado = super.toString() + String.format("");
        return resultado;
    }
}