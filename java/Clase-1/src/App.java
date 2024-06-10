import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a la maquina expendedora de Aegir");
        System.out.println("Por favor, eliga que bebidas deseas compra!");
        System.out.println("1 - Vino");
        System.out.println("2 - Cerveza");  
        System.out.println("3 - Vodka"); 

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Buena eleccion, disfrute de su vino");
                break;
            case 2:
                System.out.println("Buena eleccion, disfrute de su cerveza");
                break;
            case 3:
                System.out.println("Buena eleccion, disfrute de su Vodka");
                break;
            default:
            System.out.println("Opcion incorecta!");
                break;
        }
        if (option <= 4) {
            System.out.println("Muchas gracias por la compra! vuelva pronto");
        }
        scanner.close();
    }


    }

    