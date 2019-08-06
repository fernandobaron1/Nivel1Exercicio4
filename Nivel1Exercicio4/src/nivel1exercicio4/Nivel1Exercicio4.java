
package nivel1exercicio4;

import java.util.Scanner;


public class Nivel1Exercicio4 {

   
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println ("Informe o Salário");
        double salario = leia.nextDouble();
        
        System.out.println ("Informe quantos anos o funcionário trabalha na empresa");
        int anosEmpresa = leia.nextInt();
        
       
        if (anosEmpresa <= 2) {
    System.out.println (salario + (salario * 5/100)); 
    } else if ((anosEmpresa >2) & (anosEmpresa <=5))  {
            System.out.println (salario + (salario * 10/100));                
    } else if (anosEmpresa >5) {
            System.out.println (salario + (salario * 15/100));
    }

    }
    
}
