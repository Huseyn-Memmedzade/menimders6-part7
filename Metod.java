import java.util.Scanner;

public class Metod {

    public static void main(String[] args) {

        mesajYaz();
    }

    public static void mesajYaz() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Yasinizi Daxil Edin Zehmet Olmasa");
        int yas = sc.nextInt();

        if (yas >= 18) {
            System.out.println("Yasiniz 18-den yuxari oldugu ucun Siz boyuksunuz");
        } else if (yas < 18) {
            System.out.println("Yasiniz 18-den kicik oldugu ucun Siz kiciksiniz");
        } else {
            System.out.println("Yasinizi duzgun daxil edin zehmet olmasa");
        }
    }
}

// İstifadəçinin yaşına görə "böyüksən" və ya "uşaqsan" yazan metod✅