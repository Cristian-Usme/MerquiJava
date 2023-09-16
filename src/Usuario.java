public class Usuario {
    public String nombre;
    private String cc;
    public String nroCuenta;
    private String celular;
    private String password;

    public Usuario() {
        nombre = "";
        cc = "";
        nroCuenta = "";
        celular = "";
    }
    public Usuario(String nombre, String cc, String celular, String password) {
        this.nombre = nombre;
        this.cc = cc;
        this.nroCuenta = String.valueOf((Math.random()*1000)+1);
        this.celular = celular;
        this.password = password;
    }
    public String getCc() {
        return cc;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public boolean actualizarDatos(String cambios){
        if(!this.celular.equals(cambios)){
            this.celular = celular;
            return true;
        } else if (!this.password.equals(cambios)) {

        }
        return false;
    }
    public void borrarCuenta(){

    }
    public void crearCuenta(){

    }
}
