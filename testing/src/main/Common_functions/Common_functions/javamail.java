package Common_functions;



import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.mail.*;
import javax.mail.Flags.Flag;
import javax.mail.internet.*;

import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPMessage;


public class javamail {
	
	public void sendMail(String to_mail, String message) {
        //Setting up configurations for the email connection to the Google SMTP server using TLS
        Properties props = new Properties();
        props.put("mail.smtp.host", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        //Establishing a session with required user details
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("shriramur96@gmail.com", "181234717gs");
            }
        });
        try {
            //Creating a Message object to set the email content
            MimeMessage msg = new MimeMessage(session);
            //Storing the comma seperated values to email addresses
            String to = to_mail;//for multiple recipients "recepient1@email.com,recepient2@gmail.com";
            /*Parsing the String with defualt delimiter as a comma by marking the boolean as true and storing the email
            addresses in an array of InternetAddress objects*/
            InternetAddress[] address = InternetAddress.parse(to, true);
            //Setting the recepients from the address variable
            msg.setRecipients(Message.RecipientType.TO, address);
            String timeStamp = new SimpleDateFormat("yyyymmdd_hh-mm-ss").format(new Date());
            msg.setSubject("Sample Mail : " + timeStamp);
            msg.setSentDate(new Date());
            msg.setText(message);
            msg.setHeader("XPriority", "1");
            Transport.send(msg);
            System.out.println("Mail has been sent successfully");
        } catch (MessagingException mex) {
            System.out.println("Unable to send an email" + mex);
        }
    }
//IMAP is Acronym for Internet Message Access Protocol. It is an Application Layer Internet protocol that allows an e-mail client to access e-mail on a remote mail server. An IMAP server typically listens on well-known port 143. 
//IMAP is used to only read the mail. We need to use SMTP to send mail refer javamail_send_smtp.java to send mail
    public boolean redmail(String from_mail) throws Exception{
        IMAPFolder folder = null;
        Store store = null;
        String subject = null;
        //Flag flag = null;
        boolean flag = false;
        try 
        {
          Properties props = System.getProperties();
          props.setProperty("mail.store.protocol", "imaps");

          Session session = Session.getDefaultInstance(props, null);

          store = session.getStore("imaps");
          store.connect("imap.googlemail.com","shriramur96@gmail.com", "181234717gs");

          //folder = (IMAPFolder) store.getFolder("[Gmail]/Spam"); // This doesn't work for other email account
          folder = (IMAPFolder) store.getFolder("inbox"); //This works for both email account


          if(!folder.isOpen())
          folder.open(Folder.READ_WRITE);
          Message[] messages = folder.getMessages();
          System.out.println("No of Messages : " + folder.getMessageCount());
          System.out.println("No of Unread Messages : " + folder.getUnreadMessageCount());
          System.out.println(messages.length);
          for (int i=0; i < messages.length;i++) 
          {

            //System.out.println("*****************************************************************************");
            //System.out.println("MESSAGE " + (i + 1) + ":");
            Message msg =  messages[i];
            subject = msg.getSubject();
            Address from = msg.getFrom()[0];//from
            //from.equals("shriramur96@gmail.com");
            //System.out.println(from);
            if(from.toString().contains(from_mail)){
            //System.out.println(msg.getMessageNumber());
            //Object String;
            //System.out.println(folder.getUID(msg)

            subject = msg.getSubject();
            

            System.out.println("Subject: " + subject);
            System.out.println("From: " + msg.getFrom()[0]);
           System.out.println("To: "+msg.getAllRecipients()[0]);
            System.out.println("Date: "+msg.getReceivedDate());
            System.out.println("Size: "+msg.getSize());
            System.out.println(msg.getFlags());
            System.out.println("Body: \n"+ msg.getContent());
            System.out.println(msg.getContentType());
            flag = true;
            }
          }
        }
        finally 
        {
          if (folder != null && folder.isOpen()) { folder.close(true); }
          if (store != null) { store.close(); }
        }
        if(flag){
        	return true;
        }
        else{
        	return false;	
        }
    }



}