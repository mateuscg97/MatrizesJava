import javax.swing.JOptionPane;
class ExA {
	public static void main(String[] args) {
		//Declarar a matriz:
		double A[][] = new double[3][3];
		//Declarar contador linha e coluna:
		int l,c;
		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				A[l][c] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do elemento l: " + l+ " c: "+ c));
			}
		}
//		double soma = 0;
				
//		a) soma primeira coluna:
//		-------------------------------------------------
		/*
		for (l = 0; l < 3; l++) {
			c = 0;
			soma += A[l][c];
		}
		JOptionPane.showMessageDialog(null,"Soma da primeira coluna = " + soma);
		*/
		
//		b) soma de cada coluna
//		-------------------------------------------------		
		/*
		for (c = 0; c < 3; c++){
			soma = 0;
			for (l = 0; l < 3; l++) {
				soma += A[l][c];
			}
			JOptionPane.showMessageDialog(null,"Soma da coluna "+ c +" = " + soma);
		}
		*/
		
//		c) produto primeira linha:
//		-------------------------------------------------		
		/*
		l = 0;
		double produto = 1;
		for(c = 0; c<3; c++){
			produto *= A[l][c];
		}
		JOptionPane.showMessageDialog(null, produto);
		*/
		
//		d) soma de toda a matriz
//		-------------------------------------------------
		/*
		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				soma += A[l][c];
			}
		}
		JOptionPane.showMessageDialog(null, soma);
		*/
		
		
//		-------------------------------------------------
//		e) soma
//		-------------------------------------------------
//		f) media e compara:
//		for (l = 0; l < 3; l++) {
//			for (c = 0; c < 3; c++) {
//				soma += A[l][c];
//			}
//		}
//		e)
//		JOptionPane.showMessageDialog(null, soma / 9);

//		f)
//		double media = soma / 9;
//		for (l = 0; l < 3; l++) {
//			for (c = 0; c < 3; c++) {
//				if(A[l][c] > media ){
//					JOptionPane.showMessageDialog(null, "l: " + l + " c: "+c+" = "+A[l][c]+" e é maior que a média: "+media);
//				}
//			}
//		}




//		-------------------------------------------------
//		g) maior elemento
//		-------------------------------------------------
//		double maiorLinha =0;
//		double maiorColuna = 0;
//		double maiorValor = 0;
//		
//		for (l=0; l<3;l++) {
//			for (c= 0; c<3;c++) {
//				if(l== 0 && c==0){
//					maiorLinha = l;
//					maiorColuna = c;
//					maiorValor = A[l][c];
//				}else{
//					if (A[l][c] > maiorValor) {
//						maiorLinha = l;
//						maiorColuna = c;
//						maiorValor = A[l][c];
//					}
//				}
//			}
//		}
//		JOptionPane.showMessageDialog(null,"O maior valor é: " + maiorValor+ " que esta na coluna: " + maiorColuna + " e na linha: " + maiorLinha);




//		-------------------------------------------------
//		h) menor elemento e posição
//		-------------------------------------------------
//		double menorLinha =0;
//		double menorColuna = 0;
//		double menorValor = 0;
//		
//		for (l=0; l<3;l++) {
//			for (c= 0; c<3;c++) {
//				if(l== 0 && c==0){
//					menorLinha = l;
//					menorColuna = c;
//					menorValor = A[l][c];
//				}else{
//					if (A[l][c] < menorValor) {
//						menorLinha = l;
//						menorColuna = c;
//						menorValor = A[l][c];
//					}
//				}
//			}
//		}
//		JOptionPane.showMessageDialog(null,"O maior valor é: " + menorValor+ " que esta na coluna: " + menorColuna + " e na linha: " + menorLinha);




//		-------------------------------------------------
//		i) diagonal principal
//		-------------------------------------------------
//		int d;
//		for(d = 0; d < 3; d++){
//			JOptionPane.showMessageDialog(null, A[d][d]);
//		}



//		-------------------------------------------------
//		j) triangulo superior
//		-------------------------------------------------
//		for (l = 0; l < 3; l++) {
//			for (c = l + 1; c < 3; c++) {
//				JOptionPane.showMessageDialog(null, l+ " : " +c);
//			}
//		}



//		-------------------------------------------------
//		k) triangulo inferior
//		-------------------------------------------------
//		for (l = 0; l < 3; l++) {
//			for (c = 0; c < l; c++) {
//				JOptionPane.showMessageDialog(null, l+ " : " +c);
//			}
//		}



//		-------------------------------------------------
//		l) Soma Diagonal Principal
//		-------------------------------------------------
//		int d;
//		double soma = 0;	
//		for(d = 0; d < 3; d++){
//			soma += A[d][d];
//		}
//		JOptionPane.showMessageDialog(null, "Soma: "+soma);


//		-------------------------------------------------
//		m) Diagonal Secundaria
//		-------------------------------------------------
//		for(l = 2; l >= 0; l--){
//			JOptionPane.showMessageDialog(null, A[l][2 - l]);
//		}



//		-------------------------------------------------
//		n) Triangulo superior secundario
//		-------------------------------------------------
//		for(l = 0; l < 2; l++){
//			for(c = 0; l + c < 2; c++){
//				JOptionPane.showMessageDialog(null, A[l][c]);
//			}
//		}

//		-------------------------------------------------
//		o) Triangulo inferior secundario
//		-------------------------------------------------

// nao tenho certeza que sempre vai funcionar
//		int o = 3;
//		int soma = 0;
//		for (l = 1; l <= 2; l++) {
//			for (c = o - l; c < o;  c++ ){
//				soma += A[l][c];
//				JOptionPane.showMessageDialog(null, l + " : "+ c);
//			}
//		}
//		JOptionPane.showMessageDialog(null, soma);

//		-------------------------------------------------
//		o) Soma diagonal secundaria
//		-------------------------------------------------
		JOptionPane.showMessageDialog(null, "Hello");
	}
}