import java.util.Scanner;
class Account {
    int acc_no,balance;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        acc_no = sc.nextInt();
        System.out.println("Enter balance: ");
        balance = sc.nextInt();
    }
    void display() {
        System.out.println("Account number: "+acc_no);
        System.out.println("Balance: "+balance);
    }
}

class Person extends Account {
    int aadhar_no;
    String Name;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        Name = sc.nextLine();
        System.out.println("Enter aadhar number: ");
        aadhar_no = sc.nextInt();
    }
    void display() {
        System.out.println("Name: "+Name);
        System.out.println("Aadhar number: "+aadhar_no);
    }
}

public class Information {
    public static void main(String[] args) {
            Account[] A = new Account[3];
            Person[] P = new Person[3];
            for (int i=0;i<3;i++) {
                A[i] = new Account();
                A[i].input();
                P[i] = new Person();
                P[i].input();
            }
            for (int j=0;j<3;j++) {
                A[j].display();
                P[j].display();
                System.out.println("");
            }

    }
}


