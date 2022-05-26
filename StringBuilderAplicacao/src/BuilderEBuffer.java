public class BuilderEBuffer {
    public static void main(String[] args) {
        StringBuffer frase = new StringBuffer("Olá, me chamo");
        frase.append(" Marhlon");

        StringBuilder frase2 = new StringBuilder(frase);
        frase2.append(" e tenho").append(" 27 anos");

        System.out.println(frase2);
    }
}
