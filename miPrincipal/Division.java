package miPrincipal;

public abstract class Division {
    // Atributos
    private String nombre;
    private int numeroEmpleados;

    // Constructor
    public Division(String nombre, int numeroEmpleados)
    {
        setNombre( nombre );
        setNumeroEmpleados( numeroEmpleados );
    }

    // Metodos set/get
    public void setNombre( String nombre )
    {
        // No hay nada que validar
    }

    public void setNumeroEmpleados( int numeroEmpleados )
    {
        // El numero de empleados debe ser mayor o igual que 0 (cero)
    }

    public String getNombre()
    {
        return "";
    }

    public int getNumeroEmpleados()
    {
        return 0;
    }

    // Metodo de instancia
    public abstract String tipoDivision();

    // Metodo toString()
    public String toString()
    {
        String resultado = String.format("");
        return resultado;
    }
}