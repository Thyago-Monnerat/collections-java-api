package exercicios.operacoesBasicas.set.desafioListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota){
        alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        for(Aluno a : alunosSet){
            if(a.getMatricula() == matricula){
                alunosSet.remove(a);
                System.out.println("Aluno removido com sucesso: " + a);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosOrdenados = new TreeSet<>(alunosSet);
        return alunosOrdenados;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosOrdenados = new TreeSet<>(new compararNotaComparator());
        alunosOrdenados.addAll(alunosSet);
        return alunosOrdenados;
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Diego", 123456L, 7.6d);
        /**Não adicionado por ter a matrícula igual ao primeiro */
        gerenciadorAlunos.adicionarAluno("Diego", 123456L, 5.5d);
        gerenciadorAlunos.adicionarAluno("Carlos", 13123L, 4.2d);
        gerenciadorAlunos.adicionarAluno("Marcos", 11213236L, 9.8d);
        gerenciadorAlunos.adicionarAluno("Vitor", 111236L, 6.3d);
        gerenciadorAlunos.adicionarAluno("Carol", 15321236L, 9.5d);
        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(123456L);
        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }

}


/**Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
exibirAlunos(): Exibe todos os alunos do conjunto. */