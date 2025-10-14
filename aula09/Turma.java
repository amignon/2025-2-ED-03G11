public class Turma {
    private LinkedList<Aluno> alunos;

    public Turma() {
        alunos = new LinkedList<Aluno>();
    }

    public void adicionaAluno(Aluno umAluno) {
        alunos.addLast(umAluno);
    }

    public void imprimeLista() {
        Aluno umAluno;
        double media;
        int tamanho = alunos.getSize();
        for (int i = 0; i < tamanho; i++) {
            umAluno = alunos.get(i + 1).getDado();
            media = umAluno.calculaMedia(); 
            System.out.print(umAluno);
            System.out.printf("|Média: %5.2f\n", media);
        }
    }

    public double calculaMediaTurma() {
        double soma = 0.0;
        int contador = 0;
        Node<Aluno> pAnda = alunos.getHead();
        Aluno umAluno;
        while (pAnda != null) {
            umAluno = pAnda.getDado();
            soma += umAluno.calculaMedia();
            contador++;
            pAnda = pAnda.getProx();
        }
        return soma / contador;
    }
}  