package negocio;

import java.util.Collections;
import java.util.List;

import entidade.Pessoa;
import excecoes.EntidadeDuplicadaException;
import excecoes.EntidadeNaoEncontradaException;
import persistencia.PessoaPersistencia;

public class PessoaNegocio {

    private PessoaPersistencia persistencia;

    public PessoaNegocio() {
        this.persistencia = new PessoaPersistencia();
        persistencia.carregaPessoas();
    }

    public void salvarPessoas() {
        persistencia.salvaPessoas();
    }

    public void inserir(Pessoa pessoa) {
        var pessoaBusca = buscaPorCpf(pessoa.getCpf());

        if (pessoaBusca != null) {
            throw new EntidadeDuplicadaException("Pessoa", pessoa.getCpf());
        }

        persistencia.getPessoas().add(pessoa);
    }

    public void remover(Long cpf) {
        var pessoaBusca = buscaPorCpf(cpf);

        if (pessoaBusca == null) {
            throw new EntidadeNaoEncontradaException("Pessoa", cpf);
        }

        persistencia.getPessoas().remove(pessoaBusca);
    }

    public List<Pessoa> buscarPessoas() {
        var pessoas = persistencia.getPessoas();
        Collections.sort(pessoas);
        return pessoas;
    }

    public Pessoa buscaPorCpf(Long cpf) {
        var pessoas = persistencia.getPessoas();
        for (var p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }

}
