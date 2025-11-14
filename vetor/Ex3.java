import java.util.Scanner;
 
public class ExVetores {
 
	public static void main(String[] args) {	    
	        Scanner ler = new Scanner(System.in);
	        int i,j;
	        int cont =0;
	        final int TAM = 10;
	        int[] a = new int[TAM];
	        
	        	   
	        for( i = 0; i<TAM; i++) {
	        	System.out.println("Digite o " + (i+1) + "° numero" );
	        	a[i] = ler.nextInt();
	        }
	         //aqui para testar os Números
	        for(i=0; i<TAM; i++) {
	        	cont = 0;
	     
	        	//aqui Testa os Divisores
	        	for(j=1;j <=a[i]; j++) {
	        		if(a[i] % j ==0) {
	        		cont++;
	        	}
	        }
	        
	        
	        if(a[i] > 1 && cont ==2) {
	        	System.out.println(a[i] + " é primo");
	        }else {
	        	System.out.println(a[i] + " não é primo");
	        }
	        
	        
	      }
	 }
}
