import java.util.Scanner;

public class MédiaEscolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exemplo Média aluno
		
		Scanner objetoNota = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a nota 1: ");
		nota1 = objetoNota.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		nota2 = objetoNota.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		nota3 = objetoNota.nextDouble();
		
		System.out.println("Digite a nota 4: ");
		nota4 = objetoNota.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 7) {
			
			System.out.println("Média: " + media + " - Situação: APROVADO(A)!" );
		}
		
		else if(media >= 2) {
			
			System.out.println("Média: " + media + " - Situação: RECUPERAÇÃO!" );
		}
		
		else {
			System.out.println("Média: " + media + " - Situação: REPROVADO(A)!" );
		}

	}

}
