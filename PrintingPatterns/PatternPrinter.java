public class PatternPrinter {
    public static void printSquarePattern(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public static void printHollowSquarePattern(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 || i == 3) {
                    System.out.print('*');
                }
                else{
                    if(j == 0 || j == 3) {
                        System.out.print('*');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public static void printRectanglePattern(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 6; j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public static void printHollowRectanglePattern(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 6; j++){
                if(i == 0 || i == 3) {
                    System.out.print('*');
                }
                else{
                    if(j == 0 || j == 5) {
                        System.out.print('*');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public static void printRhombus(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < i; j++){
                System.out.print(' ');
            }
            for(int j = 0; j < 4; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print('\n');
    }

    public static void printParallelogram(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < i; j++){
                System.out.print(' ');
            }
            for(int j = 0; j < 6; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print('\n');
    }

    public static void printMirroredRhombus(){
        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 4 - 1 - i; j++){
                System.out.print(' ');
            }
            for(int j = 0; j < 4; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print('\n');
    }
}
