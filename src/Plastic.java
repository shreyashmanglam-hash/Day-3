import java.util.Scanner;
class two {
    int length,breadth;
    void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = sc.nextInt();
        System.out.println("Enter breadth: ");
        breadth = sc.nextInt();
    }
    int cost() {
        return (40*length*breadth);
    }
}

class three extends two {
    int height;
    void enter1() {
        Scanner sc = new Scanner(System.in);
        enter();
        System.out.println("Enter height: ");
        height = sc.nextInt();
    }
    int costcal() {
        return (60*height*length*breadth);
    }
}

public class Plastic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter 1 for 2D and 2 for 3D: ");
        n = sc.nextInt();
        if (n==1) {
        two t1 = new two();
        t1.enter();
        System.out.println("Total cost: "+ t1.cost());
    }
        else {
            three t2 = new three();
            t2.enter1();
            t2.costcal();
            System.out.println("Total cost: "+ t2.costcal());
        }
    }
}
