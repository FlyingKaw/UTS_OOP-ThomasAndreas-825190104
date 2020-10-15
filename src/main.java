import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        detailAccount Akun = new detailAccount();

        Scanner inputUser = new Scanner(System.in);


        System.out.print("masukan nama website (nanti akan menjadi nama file): "); //meminta nama website
        String namaWebsite = inputUser.nextLine(); //untuk menjadi nama file
        Akun.setWebsite(namaWebsite);
        System.out.println(" ");

        System.out.print("masukan Username atau email anda: "); //meminta username
        String username = inputUser.nextLine(); //agar bisa disimpan
        Akun.setUsername(username);
        System.out.println(" ");

        System.out.print("masukan panjang password anda: "); //meminta panjang password
        int passwordLenght = inputUser.nextInt(); //inputan berupa int yang nanti digunakan
        Akun.generatePassword(passwordLenght); //untuk generate password
        System.out.println(" ");

        // untuk membuat/menulis file kalo tidak menggunakan try catch error, tidak tau kenapa
        // untuk membuat file baru
        try{
            File baru = new File(Akun.getWebsite()+".txt");
            if(baru.createNewFile()){
                System.out.println("file sudah terbuat");
            }
            else{
                System.out.println("error file sudah ada");
            }
        }
        catch(IOException e){
            System.out.println("error");
            e.printStackTrace();
        }

        //untuk menulis username dan password yang baru saja didapatkan kedalam file
        //yang baru saja dibuat
        try{
            FileWriter tulis = new FileWriter(Akun.getWebsite()+".txt");
            tulis.write("username : "+Akun.getUsername()+ "\r\n"+
                    "password:"+Akun.getPassword());
            tulis.close();

            System.out.println("file selesai ditulis");
        }
        catch (IOException e){
            System.out.println("error tulis");
            e.printStackTrace();
        }

    }
}
