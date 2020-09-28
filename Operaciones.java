/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

/**
 *
 * @author Sayad
 */
public class Operaciones {
    
    //Numero primo solo es divisible entre si mismo y uno
    public boolean NPrimo(int N){
        boolean Primo = true;
        int Result;        
        
        
        for (int i = 2; i<=N; i++){
            
            Result = N%i;
            
            
            // Si 3%2 = 1
            // Si El residuo es difernete de 0 e i es diferente del numero
            
            if((Result==0)&&(i!=N)){
            Primo = false;
            break;
            }
        }
        return Primo;
        
    }
    //Numero Primo
    public boolean NPrimos(int N){
        
        int index = 2;
        boolean primo=true;
        while ((primo) && (index!=N)){
            if (N % index == 0){
            primo = false;
            index++;
            }
            return primo;
        }
        return primo;
        
    };
    
    public void ImprimirPrimos(int N){
        for(int i = 2; i<=N; i++ ){
            if (NPrimo(i) == true){
                System.out.print(i + " ");
            }
        }
     }
    
    
    //Fibonacci
    private int Fibonacci(int N){
        if(N>1){
            return Fibonacci(N-1) + Fibonacci(N-2);
        }
        
        else if (N==1) { 
            return 1;
        }
        
        else if (N==0){
            return 0;
        }
        
        else{
            System.out.println("Error");
            return -1; 
        }
        
    }
    
    public void ImprimirFibonacci(int N){
        for (int i = 0; i < N; i++) {
            System.out.print(Fibonacci(i)+" ");
        }
        System.out.println();
    }
    
    
    
    
}
