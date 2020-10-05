package Packages;

public class Fluminense extends TimeDeFutebol implements ITime {
    private String nome;
    private int qtdVitoria;
    private int qtdEmpate;
    private int qtdDerrota;
    private int totalPontos;
    private int totaljogo;

    public Fluminense() {
        nome = "Fluminense";
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

    public int getqtdVitoria() {
        return qtdVitoria;
    }

    public int getqtdEmpate() {
        return qtdEmpate;
    }

    public int getqtdDerrota() {
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
