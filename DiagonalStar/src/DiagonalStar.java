public class DiagonalStar {
    public static void printSquareStar( int number ) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }else {
            for (int rowIndex=1; rowIndex <= number; rowIndex++){
                String row = "";
                for (int columnIndex=1; columnIndex <= number; columnIndex++){
                    if (columnIndex == 1 || columnIndex == number || rowIndex == 1 || rowIndex == number || rowIndex == columnIndex || number - rowIndex + 1 == columnIndex){
                        row += "*";
                    }else {
                        row += " ";
                    }
            }
                System.out.println(row);
            }

        }
    }
}
