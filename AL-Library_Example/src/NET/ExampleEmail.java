package NET;
// Make By Bình An || AnLaVN || KatoVN

import com.AnLa.NET.Email;
import javax.mail.MessagingException;

public class ExampleEmail {

    public static void main(String[] args) throws MessagingException {
        Email mail = new Email("yourEmail@domain.com", "applicationPass");//setup your SMTP service
        mail.setEmail("Tittle Email", "<h1>hello, this is test email</h1>");  //setup your email content
        mail.sendEmailTo("yourFriend1@domain.com", "yourFriend2@domain.com", "..."); //send email for your friend
    }
}