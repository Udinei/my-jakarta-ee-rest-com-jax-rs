package rest.exer5;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

// Declaração de Elemento JAXB para conversão automatica.
@XmlRootElement
public class Funcionario {

    private String nome;
    private Long cpf;
    private BigDecimal salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
    }
}
