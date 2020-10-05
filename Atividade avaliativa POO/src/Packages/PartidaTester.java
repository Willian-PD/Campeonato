package Packages;

public class PartidaTester {
    public static void main(String[] args) {

        Flamengo flamengo = new Flamengo();
        Fluminense fluminense = new Fluminense();
        Vasco vasco = new Vasco();
        Botafogo botafogo = new Botafogo();
        Campeonato campeonato = new Campeonato();

        campeonato.resultadoPartida(flamengo, 1, vasco, 1);
        campeonato.resultadoPartida(flamengo, 3, fluminense, 2);
        campeonato.resultadoPartida(flamengo, 3, botafogo, 1);
        campeonato.resultadoPartida(flamengo, 1, vasco, 0);
        campeonato.resultadoPartida(fluminense, 2, botafogo, 1);
        campeonato.resultadoPartida(fluminense, 3, botafogo, 1);
        campeonato.resultadoPartida(fluminense, 2, vasco, 1);
        campeonato.resultadoPartida(vasco, 1, botafogo, 2);

        campeonato.listarRank(flamengo, fluminense, vasco, botafogo);
    }
}
