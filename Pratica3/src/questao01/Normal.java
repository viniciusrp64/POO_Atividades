package questao01;

public class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }
    public void imprimeNormal(){
        System.out.println("Ingresso Normal, valor: " + getValor());
    }
}
