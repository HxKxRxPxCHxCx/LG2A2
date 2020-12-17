import  java.util.Scanner ;

public  class  Tarefa3 {
    public  static  void  main ( String [] args ) {
        Scanner ent =  novo  Scanner ( Sistema . In);
        int num, maior =  0 , menor =  100 , media =  0 , soma =  0 ;
        int contMaior =  0 , contMenor =  0 , i;
        
        para (i =  0 ; i <  3 ; i ++ ) {
            Sistema . para fora . println ( " Digite um número entre 0 e 100 " );
            num = ent . nextInt ();
            
            // validação
            if ((num <  1 ) || (num >  100 )) {
                i = i -  1 ;
            } else {
                // armazena os nº digitados
                soma = soma + num;

                // armazena o maior nº
                if (num > maior) {
                    maior = num;
                    contMaior ++ ;
                }

                // armazena o menor nº
                if (num < menor) {
                    menor = num;
                    contMenor ++ ;
                }   
            
            } // fim validação
        } // fim para
        
        Sistema . para fora . println ( " O maior nº digitado foi "  + maior);
        Sistema . para fora . println ( " O menor nº digitado foi "  + menor);
        Sistema . para fora . println ( " A média foi "  + (media = soma / i));
        
    } // fim class main
} // fim class principal