import java.util.*;
import java.util.stream.Collectors;



public class Estatistica {

    private List<Integer> entrada;


    public List<Integer> getEntrada() {
        return entrada;
    }

    public void setEntrada(List<Integer> entrada) {
        this.entrada = entrada;
    }

    public Estatistica(List<Integer> entrada){
        this.entrada = entrada;
    }

    public double media() {
        return entrada.stream().mapToInt(n -> n).average().getAsDouble();
    }

    public List<Integer> ordena(){

        return entrada.stream().sorted((i1,i2) -> i1.compareTo(i2)).collect(Collectors.toList());
    }

    public Integer mediana() {
        int tamanho = entrada.size();
        List<Integer> ordenado = ordena();
        int mediana = 0;
        int posicao;
        if(tamanho % 2 !=0) {
            posicao = (int) Math.ceil(tamanho/2);
            mediana = ordenado.get(posicao);
        } else {
            posicao = tamanho/2;
            int posicao2 = posicao + 1;
            int a =ordenado.get(posicao);
            int b = ordenado.get(posicao2);
            mediana = (a+b)/2;
        }
        return mediana;
    }

    public Map<Integer, Long> frequencia() {
        return entrada.stream().collect(Collectors.groupingBy(n -> n,Collectors.counting()));
    }

    public Map<Integer, Long> moda(){
        Map<Integer, Long> frequencias = frequencia();
        Map<Integer, Long> moda = new HashMap<>();
        Long valor =Collections.max(frequencias.values());

        Map<Integer, Long> indice = frequencias.entrySet().stream().filter(n -> n.getValue().equals(valor)).collect(Collectors.toMap(o -> o.getKey(), o -> o.getValue()));
        //puxei o valor, agora precisa puxar a chave correspondente
        return indice;
    }

    public Integer amplitude(){
        int min =entrada.stream().mapToInt(n ->n).min().getAsInt();
        int max = entrada.stream().mapToInt(n ->n).max().getAsInt();
        return max - min;
    }

    /*public double desvioPadrao(){
        double media = media();
        ArrayList<Integer> desvioPadrao = (ArrayList<Integer>) entrada;
        desvioPadrao.stream().forEach(n -> n - media);
        double soma = desvioPadrao.stream().mapToInt(n -> n).sum();
        double divisao = soma / desvioPadrao.size();
        return Math.sqrt(divisao);
    }*/

}