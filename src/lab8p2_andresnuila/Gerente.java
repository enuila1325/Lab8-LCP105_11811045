package lab8p2_andresnuila;

public class Gerente extends Persona {

    private String usuario;
    private String contraseña;
    private String cargo;

    public Gerente() {
    }

    public Gerente(String usuario, String contraseña, String cargo, int id, String nombre, int edad, String sexo, String estcivil, double altura, int peso) {
        super(id, nombre, edad, sexo, estcivil, altura, peso);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "usuario=" + usuario;
    }

}
