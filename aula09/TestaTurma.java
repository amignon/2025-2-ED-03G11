public class TestaTurma {
    public static void main(String[] args) {
        Turma turma = new Turma();

        Aluno a1 = new Aluno("Ale", 7.5, 6.5);
        Aluno a2 = new Aluno("Mignon", 4.0, 6.5);
        Aluno a3 = new Aluno("Pedro", 9.0, 9.5);

        turma.adicionaAluno(a1);
        turma.adicionaAluno(a2);
        turma.adicionaAluno(a3);

        turma.imprimeLista();
        double mediaTurma = turma.calculaMediaTurma();
        System.out.printf("Média da Turma: %5.2f\n", mediaTurma);
    }
}