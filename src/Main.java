import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        do{

        }while(!isNumber(str));
    }

    public static boolean isNumber(String str){
        if(str.chars().allMatch(c->Character.isDigit(c))){
            return true;
        }else{
            return false;
        }
    }
}