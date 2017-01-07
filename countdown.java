/**
 * Created by Moosiq on 2017-01-07.
 */
public class countdown{
    public static void main(String [] args) {
        int x = 75;
        while (x >= 60) {
            System.out.print("Number : " + x);
            if (x == 69) {
                System.out.print("\n*insert bee movie script here*");
            }
            x--;
            try {
                Thread.sleep(696);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\n");
        }
        System.out.println("I SEXUALLY IDENTIFY AS AN APACHE ATTACK HELICOPER.");
        if (x == 69) {
            System.out.println("hehe xd");
        }
    }
}