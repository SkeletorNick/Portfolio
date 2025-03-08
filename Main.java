
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean end = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type n to make a new character and end to end program: ");
        while(!end){
            if(sc.next().equals("n")){
                stats stats = new stats();
                stats.drawStats();
            }else if(sc.next().equals("end")){
                break;
            }else{
                System.out.println("Unknown command");
            }
            System.out.print("Type n to make a new character and end to end program: ");
        }

    }
}

