
public class Questao2 {
	//Inicio declarando a classe Questao2 como public pois assim poderá ser utilizada por todas as classes do projeto.
	
	public static void main(String[] args) {
		// Aqui definimos novamente um array de números
		int[] n = {3, 7, 5, 6, 4};
		// Definindo a variável da diferença alvo
		int x = 2;
		// Define a variável contadora
		int contador = 0;
		// Loop ocorre para percorrer o array e comparar os valores encontrados
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n.length; j++) {
				// Calculando a diferença e compara com o valor de x, contando se verdadeiro
				if(n[i]-n[j] == x || n[j]-n[i] == x) {
					contador++;
				}
			}
		}
		// Como resultado obteve-se a impressao do número de elementos pares do vetor que tem uma diferença igual ao valor de x
		System.out.println(contador/2);
	}
}
