import java.util.Scanner;
public class Calculoconsumo {
	public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
       
        Double distancia,capacidade,consumo;
        
        System.out.println("Digite a distancia percorrida em km/h:");
        distancia = in.nextDouble();
        System.out.println("Digite a capacidade de combustivel do carro, em litros :");
        capacidade = in.nextDouble();
        consumo = (distancia/capacidade);
        System.out.println("O consumo médio de combustivel é:"+consumo);
        if (consumo>=10) {
            System.out.println("Economico");
        }
        else if(consumo<10){
            System.out.println("Não economico");
        }
    }

}
