package Data;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.dia = 13;
        data1.mes = 5;
        data1.ano = 1995;

        Data data2 = new Data(1,10,1970);

        System.out.print(data1.obterDataInformada());
        System.out.print("\n"+data2.obterDataInformada());
    }
}
