package cartas;
import java.util.Random;
import java.util.Scanner;
public class cartas {
	
	
	
	public static void main(String[] args) {
		
		Random rand = new Random();
	    Scanner scanner = new Scanner(System.in); 
	    do {
			
			System.out.println("OPRIMA ENTER PARA REPETIR");
			String input = scanner.nextLine();
		
			if (input.isEmpty()) { 
				
	    int dado1 = rand.nextInt(13) + 1;
	    int dados2 = rand.nextInt(10) + 1; 
	    int total;
	    int suma;
		int J=10;
		int Q=10;
		int K=10;
		 
	    System.out.println("EL RESULTADO DE LA PRIMERA CARTA ES:" + dado1);
	    
	   switch (dado1) {
	   	case 11: { 
	   		dado1=11;
	   		System.out.println("J" );
	   		}
	  break;
	   	case 12: { 
	   		dado1=12;
	   		System.out.println("Q" );
	   		}
	  break;
	   case 13: {
		   dado1=13;
		   System.out.println("K" );
		   break;
	   		}
	 
	   }
	
	   System.out.println("EL RESULTADO DE LA SEGUNDA CARTA ES:" + dados2);
	  

	   total= dado1+dados2;
	switch (total) {
	case 12:
	if(dado1 == 11 && dados2 == 1) {
        System.out.println("GANÓ CON 11"); 
    } else if (total == 12) {
        System.out.println("Repetir con 12");
    }
	
	break;
	case 13: {
		
		if (dado1==12 && dados2==1) {
			System.out.println("GANÓ CON 11");
			System.out.println("GANAS ESTA PARTIDA");
		}	
	}
	break;
	
	case 14: {
		if (dado1==13 && dados2==1) {
			System.out.println("GANÓ CON 11");
			System.out.println("GANAS ESTA PARTIDA");
		} else if (total==14) {
			System.out.println("medio ganaste");
		}
	}
	break;
	
	case 2: {
		total=2;
		System.out.println("GANAS ESTA PARTIDA");
	}
	break;
	
	case 21: { 
		if (total==21) {
			System.out.println("HAS OBTENIDO UNA SUMATORIA IGUAL A 21, SI OBTIENES UNA MAYOR PIERDES");
		}

		else if (total>21) {
			System.out.println("HAS OBTENIDO UNA SUMATORIA MAYOR A 21, PIERDES");
		}
	}
	break;
			
	}// del cierre del switch
	
			}
		 else if (input.equalsIgnoreCase("9")) {
	        System.out.println("JUEGO FINALIZADO.");
	        break; 
	    } 
		
		} while (true);
		 
	   }//del public
     }
