import java.util.Scanner;
class plate {
    int length,width;
    plate(int length,int width) {
        this.length = length;
        this.width = width;
    }
    void display () {
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
    }
}

class box extends  plate {
    int height;
      box(int length,int width,int height) {
          super (length,width);
        this.height = height;
    }
    void display() {
          super.display();
          System.out.println("Heigth: "+height);
    }
}

class woodbox extends box {
    int thick;
    woodbox(int length,int width,int height,int thick) {
        super (length,width,height);
        this.thick = thick;
    }
    void display() {
        super.display();
        System.out.println("Thick: "+thick);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int n;
     System.out.println("1 Plate,2 Box,3 Woodbox");
     n = sc.nextInt();
     switch (n) {
         case 1:
             int a,b;
             System.out.println("Enter length:");
             a = sc.nextInt();
             System.out.println("Enter width:");
             b = sc.nextInt();
             plate p = new plate(a,b);
             p.display();
             break;
         case 2:
             int c,d,e;
             System.out.println("Enter length: ");
             c = sc.nextInt();
             System.out.println("Enter width: ");
             d = sc.nextInt();
             System.out.println("Enter height: ");
             e = sc.nextInt();
             box b1 = new box(c,d,e);
             b1.display();
             break;
         case 3:
             int f,g,h,i;
             System.out.println("Enter length: ");
             f = sc.nextInt();
             System.out.println("Enter width: ");
             g = sc.nextInt();
             System.out.println("Enter height: ");
             h = sc.nextInt();
             System.out.println("Enter thickness: ");
             i = sc.nextInt();
             woodbox w = new woodbox(f,g,h,i);
             w.display();
     }
    }
}





