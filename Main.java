enum CARGO{
    ALUNO, PROFESSOR;
}

public class Main{
    public static void main(String[] args){
        // INSTANCIANDO
        Professor p1 = new Professor("Aurelion", "USP", 54, "POO");
        Aluno a1 = new Aluno("Marcos", "UFPR", 26, 5);

        // SAÍDA
        System.out.println(p1.saudacoes("Marcos", CARGO.ALUNO));
        System.out.println("\n\n\n" +a1.saudacoes("Aurelion", CARGO.PROFESSOR));
    }
}