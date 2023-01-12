import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Feriados feriados = new Feriados();

        System.out.println("Procurando por um feriado na data 12/12/2023");
        String feriadoProcurado = feriados.procuraFeriado("12/12/2023");
        System.out.println(feriadoProcurado);
        
        System.out.println("Procurando por um feriado na data 25/12/2023");
        feriadoProcurado = feriados.procuraFeriado("25/12/2023");
        System.out.println(feriadoProcurado);

        String[][] todosFeriados = feriados.retornaFeriados();
        
        System.out.println("Exibindo lista de feriados");
        for(int i = 0; i < todosFeriados[0].length; i++){
            System.out.println(todosFeriados[0][i] + ": " + todosFeriados[1][i]);
        }
    }
}
