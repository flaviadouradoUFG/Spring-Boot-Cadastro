package com.ufg.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long aluno_id;

    @Column
    private String nome;

    @Column
    private String matricula;

    @Column
    @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinTable(name = "aluno_livro", joinColumns = @JoinColumn(name = "aluno_id"), inverseJoinColumns = @JoinColumn(name = "livro_id"))
    private List<Livros> livros;

    public Aluno(){}

    public Aluno(long aluno_id, String nome, String matricula, List<Livros> livros) {
        this.aluno_id = aluno_id;
        this.nome = nome;
        this.matricula = matricula;
        this.livros = livros;
    }

    //Getters and Setters

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getAluno_id() {
        return aluno_id;
    }

    public void setAluno_id(long aluno_id) {
        this.aluno_id = aluno_id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Livros> getLivros() {
        return livros;
    }

    public void setLivros(List<Livros> livros) {
        this.livros = livros;
    }

    //ToString
    @Override
    public String toString() {
        return "Aluno{" +
                "aluno_id=" + aluno_id +
                ", Nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", livros=" + livros +
                '}';
    }
}

