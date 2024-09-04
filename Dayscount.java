import java.util.Scanner;


public class minitec{
public static void main(String[] args){

double miniteofyear= 60*24*365;

Scanner input= new Scanner(System.in);

System.out.println("Inut the minitr:");
 double minite = input.nextDouble();

long year=(long)(minite/miniteofyear);


int day= (int)( minite /60/24)%356;

System.out.println("year "+ year+ " days "+day);


}
}
