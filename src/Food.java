import java.util.Scanner;
class Fruit {
    void show() {
        System.out.println("I am Fruit");
    }
}

class Banana extends Fruit {
    void show() {
        super.show();
        System.out.println("I am Banana");
    }
}

class Cherry extends Banana {
    void show() {
        super.show();
        System.out.println("I am Cherry");
    }
}

public class Food {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n;
System.out.println("1 For Fruit, 2 for Fruit and Banana and 3 for Fruit,Banana and Cherry");
n = sc.nextInt();
switch (n) {
    case 1:
        Fruit f = new Fruit();
        f.show();
        break;
    case 2:
        Banana b = new Banana();
        b.show();
        break;
    case 3:
        Cherry c = new Cherry();
        c.show();
        break;
}
    }
}