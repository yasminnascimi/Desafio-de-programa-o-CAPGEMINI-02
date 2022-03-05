
public class Questao1 {

//Inicio declarando a classe Questao1 como public pois assim poderá ser utilizada por todas as classes do projeto.
	
	public static void main(String[] args) {
		// Aqui definimos um array de números ímpares, você pode mudar os numeros a vontade
		int [] arr = {8, 2, 5, 3, 6};
		// Define agora variável auxiliar para troca de valores
		int aux = 0;
		//Loop ocorre para percorrer o array comparando os valores
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				// Testando se uma posição do array é menor que a outra
				if(arr[i] < arr[j]) {
					// Trocando os valores de maneira ordenada
					aux = arr[i];
					arr[i] = arr[j];
					arr[j] = aux;
				}
			}
		}
		// Calculo da mediana
		int n = (int) arr[Math.round(arr.length / 2)];
		// Resultado: imprissao da mediana do array 
		System.out.println(n);
	}
}