
public class Questao3 {
//Inicio declarando a classe Questao3 como public pois assim poderá ser utilizada por todas as classes do projeto.

	public static void main(String[] args) {
		//Defino a string s com uma frase profetica
		String s = "Eu vou entrar para a Academia Capgemini";
		//Removendo o espaço em branco da string
		String semEspaco = s.replaceAll("\\s+", "");
		//Separando a string com o metodo split
		String[] arrS = semEspaco.split("");

		int grid = (int) Math.round(Math.sqrt(semEspaco.length()));
		// Retorna a raiz quadrada de um número sqrt
		String[][] gridS = new String[grid][grid];

		int init = 0;

		for (int i = 0; i < grid; i++) {

			int j = 0;

			while (j < grid && init < arrS.length) {
				gridS[i][j] = arrS[init];
				j++;
				init++;
			}
		}

		for (int i = 0; i < grid; i++) {
			String resultado = "";
			for (int j = 0; j < grid; j++) {
				if (gridS[j][i] == null) {
					break;
				}
				resultado = resultado + gridS[j][i];
			}
			// Como resultado obteve-se a impressao encriptada da string s
			System.out.print(resultado);
			System.out.print(" ");
		}
	}
}
