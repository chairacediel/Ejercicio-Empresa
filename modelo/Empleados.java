public class Empleados 
{
    //----------
    // Atributos
    //-----------
    
    public static final double SALARIO_MINIMO = 1000000;
    public static final double AUXILIO_TRANSPORTE=118000;
    private int identificacion;
    private int edad;
    private String nombre;
    private int horasTrabajadas;
    private double valorHora;
    private double salario;
    private int dia;
    private int mes;
    private int año; 
    
    
    //---------
    // Metodos
    //---------

    public Empleados()
    {
    }
    
    
    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion)
    {
        this.identificacion = identificacion;
    }

    public int getedad() 
    {
        return edad;
    }

    public void setedad(int apellidos)
    {
        this.edad = apellidos;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas()
    {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas)
    {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora()
    {
        return valorHora;
    }

    public void setValorHora(double valorHora) 
    {
        this.valorHora = valorHora;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public void calcularSalario()
    {
        salario = horasTrabajadas*valorHora;
        if(salario< 2* SALARIO_MINIMO)
        {
            salario = salario + AUXILIO_TRANSPORTE;
        }
            
    
    }
    public void calcularedad()
    {
      this.año=año;
      this.dia =dia;
      this.mes= mes;
    }

    
}