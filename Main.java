import java.util.Scanner;
public class Main {
    //Pretrazivanje slobodnih mjesta u kinu.
    public static void main(String[] args) {
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Koji red? (1-5): ");
        int x = sc.nextInt();
        x = x - 1;
        System.out.print("Koje sjedalo? (1-10): ");
        int y = sc.nextInt();
        y = y - 1;*/
        int x = 0;
        int y =0;
        Kino kino = new Kino();
        kino.x = x;
        kino.y = y;
        kino.seats = seats;
        kino.search();
    }
}
class Kino {
    int x;
    int y;
    int[][] seats; /*= {
            {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
            {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
    };*/
    public void search(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Koji red? (1-5): ");
        int x = sc.nextInt();
        x = x - 1;
        System.out.print("Koje sjedalo? (1-10): ");
        int y = sc.nextInt();
        y = y - 1;
        if (x > 4 || y > 9) {
            System.out.println("Redovi su od 1 do 5, a sjedala pak od 1 do 10!");
            search();
        }
        else if (seats[x][y] == 0) {
            System.out.println("Slobodno");
        }
        else if (seats[x][y] == 1) {
            System.out.println("Prodano");
        }
        search();
    }
}