import java.util.Scanner;

class Account {
    static int ac_no=0;
    double c_bal=0;
    int type,acc_no;
    String name;
    double check() {
        return c_bal;
    }
    void deposit() {
        double d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        d = sc.nextDouble();
        c_bal = c_bal + d;
    }
    void withdrawal() {
        double w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdrawal amount: ");
        w = sc.nextDouble();
        if (c_bal -w < 0) {
            System.out.println("Not enough balance");
        }
        else {
            c_bal = c_bal - w;
        }
    }
    Account(double c_bal,int type,String name) {
        this.c_bal = c_bal;
        this.type = type;
        this.name = name;
        ac_no++;
        acc_no = ac_no;
    }
    Account() {
    }
}
class StandardAccount extends Account {
    void withdrawal() {
        Scanner sc = new Scanner(System.in);
        double w;
        System.out.println("Enter withdrawal amount: ");
        w = sc.nextDouble();
        if (w > 500000) {
            System.out.println("Withdrawal limit");
        } else if (c_bal - w < 0) {
            System.out.println("Not enough balance");
        } else if (w < 100000) {
            c_bal = c_bal - w;
        } else {
            c_bal = c_bal - (1.005) * w;
        }
    }
}
class Premium extends Account {
    void withdrawal() {
        double w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdrawal amount: ");
        w = sc.nextDouble();
        if (w > 1000000) {
            System.out.println("Withdrawal limit");
        }
        else if (c_bal - w < 0) {
            System.out.println("Not enough balance");
        }
        else {
            c_bal = c_bal - w;
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type;
        double c_bal;
        String name;
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter account type: ");
            type = sc.nextInt();
            System.out.println("Enter current balance: ");
            c_bal = sc.nextDouble();
            System.out.println("Enter name: ");
            sc.nextLine();
            name = sc.nextLine();
            Account[] a = new Account[2];
            a[i] = new Account(c_bal, type, name);
            if (a[i].type == 1) {
                a[i] = new StandardAccount();
                a[i].deposit();
                a[i].withdrawal();
            } else if (a[i].type == 2) {
                a[i] = new Premium();
                a[i].deposit();
                a[i].withdrawal();
            }
            else {
                System.out.println("Error");
            }
        }
    }
}
