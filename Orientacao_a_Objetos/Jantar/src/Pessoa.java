public class Pessoa {
    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nome, double pesoPessoaInicial) {
        this.nomePessoa = nome;
        this.pesoPessoa = pesoPessoaInicial;
    }
    void Comer(Comida comida){
        if(comida != null){
        this.pesoPessoa += comida.pesoComida;}
    }
    String apresentar()
    {
        return "Nome: "+nomePessoa+"\nPeso depois de comer: " + this.pesoPessoa;
    }
}
