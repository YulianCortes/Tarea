public static void main(String[] args) {
            Scanner entrada = new(Scanner(System.in))
             int opcion = 0;

            
            if(opcion == 1){
                System.out.println("MENU PRODUCTOS");
                System.out.println("1. Caffe latte");
                System.out.println("2. Chocolate");
                System.out.println("3. Tinto");
                System.out.println("4. Volver al menu principal");
                if(opcion == 1){
                    System.out.println("Has elegido Caffe latte");
                } else if(opcion == 2){
                    System.out.println("Has elegido Chocolate");
                } else if(opcion == 3){
                    System.out.println("Has elegido Tinto");
                } else if(opcion == 4){
                    System.out.println("Volviendo al menu principal");
                } else {
                    System.out.println("Opcion invalida");
                }
            } else if(opcion == 2){
                System.out.println("MENU COMPRAS");
                System.out.println("1. COMPRAR UNA UNIDAD");
                System.out.println("2. COMPRAR DOS UNIDADES");
                System.out.println("3. COMPRAR TRES UNIDADES");
                System.out.println("4. Volver al menu principal");
                if(opcion == 1){
                    System.out.println("Has elegido una unidad"); 
                } else if(opcion == 2){
                    System.out.println("Has elegido dos unidades");
                } else if(opcion == 3){
                    System.out.println("Has elegido tres unidades");
                } else if(opcion == 4){
                    System.out.println("Volviendo al menu principal");
                } else {
                    System.out.println("Opcion invalida");
                } 
            }else {
                System.out.println("Opcion invalida");          
                }
    }


