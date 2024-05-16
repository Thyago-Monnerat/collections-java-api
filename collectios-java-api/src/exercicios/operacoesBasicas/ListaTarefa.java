package exercicios.operacoesBasicas;
import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaLista;

    public ListaTarefa(){
        this.tarefaLista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaLista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for(Tarefa t : tarefaLista){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t);
            }
        }
        tarefaLista.removeAll(tarefasRemover);
    }

    public int obterTotalTarefas(){
        return tarefaLista.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaLista);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println(listaTarefa.obterTotalTarefas());
        
        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa13");
        
        System.out.println(listaTarefa.obterTotalTarefas());
        
        listaTarefa.removerTarefa("Tarefa1");

        System.out.println(listaTarefa.obterTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
