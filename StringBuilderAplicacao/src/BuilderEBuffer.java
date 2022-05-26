public class BuilderEBuffer {
    public static void main(String[] args) {
        StringBuffer frase = new StringBuffer("Olá, me chamo");
        frase.append(" Marhlon");

        StringBuilder frase2 = new StringBuilder(frase);
        frase2.append(" e tenho").append(" 27 anos");

        //insere caracter em uma frase ou palavra
        frase2.insert(37, ".");

        //exclui campos entre os numeros selecionados / insert insere campos na string
        frase2.delete(21,37).insert(21,".Adeus");

        //reverte a frase ou palavra
        frase2.reverse();
        System.out.println(frase2);

        System.out.println(frase2.substring(25,28));
    }
}
