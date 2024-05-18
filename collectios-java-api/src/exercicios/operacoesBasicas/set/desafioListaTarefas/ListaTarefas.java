package exercicios.operacoesBasicas.set.desafioListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefa;

    public ListaTarefas(){
        this.listaTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;
        for(Tarefa t : listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover = t;
                System.out.println("Tarefa removida com sucesso: " + t.getDescricao());
                break;
            }
        }
        listaTarefa.remove(tarefaRemover);
    }

    public void exibirTarefas(){
        System.out.println(listaTarefa);
    }

    public int contarTarefas(){
        return listaTarefa.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasRealizadas = new HashSet<>();
        for(Tarefa t : listaTarefa){
            if(t.isRealizada() == true){
                tarefasRealizadas.add(t);
            }
        }

        return tarefasRealizadas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : listaTarefa){
            if(t.isRealizada() == false){
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setRealizada(true);
                System.out.println("Tarefa marcada como realizada: " + t);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setRealizada(false);
                System.out.println("Tarefa marcada como pendente: " + t);
                break;
            }
        }
    }

    public void limparListaTarefas(){
        listaTarefa.removeAll(listaTarefa);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Fazer compras no supermercado");
        listaTarefas.adicionarTarefa("Lavar a louça");
        listaTarefas.adicionarTarefa("Limpar a casa");
        listaTarefas.adicionarTarefa("Pagar contas online");
        listaTarefas.adicionarTarefa("Levar o cachorro para passear");
        listaTarefas.adicionarTarefa("Preparar o jantar");
        listaTarefas.adicionarTarefa("Responder e-mails");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Estudar para a prova");
        listaTarefas.adicionarTarefa("Ler um livro");

        listaTarefas.exibirTarefas();
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());

        listaTarefas.removerTarefa("preparar o jantar");
        listaTarefas.removerTarefa("lavar a louça");
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());

        listaTarefas.marcarTarefaConcluida("ler um livro");
        listaTarefas.marcarTarefaConcluida("responder e-mails");
        listaTarefas.marcarTarefaConcluida("estudar para a prova");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("estudar para a prova");
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();
        
    }
}
