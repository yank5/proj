import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//import java.awt.*;
//import java.awt.desktop.AppEvent;
//import java.awt.desktop.ScreenSleepEvent;
//import java.awt.desktop.ScreenSleepListener;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.awt.image.BaseMultiResolutionImage;
//import java.awt.image.Kernel;
//import java.beans.Encoder;
//import java.io.*;
//import java.net.*;
//import java.net.http.WebSocket;
//import java.nio.channels.DatagramChannel;
//import java.util.*;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//import java.util.stream.Stream;
//
//import com.googlecode.lanterna.*;
//import com.googlecode.lanterna.bundle.LanternaThemes;
//import com.googlecode.lanterna.graphics.BasicTextImage;
//import com.googlecode.lanterna.graphics.DelegatingTheme;
//import com.googlecode.lanterna.graphics.TextGraphics;
//import com.googlecode.lanterna.graphics.TextImage;
//import com.googlecode.lanterna.input.InputDecoder;
//import com.googlecode.lanterna.input.KeyStroke;
//import com.googlecode.lanterna.input.KeyType;
//import com.googlecode.lanterna.screen.Screen;
//import com.googlecode.lanterna.screen.ScreenBuffer;
//import com.googlecode.lanterna.screen.TerminalScreen;
//import com.googlecode.lanterna.screen.VirtualScreen;
//import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
//import com.googlecode.lanterna.terminal.SimpleTerminalResizeListener;
//import com.googlecode.lanterna.terminal.Terminal;
//import com.googlecode.lanterna.*;
//import com.googlecode.lanterna.terminal.TerminalFactory;
//import com.googlecode.lanterna.terminal.swing.TerminalEmulatorDeviceConfiguration;
//import com.googlecode.lanterna.terminal.virtual.DefaultVirtualTerminal;
//import com.sun.net.httpserver.HttpsServer;
//
//import javax.imageio.ImageIO;
//import javax.swing.*;
//
//import static com.googlecode.lanterna.TextColor.ANSI.*;
//
//
//public class Main {
//
//    public static void main(String[] args) throws IOException, InterruptedException {
////        System.out.println("test port number (or test all ports -1)");
////        Scanner scanner=new Scanner(System.in);
////         int m= scanner.nextInt();
//
////        Socket socket=new Socket();
//
//
//
//
//        Terminal terminal=new DefaultTerminalFactory().createTerminal();
//
//        while (true){
//            System.out.println(terminal.readInput());
//            TimeUnit.MILLISECONDS.sleep(100);
//        }
//
//
////        DatagramSocket datagramSocket=new DatagramSocket();
////        DatagramPacket datagramPacket=new DatagramPacket(new byte[]{1,2},1);
////        System.out.println("DatagramChannel.open().isConnected() = " + DatagramChannel.open().isConnected());
//
//
////        TextGraphics textGraphics = terminal.newTextGraphics();
//
//
//
////        textGraphics.setBackgroundColor(RED);
////        textGraphics.putString(1,1,"");
////        textGraphics.fill(' ');
//
//
//
////        System.out.println("\u001b[48;5;244m"+"test");
////        System.out.print("\u001b[?5h");
//
//
//
////        while(true){
////            System.out.print("\u001b[?5h");
////            var r=scanner.next();
////            System.out.print("\u001b[?5l");
////        }
//
//
////        var xx=java.util.UUID.randomUUID();
////        var gz=java.util.Base64.getDecoder();
////
////
////
////
////
////
////        LinkedList linkedList=new LinkedList<>();
////
////        Vector<Object> vector=new Vector<Object>();
////
////        ArrayDeque arrayDeque=new ArrayDeque<>();
////
////        Stack stack=new Stack();
////
////        List list= new ArrayList<>();
////
////
////        ArrayList arrayList=new ArrayList<>();
//
//
//
////        System.out.println(gz);
//
//
//
//
//
//
//
////        var p=System.getenv();
////        for(var o:p.keySet()){
////            System.out.print(o+" = ");
////            System.out.println(p.get(o));
////        }
//
//
//
//
//
////Properties z=System.getProperties();
////
////        for(var p:z.keySet()){
////            System.out.print(p+" = ");
////            System.out.println(z.get(p));
////        }
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
////        try {
////            Inet4Address inet4Address = (Inet4Address) InetAddress.getByName("google.com");
////
////
//////            for(var x:NetworkInterface.networkInterfaces().toArray()){
//////                System.out.println(x);
//////            }
////
////            var x = NetworkInterface.getByIndex(1).getInetAddresses();
////
////
////
////
////
////
////
////
////
////
////
//////            System.out.println(inet4Address.isReachable(900));
////
////
////
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
//
//    }
//
//}
class KeyListenerTester extends JFrame implements KeyListener {

    JLabel label;

    public KeyListenerTester(String s) {
        super(s);
        JPanel p = new JPanel();
        label = new JLabel("Key Listener!");
        p.add(label);
        add(p);
        addKeyListener(this);
        setSize(200, 100);
        setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key typed");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key typed");
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key pressed");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key Released");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key Released");
        }
    }

    public static void main(String[] args) {
        new KeyListenerTester("Key Listener Tester");
    }
}