
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String userName, password;
        int right=3;
        int select;
        double balance =1500, cash;

        while (right > 0) {

        System.out.print("Lutfen kullanici adini giriniz:");
        userName = input.nextLine();
        System.out.println("Sifrenizi girniz:");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("dev123")) {
            System.out.println("Merhaba bankamiza hosgeldiniz");



            break;

        }else {
            right--;
            if (right==0){
                System.out.println("Hesabiniz bloke olmustur");
            }else {
            System.out.println("hatali kullanici adi veya sifre tekrar deneyiniz");
            System.out.println("Kalan hakkiniz:"+ right);
            }
        }

        }

        do {
            System.out.println("Lutfen yapmak istediginiz islemi seciniz");
        System.out.println("1-para yatirma \n " + "2-para cekme\n"
                + "3-Bakiye sorgulama\n"+ "4-Cikis yap");
        select = input.nextInt();



            switch (select) {
                case 1:
                    System.out.println("Yatirmak iistediginiz tutari giriniz:");
                    cash = input.nextDouble();
                    balance += cash;
                    System.out.println("Hesabinizda ki yeni tutar: " + balance);
                    break;

                case 2:
                    System.out.println("Cekmek istediginiz tutari giriniz:");
                    cash = input.nextDouble();
                    if (cash > balance) {
                        System.out.println("Yetersiz bakiye");
                    } else {
                        balance -= cash;
                        System.out.println("Hesabinizda kalan tutar:" + balance);
                    }
                    break;

                case 3:
                    System.out.println("Hesabinizda ki toplam bakiye:" + balance);
                    break;

                case 4:
                    System.out.println("bizi tercih ettiginiz cin tesekkur ederiz");
                    break;
            }
        }
        while (select!=4);
        System.out.println("tekrar gorusmek uzere");










    }
}
