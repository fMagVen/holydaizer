public class Feriados {

    private String[] datas = new String[]{
        "01/01/2023",
        "21/02/2023",
        "17/04/2023",
        "01/05/2023",
        "08/06/2023",
        "07/09/2023",
        "12/10/2023",
        "02/11/2023",
        "15/11/2023",
        "25/12/2023"
    };

    private String[] nomes = new String[]{
        "Confraternização mundial",
        "Carnaval",
        "Páscoa",
        "Tiradentes",
        "Dia do trabalho",
        "Corpus Christi",
        "Independência do Brasil",
        "Nossa Senhora Aparecida",
        "Finados",
        "Natal"
    };

    public String procuraFeriado(String data){
        for(int i = 0; i < datas.length; i++){
            if(datas[i] == data){
                return nomes[i];
            }
        }
        return "Não existe feriado com tal data!";
    }

    public String[][] retornaFeriados(){
        String[][] arrays = {this.datas, this.nomes};
        return arrays;
    }
}
