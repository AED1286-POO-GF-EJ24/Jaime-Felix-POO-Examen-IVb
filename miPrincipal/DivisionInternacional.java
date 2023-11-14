package miPrincipal;

public class DivisionInternacional extends Division {
    // Atributos
    private String pais;
    private String idioma;

    // Constructor
    public  DivisionInternacional(String nombre, int numeroEmpleados, String pais, String idioma)
    {
        super(nombre, numeroEmpleados);
        setPais( pais );
        setIdioma( idioma );
    }

    // Metodos set/get
    public void setPais( String pais )
    {
        // No hay nada que validar
    }

    public void setIdioma( String idioma )
    {
        // No hay nada que validar
    }

    public String getPais()
    {
        return "";
    }

    public String getIdioma()
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