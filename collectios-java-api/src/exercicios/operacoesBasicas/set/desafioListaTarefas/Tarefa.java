package exercicios.operacoesBasicas.set.desafioListaTarefas;

public class Tarefa {
    private String descricao;
    private boolean realizada;

    public Tarefa(String descricao, boolean realizada) {
        this.descricao = descricao;
        this.realizada = realizada;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    @Override
    public String toString() {
        return "{Tarefa: " + descricao + ", Realizada: " + realizada + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }

    
}
