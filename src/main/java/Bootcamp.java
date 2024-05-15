package main.java;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private String nome;
    private String descricao;
    private Set<Conteudo> conteudos;
    private Set<Dev> devs;

    public Bootcamp(LocalDate dataInicial, LocalDate dataFinal, String nome, String descricao) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.nome = nome;
        this.descricao = descricao;
        this.conteudos = new HashSet<Conteudo>();
        this.devs = new HashSet<Dev>();
    }

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    public void adicionarDevs(Dev dev) {
        devs.add(dev);
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void ImprimiDevs() {
        devs.forEach(dev -> System.out.println(dev.getNome()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bootcamp) {
            Bootcamp bootcamp = (Bootcamp) obj;
            return bootcamp.getNome().equals(this.getNome());
        }
        return false;
    }

}