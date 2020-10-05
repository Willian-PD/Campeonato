package Packages;

public class Botafogo extends TimeDeFutebol implements ITime {
    private String nome;
    private int qtdVitoria;
    private int qtdEmpate;
    private int qtdDerrota;
    private int totalPontos;
    private int totaljogo;

    public Botafogo() {
        nome = "Botafogo";
    }

    @Override
    public String printNomeTime() {
        return nome;
    }

    @Override
    public void adicionarVitoria() {

        qtdVitoria = +qtdVitoria + 1;
    }

    @Override
    public void adicionarEmpate() {
        qtdEmpate = qtdEmpate + 1;
    }

    @Override
    public void adicionarDerrota() {
        qtdDerrota = +qtdDerrota + 1;
    }

    @Override
    public int totalPontos() {
        totalPontos = qtdEmpate + (qtdVitoria * 3);
        return totalPontos;
    }

    @Override
    public int getVitoria() {
        return qtdVitoria;
    }

    @Override
    public int getDerrota() {
        return qtdDerrota;
    }

    @Override
    public int getEmpate() {
        return qtdEmpate;
    }

    @Override
    public int totaljogo() {
        totaljogo = qtdDerrota + qtdEmpate + qtdVitoria;
        return totaljogo;
    }

    // getter
    public String getnome() {
        return nome;
    }

    public int qtdVitoria() {
        return qtdVitoria;
    }

    public int qtdEmpate() {
        return qtdEmpate;
    }

    public int qtdDerrota() {
        return qtdDerrota;
    }

    // setter
    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setqtdVitoria(int qtdVitoria) {
        this.qtdVitoria = qtdVitoria;
    }

    public void setqtdEmpate(int qtdEmpate) {
        this.qtdEmpate = qtdEmpate;
    }

    public void setqtdDerrota(int qtdDerrota) {
        this.qtdDerrota = qtdDerrota;
    }
}