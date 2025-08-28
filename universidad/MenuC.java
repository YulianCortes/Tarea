public class MenuC {
        public static void main(String[] args) {
            scanner entrada = new scanner9(System.in);
            System.out.println("Menu");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            int opcion = entrada.nextInt();
            if(opcion == 1){
                System.out.println("Has elegido la opcion 1");
            } else if(opcion == 2){
                System.out.println("Has elegido la opcion 2");
            } else if(opcion == 3){
                System.out.println("Has elegido la opcion 3");
            } else {
                System.out.println("Opcion invalida");          
            }
            
    }
}
