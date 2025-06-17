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

    public static void printTriangleStar(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print('\n');
    }

    public static void printMirrorTriangleStar(){
        for(int i = 0; i < 4; i++){
            for(int j = i; j < 4; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print('\n');
    }

    public static void printHalfDiamond(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i = 0; i < 3; i++){
            for(int j = i; j < 3; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print('\n');
    }

    public static void printPyramid(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5-1-i; j++){
                System.out.print(' ');
            }
            for(int k = 1; k <= (2 * i + 1); k++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print('\n');
    }

    public static void printHollowPyramid(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5-1-i; j++){
                System.out.print(' ');
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                if (k == 0 || k == (2 * i) || i == 5 - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        System.out.print('\n');
    }
}
