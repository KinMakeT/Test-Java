import java.util.Scanner;

public class Helloworld
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama : ");
        String nama = input.nextLine();
        System.out.println("Nama anda adalah " + nama);
    }
    
}