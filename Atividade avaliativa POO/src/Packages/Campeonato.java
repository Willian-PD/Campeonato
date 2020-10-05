package Packages;

public class Campeonato {
    int pontos1;
    int pontos2;

    public void resultadoPartida(ITime time1, int gols1, ITime time2, int gols2) {
        if (gols1 > gols2) {
            time1.adicionarVitoria();
            time2.adicionarDerrota();
        } else if (gols2 > gols1) {
            time2.adicionarVitoria();
            time1.adicionarDerrota();

        } else {
            time1.adicionarEmpate();
            time2.adicionarEmpate();
        }
    }

    public void listarRank(ITime time1, ITime time2, ITime time3, ITime time4) {
        System.out.println("******************");
        System.out.println("Classificacao Campeonato Carioca");
        System.out.println("******************");
        System.out.println("Pontos	  Nome   	Jogos   Empate   Vitória    Derrota");
        System.out.println("" + time1.totalPontos() + "         " + time1.printNomeTime() + "         " + time1.totaljogo() + "      " + time1.getEmpate() + "       " + time1.getVitoria() + "          " + time1.getDerrota());
        System.out.println("" + time2.totalPontos() + "         " + time2.printNomeTime() + "         " + time2.totaljogo() + "      " + time2.getEmpate() + "       " + time2.getVitoria() + "          " + time2.getDerrota());
        System.out.println("" + time4.totalPontos() + "         " + time4.printNomeTime() + "         " + time4.totaljogo() + "      " + time4.getEmpate() + "       " + time4.getVitoria() + "          " + time4.getDerrota());
        System.out.println("" + time3.totalPontos() + "         " + time3.printNomeTime() + "         " + time3.totaljogo() + "      " + time3.getEmpate() + "       " + time3.getVitoria() + "          " + time3.getDerrota());
        System.out.println("*******************************************************");
    }
}