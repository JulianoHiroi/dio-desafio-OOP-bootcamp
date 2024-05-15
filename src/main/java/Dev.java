package main.java;

import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;

    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidos;
    private Set<Bootcamp> bootcamps;

    public Dev(String nome) {
        this.nome = nome;
        conteudosInscritos = new HashSet<Conteudo>();
        conteudosConcluidos = new HashSet<Conteudo>();
        bootcamps = new HashSet<Bootcamp>();
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcamp.adicionarDevs(this);
        bootcamp.getConteudos().forEach(conteudo -> inscreverConteudo(conteudo));
        bootcamps.add(bootcamp);
    }

    public void inscreverConteudo(Conteudo conteudo) {
        conteudosInscritos.add(conteudo);
    }

    public void progredir(Conteudo conteudo) {
        conteudosConcluidos.add(conteudo);
        conteudosInscritos.remove(conteudo);

    }

    public Double calcularTotalXp() {
        return conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
    }

    public void imprimirBootcamps() {
        bootcamps.forEach(bootcamp -> System.out.println(bootcamp.getNome()));
    }

    public void imprimirConteudosInscritos() {
        conteudosInscritos.forEach(conteudo -> System.out.println(conteudo.getTitulo()));
    }

    public String getNome() {
        return nome;
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
        if (obj instanceof Dev) {
            Dev dev = (Dev) obj;
            return dev.getNome().equals(this.getNome());
        }
        return false;
    }

}
