
public class Persona {

    int Id;
    String Nombre;
    String Apellidos;
    double salario;
    int horast;

    public Persona(int Id, String Nombre, String Apellidos, double salario, int horast) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.salario = salario;
        this.horast = horast;
    }

    public Persona() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorast() {
        return horast;
    }

    public void setHorast(int horast) {
        this.horast = horast;
    }

    @Override
    public String toString() {
        return "PERSONA(" + " ID= " + Id + ", NOMBRE= " + Nombre + ", APELLIDOS= " + Apellidos + ", SALARIO= " + salario + ", HORAS TRABAJADAS= " + horast + " )";
    }
    

}
