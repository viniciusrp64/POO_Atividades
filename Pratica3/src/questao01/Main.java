package questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Normal ingressoNormal = new Normal(50);
        ingressoNormal.imprimeNormal();
        VIP ingressoVip = new VIP(50,100);
        ingressoVip.imprimeVip();
        Camarote ingressoCamarote = new Camarote(50,150,"Belo Horizonte");
        ingressoCamarote.imprimeCamarote();

    }
}
