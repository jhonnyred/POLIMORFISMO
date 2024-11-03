class Professor extends Pessoa{
    // ATRIBUTOS
    private String disciplina;

    // CONSTURTOR
    Professor(){
    }
    
    Professor(String nome, String instituicao, int idade, String disciplina){
        super(nome, instituicao, idade);
        super.setEmail(super.gerarEmail());
        this.disciplina = disciplina;
    }
    
    Professor(String nome, String instituicao, String email, int idade, String disciplina){
        super(nome, instituicao, email, idade);
        this.disciplina = disciplina;
    }


    // MÉTODOS
    @Override
    protected String saudacoes(String remetente, CARGO cargo){
        String cumprimentar = super.saudacoes(remetente, cargo);

        return cumprimentar+ "\n\nAtenciosamente Prof." +super.getNome(); 
    }

    // GETTERS
    public String getDisciplina() {
        return disciplina;
    }

    // SETTERS
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}