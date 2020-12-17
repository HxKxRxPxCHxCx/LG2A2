package calcular;


public class Operacao {
double resultado[];

public double somar (double valor1, double valor2){
resultado[0]=valor1+valor2;
return resultado[0]; }

public double subtrair (double valor1, double valor2){
resultado[1]=valor1-valor2;
return resultado[1]; }

public double multiplicar (double valor1, double valor2){
resultado[2]=valor1*valor2;
return resultado[2]; }

public double dividir (double valor1, double valor2){
resultado[3]=valor1/valor2;
return resultado[3]; }

}

package calcular;

import javax.swing.JOptionPane;

public class Calcular {

public static void main(String[] args) {
    
int opc;
Operacao operacao=new Operacao();
opc= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite uma opção:\n1- somar\n2- subtrair\n3- Multiplicar\n4- Dividir ",“OPERAÇÃO”,JOptionPane.PLAIN_MESSAGE));

if(opc==1){
operacao.resultado[0]=JOptionPane.showInputDialog(null,“O Resultado é”+resultado[0],“OPERAÇÃO”,JOptionPane.PLAIN_MESSAGE));
}

if(opc==2){
}


if(opc==3){
}

if(opc==4){
}
}

}


class Principal {
public static void main(String[] args) {

OperacaoMatematica operacoesMatematicas = new OperacaoMatematica();

	 /*Array para guardar os resultados*/
	 int[] guardaOsResultados = new int[100];

	/*Escolhendo qual método/operações matemática usar*/
	 int soma1 = operacoesMatematicas.dividi(10, 2);
	
	 /*Guardando o resultado no array*/
	 guardaOsResultados[0] = soma1; 
	 
	 /*Escolhendo qual método/operações matemática usar*/
	 operacoesMatematicas.soma(10, 2);
	 
	 /*Escolhendo qual método/operações matemática usar*/
	 operacoesMatematicas.multiplica(10, 2);
	 
	 /*Escolhendo qual método/operações matemática usar*/
	 operacoesMatematicas.dividi(10, 2);

	//Ou você pode implementar mais ou menos assim: (se 1 for diferente de 1 ele vai somar o que daria 2, como 1 é igual a 1 o resultado será 1, a multiplicação)
	/* if(1 != 1){
		 operacoesMatematicas.soma(1, 1);
	 }
	 else{
		 operacoesMatematicas.multiplica(1, 1);
	 }*/

}