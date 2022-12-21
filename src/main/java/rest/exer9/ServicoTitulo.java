package rest.exer9;

import java.util.List;

public interface ServicoTitulo {
    void gravar(Titulo titulo) throws NegocioException;
    void deletar(String sacado) throws NegocioException;
    List<Titulo> listar() throws NegocioException;
}


