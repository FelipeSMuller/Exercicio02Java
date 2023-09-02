package senaiprojetos;

import javax.swing.JOptionPane;


public class Exercicio02 {

	public static void main(String[] args) {

		/*Crie um array de strings com 3 elementos e preencha-os com nomes de cores. Em seguida, imprima
		os nomes das cores armazenados no array.
		 * */
		
		String Cor;
		String entradaUsuario;
		String [] cores = new String [3];
		
		cores[0] = "Vermelho";
		cores[1] = "Rosa";
		cores[2] = "Verde";
		
		entradaUsuario = JOptionPane.showInputDialog(null , "Digite uma cor : ");
		Cor = entradaUsuario.toLowerCase();
		
		switch(Cor) {
		case "vermelho":
			JOptionPane.showMessageDialog(null, "A cor escolhida foi : " + cores[0] + " e está presente em nosso banco de dados");
			break;
		case "rosa":
			JOptionPane.showMessageDialog(null, "A cor escolhida foi : " + cores[1] + " e está presente em nosso banco de dados");
			break;
		case "verde":
			JOptionPane.showMessageDialog(null, "A cor escolhida foi : " + cores[2] + " e está presente em nosso banco de dados");
			break;
			default : 
				JOptionPane.showMessageDialog(null, "Nenhuma cor foi encontrada para os parametros estabelecidos !!!");
				break;
				
		}
		

		
	}

}
