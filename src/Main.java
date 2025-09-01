import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;

        do{
            do{
                System.out.print("Enter number: ");
                str = scan.nextLine().trim();
            }while(!isNumber(str));

            double num1 = Double.parseDouble(str);

            do{
                System.out.print("Enter operation: ");
                str=scan.nextLine().trim();
            }while (!isOperationSymbol(str));

            char operation = str.charAt(0);

            do{
                System.out.print("Enter operation: ");
                str=scan.nextLine().trim();
            }while (!isNumber(str));

            double num2 = Double.parseDouble(str);

        }while(!str.isEmpty());
    }

    public static boolean isNumber(String str){
        if(str.chars().allMatch(c->Character.isDigit(c))){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isOperationSymbol(String str){
        if(str.chars().allMatch(c->c=='+' || c=='-' || c=='*' || c=='/')){
            return true;
        }else{
            return false;
        }
    }
}