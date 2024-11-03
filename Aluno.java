class Aluno extends Pessoa{
    // ATRIBUTOS
    private int ano;

    // CONSTRUTOR
    Aluno(){
    }

    Aluno(String nome, String instituicao, int idade, int ano){
        super(nome, instituicao, idade);
        super.setEmail(super.gerarEmail());
        this.ano = ano;
    }

    Aluno(String nome, String instituicao, String email, int idade, int ano){
        super(nome, instituicao, email, idade);
        this.ano = ano;
    }

    // MÉTODOS
    @Override
    protected String saudacoes(String remetente, CARGO cargo){
        String cumprimento = super.saudacoes(remetente, cargo);

        return cumprimento+ "\n\nAtenciosamente Aluno " +super.getNome();
    }

    // GETTERS
    public int getAno() {
        return ano;
    }

    // SETTERS
    public void setAno(int ano) {
        this.ano = ano;
    }
}