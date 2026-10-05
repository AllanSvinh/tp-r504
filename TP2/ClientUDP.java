import java.io.*;
import java.net.*;

public class ClientUDP
{
    public static void main(String[] args){
        String s = "hello world";

        try{
            InetAddress addr = InetAddress.getLocalHost();
            System.out.println("adresse=" + addr.getHostName());
            byte[] data = s.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, addr, 1234);
            DatagramSocket sock = new DatagramSocket();
            sock.send(packet);
            sock.receive(packet);
            String reponseStr = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Retour du serveur : " + reponseStr);
            sock.close();
        }
        catch(Exception ex){
            System.out.println("erreur !");  
            ex.printStackTrace();
        }
    }
}