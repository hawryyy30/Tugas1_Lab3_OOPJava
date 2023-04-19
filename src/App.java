import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Akun akun = new Akun();
        int pilihan;
        // Akun awal untuk cek login
        akun.register(new User("harry30", "12345678"));
        akun.register(new User("kucing123", "poi321"));
        do {
            System.out.println("Full Login System");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("0. Keluar");
            System.out.print("Pilihan anda : ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Username : ");
                    String username = scanner.next();
                    System.out.print("Password : ");
                    String password = scanner.next();
                    User verifikasi = akun.login(username, password);
                    if (verifikasi != null) {
                        System.out.println("Welcome, " + verifikasi.getUsername() + "!");
                    } else {
                        System.out.println("Login invalid");
                    }
                    break;

                case 2:
                    System.out.print("Username : ");
                    username = scanner.next();
                    System.out.print("Password : ");
                    password = scanner.next();
                    if (akun.cekAkun(username, password)) {
                        System.out.println("Akun sudah ada");
                    } else {
                        akun.register(new User(username, password));
                        System.out.println("Akun berhasil dibuat");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih");
                    scanner.close();
            }
        } while (pilihan != 0);
    }
}
