public class Usuario {
    public String nombre;
    private String cc;
    public String nroCuenta;
    private String celular;

    public Usuario() {
        nombre = "";
        cc = "";
        nroCuenta = "";
        celular = "";
    }
    public Usuario(String nombre, String cc, String nroCuenta, String celular) {
        this.nombre = nombre;
        this.cc = cc;
        this.nroCuenta = nroCuenta;
        this.celular = celular;
    }
    public String getCc() {
        return cc;
    }
    public void setCc(String cc) {
        this.cc = cc;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public void actualizarCuerta(){

    }
    public void borrarCuenta(){

    }
    public void crearCuenta(){

    }
}
