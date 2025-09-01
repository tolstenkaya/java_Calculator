import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;

        while(true){
            do{
                System.out.print("Enter first number: ");
                str = scan.nextLine().trim();
                if (str.isEmpty()) return;
            }while(!isNumber(str));

            double num1 = Double.parseDouble(str);

            do{
                System.out.print("Enter operation: ");
                str=scan.nextLine().trim();
                if (str.isEmpty()) return;
            }while (!isOperationSymbol(str));

            char operation = str.charAt(0);

            do{
                System.out.print("Enter second number: ");
                str=scan.nextLine().trim();
                if (str.isEmpty()) return;
            }while (!isNumber(str));

            double num2 = Double.parseDouble(str);
            double result=0;
            switch (operation){
                case '+':{
                    result=num1+num2;
                    break;
                }
                case '-':{
                    result=num1-num2;
                    break;
                }
                case '*':{
                    result=num1*num2;
                    break;
                }
                case '/':{
                    result=num1/num2;
                    break;
                }
            }

            System.out.println("Result: "+result+"\n");
            result=0;
        }
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