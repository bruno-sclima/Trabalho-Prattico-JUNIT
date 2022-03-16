import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Estatistica estatistica = new Estatistica(new ArrayList<>());
        estatistica.getEntrada().add(57);
        estatistica.getEntrada().add(72);
        estatistica.getEntrada().add(39);
        estatistica.getEntrada().add(84);
        estatistica.getEntrada().add(28);
        estatistica.getEntrada().add(80);
        estatistica.getEntrada().add(51);
        estatistica.getEntrada().add(59);
        estatistica.getEntrada().add(92);
        estatistica.getEntrada().add(59);
        estatistica.getEntrada().add(18);
        estatistica.getEntrada().add(52);
        estatistica.getEntrada().add(87);
        estatistica.getEntrada().add(90);
        estatistica.getEntrada().add(38);
        estatistica.getEntrada().add(12);
        estatistica.getEntrada().add(91);
        estatistica.getEntrada().add(74);
        estatistica.getEntrada().add(80);
        estatistica.getEntrada().add(91);
        estatistica.getEntrada().add(16);
        estatistica.getEntrada().add(94);
        estatistica.getEntrada().add(67);
        estatistica.getEntrada().add(22);
        estatistica.getEntrada().add(1);
        estatistica.getEntrada().add(32);
        estatistica.getEntrada().add(56);
        estatistica.getEntrada().add(24);
        estatistica.getEntrada().add(10);
        estatistica.getEntrada().add(4);
        estatistica.getEntrada().add(30);
        estatistica.getEntrada().add(79);
        estatistica.getEntrada().add(44);
        System.out.println("Media: " + estatistica.media());
        System.out.println("Frequencia: " + estatistica.frequencia());
        System.out.println("Mediana: " + estatistica.mediana());
        System.out.println("Amplitude: " + estatistica.amplitude());
        System.out.println("Moda: " + estatistica.moda());
        //System.out.println("Desvio Padrão: " + estatistica.desvioPadrao());

    }

}
