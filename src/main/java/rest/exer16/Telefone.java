package rest.exer16;

import javax.xml.bind.annotation.XmlRootElement;

//Declaração de Elemento JAXB para conversão automatica.
@XmlRootElement
public class Telefone {
    private String nome;
    private String fone;
    public Telefone() {
    }
    public Telefone(String nome, String fone) {
        super();
        this.nome = nome;
        this.fone = fone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
}


