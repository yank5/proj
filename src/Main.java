import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.List;
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.bundle.LanternaThemes;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.terminal.virtual.DefaultVirtualTerminal;

import static com.googlecode.lanterna.TextColor.ANSI.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("test port number (or test all ports -1)");
//        Scanner scanner=new Scanner(System.in);
//         int m= scanner.nextInt();

//        Socket socket=new Socket();

        DefaultTerminalFactory defaultTerminalFactory=new DefaultTerminalFactory();
        Terminal terminal=defaultTerminalFactory.createTerminal();
        TextGraphics textGraphics = terminal.newTextGraphics();
        textGraphics.setBackgroundColor(RED);
        textGraphics.putString(1,1,"");
        textGraphics.fill('1');



//        System.out.println("\u001b[48;5;244m"+"test");
//        System.out.print("\u001b[?5h");



//        while(true){
//            System.out.print("\u001b[?5h");
//            var r=scanner.next();
//            System.out.print("\u001b[?5l");
//        }


//        var xx=java.util.UUID.randomUUID();
//        var gz=java.util.Base64.getDecoder();
//
//
//
//
//
//
//        LinkedList linkedList=new LinkedList<>();
//
//        Vector<Object> vector=new Vector<Object>();
//
//        ArrayDeque arrayDeque=new ArrayDeque<>();
//
//        Stack stack=new Stack();
//
//        List list= new ArrayList<>();
//
//
//        ArrayList arrayList=new ArrayList<>();



//        System.out.println(gz);







//        var p=System.getenv();
//        for(var o:p.keySet()){
//            System.out.print(o+" = ");
//            System.out.println(p.get(o));
//        }





//Properties z=System.getProperties();
//
//        for(var p:z.keySet()){
//            System.out.print(p+" = ");
//            System.out.println(z.get(p));
//        }










//        try {
//            Inet4Address inet4Address = (Inet4Address) InetAddress.getByName("google.com");
//
//
////            for(var x:NetworkInterface.networkInterfaces().toArray()){
////                System.out.println(x);
////            }
//
//            var x = NetworkInterface.getByIndex(1).getInetAddresses();
//
//
//
//
//
//
//
//
//
//
//
////            System.out.println(inet4Address.isReachable(900));
//
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }

}