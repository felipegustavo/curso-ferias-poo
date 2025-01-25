package entidade;

public class Funcionario implements Comparable<Funcionario> {

    private long cpf;
    private String nome;

    public Funcionario(long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // 0 = iguais
    // < 0 = o objeto "o" é maior
    // > 0 = o objeto "o" é menor
    @Override
    public int compareTo(Funcionario o) {
        int r = this.nome.compareTo(o.nome);
        if (r == 0) {
            return Long.compare(this.cpf, o.cpf);
        }
        return r;
    }

    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", nome=" + nome + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cpf ^ (cpf >>> 32));
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Funcionario other = (Funcionario) obj;
        if (cpf != other.cpf)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    

}
