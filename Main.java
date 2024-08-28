import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0)
            System.out.println(num+" is a positive number");
        else if(num<0)
            System.out.println(num+" is a negative number");
        else
            System.out.println(num+" is Zero");
        int day=num%7;
        switch (day){
            case 0:
            {
                System.out.println("Sunday");
                break;
            }
            case 1:
            {
                System.out.println("Monday");
                break;
            }
            case 2:
            {
                System.out.println("Tuesday");
                break;
            }
            case 3:
            {
                System.out.println("Wednesday");
                break;
            }
            case 4:
            {
                System.out.println("Thursday");
                break;
            }
            case 5:
            {
                System.out.println("Friday");
                break;
            }
            case 6:
            {
                System.out.println("Saturday");
                break;
            }

            default:
            {
                System.out.println("It is negative number");
                break;
            }
        }

        for(int i=1;i<=num;i++)
            System.out.print(i+" ");
        System.out.println();
        for(int i=num;i>=1;i--)
            System.out.print(i+" ");
        System.out.println();

        do{
            System.out.print("1 2 3 ");
            num--;
        }while(num>=0);

    }
}