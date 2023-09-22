package questao01;

public class Camarote extends Ingresso {
    private double valorAdicional;
    private String Localização;

    public Camarote(double valor, double valorAdicional, String localização) {
        super(valor);
        this.valorAdicional = valorAdicional;
        Localização = localização;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public String getLocalização() {
        return Localização;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void setLocalização(String localização) {
        Localização = localização;
    }

    public void imprimeCamarote () {
            System.out.println("Ingresso Camarote. Valor com adicional: " + (getValor() + getValorAdicional()));
            System.out.println("Localização: " + getLocalização());
        }
    }

