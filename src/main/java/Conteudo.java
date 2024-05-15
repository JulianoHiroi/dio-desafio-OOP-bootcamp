package main.java;

public abstract class Conteudo {
    private String titulo;
    private String descricao;

    final protected static Double XP_PADRAO = 10d;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    abstract public Double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Conteudo) {
            Conteudo conteudo = (Conteudo) obj;
            return conteudo.getTitulo().equals(this.getTitulo());
        }
        return false;
    }

}