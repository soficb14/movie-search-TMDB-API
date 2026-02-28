import java.util.Scanner;
import model.RespostaApi;
import model.Filme;
import service.TMDBService;


public class Main {
    public static void main(String[] args) throws Exception {

        String token = System.getenv("TMDB_TOKEN");
        TMDBService service = new TMDBService(token);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do filme:");
        String nomeFilme = scanner.nextLine();

        RespostaApi resposta = service.buscarFilme(nomeFilme);
        if(resposta.getResults() == null || resposta.getResults().isEmpty()){
            System.out.println("Nenhum filme encontrado.");
        }


        System.out.println("\n=== RESULTADOS ===");

        for (Filme filme: resposta.getResults()) {
            System.out.println("Título: " + filme.getTitle());
            System.out.println("Título original: " + filme.getOriginal_title());
            System.out.println("Ano: " + filme.getRelease_date());
            System.out.println("Nota: " + filme.getVote_average() + "\n");
        }


    }
}