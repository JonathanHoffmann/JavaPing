import java.io.IOException;
import java.net.InetAddress;

public class JavaPing {
    public static void main(String[] args) throws IOException {
        for(int i=1;i<=255;i++)
        {
            InetAddress addr = InetAddress.getByName("192.168.0." + i);
            if(addr.isReachable(1))
            {
                System.out.println(addr.getHostAddress() + "\tis reachable " + addr.getCanonicalHostName());
            }
        }
    }
}