public class Cuenta {
    public String nroCuenta;
    private Double saldo;
    private String titular;
    private Movimiento[] Movimientos;

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Movimiento[] getMovimientos() {
        return Movimientos;
    }
    public void setMovimientos(Movimiento[] movimientos) {
        Movimientos = movimientos;
    }
    public void depositar(){

    }
    public void retirar(){

    }
    public void transferir(){

    }
    public void mostrarMovimientos(){

    }
    public void cerrarSesion(){

    }
}
