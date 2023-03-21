import java.io.IOException;
import java.net.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
/*        System.out.println("test port number (or test all ports -1)");
        Scanner scanner=new Scanner(System.in);
        int  x = scanner.nextInt();*/

//        try {
//            var y=System.in.readAllBytes();
//            for(Byte c:y)
//                System.out.print((char)(int)c);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }





        Socket socket=new Socket();


        try {
            Inet4Address.getByName("google.com");
            Inet4Address inet4Address= (Inet4Address) InetAddress.getByName("google.com");
            System.out.println(inet4Address.isMulticastAddress());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}