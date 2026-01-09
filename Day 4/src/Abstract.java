import java.util.Scanner;
abstract class student {
    int roll_no,reg_no;
    void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number: ");
        roll_no = sc.nextInt();
        System.out.println("Enter registration number: ");
        reg_no = sc.nextInt();
    }
    abstract void course();
    student(int roll_no,int reg_no) {
        this.roll_no = roll_no;
        this.reg_no = reg_no;
    }
    student() {
    }
}
class kiitian extends student {
    kiitian(int a,int b) {
        super(a,b);
    }
    kiitian () {
    }
    void course() {
        System.out.println("B.Tech(Computer Science & Engg)");
    }
}

public class Abstract {
    public static void main(String[] args) {
        int roll,reg;
    kiitian k = new kiitian();
    k.getinput();
    System.out.println("Roll number: "+k.roll_no);
    System.out.println("Registration number: "+k.reg_no);
    k.course();
    }
}
