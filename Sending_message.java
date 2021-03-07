import java.net.*;
public class Sending_message {
       public static void main(String[] args) throws Exception
       {
    	   DatagramSocket ds = new DatagramSocket();
    	   String str = "Message sent by socket";
    	   InetAddress ip = InetAddress.getByName("127.0.0.1");
    	   DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3001);
    	   ds.send(dp);
    	   ds.close();
       }
}
