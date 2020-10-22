import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Authenticate {

    public static void main(String[] args) throws IOException
    {
        MyAPI obj=new MyAPI();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int randomNum = new Random().nextInt(9000) + 1000;
        String otp=randomNum+"";
        String userName="Rithik";
        String apiKey="50F8152AC466AD47299AC76AAB51682E5CB5E9C26E7B2802AC857EB2AE3493F1B30AC3E333BC51BB1CB0AFA486720D3D";
        String from="17i334@psgtech.ac.in";
        String fromName="Rithik";
        String subject="Authenticate to proceed";
        String body=otp;
        String isTransactional="True";

        int flag=1;
        System.out.println("------Welcome to ELASTIC!!--------\n");
        System.out.println("Enter Your Email Address to continue :-");
        String to=br.readLine();
        obj.SendOTP(userName, apiKey, from, fromName, subject, body, to, isTransactional);
        System.out.println("An OTP has been sent to your Mail ID successfully.");
        while(flag==1)
        {
            System.out.println("Please Enter the OTP to proceed:-");
            String enteredOTP=br.readLine();
            if(otp.equals(enteredOTP)) 
            {
                System.out.println("Successfully Authenticated.");
                flag=0;
            }
            else 
            {
                System.out.println("Please Check the OTP entered.");
            }
        }
    }
}