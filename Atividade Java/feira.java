import java.util.Scanner;

public class feira {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		fruta melancia = new fruta(4000, 5);
		fruta manga = new fruta();
		
		System.out.print("Quantidade de gramas..:");
		manga.gramas=scanner.nextInt();
		
		System.out.print("Quantidade calorias por grama..:");
		manga.calorias_por_gramas=scanner.nextInt();
		
		System.out.println("Manga-Qte gramas:"+manga.gramas+"Calorias por grama:"+manga.calorias_por_gramas);
    }

   
}