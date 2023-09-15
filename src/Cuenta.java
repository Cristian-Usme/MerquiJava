public class Cuenta {
    public String nroCuenta;
    private double saldo;
    private String titular;
    private Movimiento[] Movimientos;

    public Cuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
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
    public void depositar(double valor){
        this.saldo += valor;
    }
    public boolean retirar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean transferir(double valor, Cuenta cuenta){
        if(this.saldo >= valor){
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }
    public void mostrarMovimientos(){

    }
    public void cerrarSesion(){

    }
}
