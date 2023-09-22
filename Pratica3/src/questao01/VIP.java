package questao01;

public class VIP extends Ingresso{
    private double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void imprimeVip(){
        System.out.println("Ingresso VIP. Valor com adicional: " + (getValor() + getValorAdicional()));
    }
}
