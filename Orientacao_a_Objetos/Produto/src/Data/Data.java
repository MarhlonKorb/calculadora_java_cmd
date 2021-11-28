package Data;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        dia = 1;
        mes = 10;
        ano = 1970;
    }

    Data(int diaAlterado, int mesAlterado, int anoAlterado){
        dia = diaAlterado;
        mes = mesAlterado;
        ano = anoAlterado;
    }

    String obterDataInformada(){
        return String.format(dia+"/"+mes+"/"+ano);
    }
}
