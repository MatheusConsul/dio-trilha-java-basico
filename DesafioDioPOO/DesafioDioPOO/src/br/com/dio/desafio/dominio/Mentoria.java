package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\tMentoria: \n  titulo= " + getTitulo() + "\n  Descricao= " + getDescricao() + "\n  Data=" + data + "\n";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }



    
}
