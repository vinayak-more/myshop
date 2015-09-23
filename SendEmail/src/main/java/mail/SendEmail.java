package main.java.mail;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import main.java.bean.EmailBean;
import main.java.db.DbUtils;

public class SendEmail
{
   public static void main(String [] args)
   {    
      // Recipient's email ID needs to be mentioned.
      String to = "";

      // Sender's email ID needs to be mentioned
      String from = "";

      // Assuming you are sending email from localhost
      String host = "localhost";

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.setProperty("mail.smtp.host", host);

      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties);

      try{
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("Hi !important");
         
         // Create the message part 
        /* BodyPart messageBodyPart = new MimeBodyPart();
         // Fill the message
         messageBodyPart.setText("This is message body");
         
         // Create a multipar message
         Multipart multipart = new MimeMultipart();

         // Set text message part
         multipart.addBodyPart(messageBodyPart);

         // Part two is attachment
         messageBodyPart = new MimeBodyPart();
         String filename = "/home/infibeam/workspace/Temp/lib/javax.mail-1.4.4.jar";
         DataSource source = new FileDataSource(filename);
         messageBodyPart.setDataHandler(new DataHandler(source));
         messageBodyPart.setFileName(filename);
         multipart.addBodyPart(messageBodyPart);

         // Send the complete message parts
         message.setContent(multipart );*/

      /*// Send the actual HTML message, as big as you like
         message.setContent("<h1>This is actual message</h1>", "text/html" );*/
         // Now set the actual message
         message.setText("Hahahah Your Email is Hacked.. again you left laptop unlocked");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
   
   public boolean sendEmail(EmailBean email){
	   // Assuming you are sending email from localhost
	      String host = "localhost";

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);
	   
	   try{
		   MimeMessage message=new MimeMessage(session);
		// Set From: header field of the header.
	         message.setFrom(new InternetAddress(email.getFrom()));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(email.getTo()));

	         // Set Subject: header field
	         message.setSubject(email.getSubject());
	         
	         if(email.isPlainText()){
	        	 //set plain text body
	         message.setText(email.getMailBody());
	         }
	         if(email.isHTMLText()){
	        	// Send the actual HTML message, as big as you like
	             message.setContent("<h1>This is actual message</h1>", "text/html" );
	         }
	         Transport.send(message);
	         DbUtils.addNewEmail(email);
		   return true;
	   }catch(Exception e){
		   e.printStackTrace();
		   return false;
	   }
	   
   }
}