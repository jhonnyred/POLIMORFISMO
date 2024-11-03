abstract class Pessoa{
    // ATRIBUTOS
    private String nome;
    private String instituicao;
    private String email;
    private int idade;

    // CONSTRUTOR
    Pessoa(){
    }

    Pessoa(String nome, String instituicao, int idade){
        this.nome = nome;
        this.instituicao = instituicao;
        this.idade = idade;
        this.email = gerarEmail();
    }

    Pessoa(String nome, String instituicao, String email, int idade){
        this.nome = nome;
        this.instituicao = instituicao;
        this.idade = idade;
        this.email = email;
    }

    // MÉTODOS
    protected String gerarEmail(){
        return this.nome +"@"+ this.instituicao +".com";
    }

    protected String saudacoes(String remetente, CARGO cargo){
        String cargotmp; 
        
        if (cargo == CARGO.PROFESSOR){
            cargotmp = "Prof."; 
        }else{
            cargotmp = "Aluno";
        }

        return "Olá " +cargotmp+ " " +remetente;  
    }

    // GETTERS 
    public String getNome() {
        return nome;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}