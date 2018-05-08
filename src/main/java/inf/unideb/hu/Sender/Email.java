package inf.unideb.hu.Sender;

import org.pmw.tinylog.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Email {

    private String from;
    private String pass;
    private String to;
    private String host;

    public Email(String from, String pass, String to) {
        this.from = from;
        this.pass = pass;
        this.to = to;
        this.host = "smtp.gmail.com";
    }

    public void send(String content) throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, pass);
                    }
                });
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(to));
        message.setSubject("Monthly booking");
        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText("Toth Alex");
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        messageBodyPart = new MimeBodyPart();
        File file = new File("data.csv");
        if (file.exists()) file.delete();
        try {
            file.createNewFile();
            Writer writer = new FileWriter("data.csv");
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            Logger.error(e);
        }
        DataSource source = new FileDataSource("data.csv");
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName("data.csv");
        multipart.addBodyPart(messageBodyPart);
        message.setContent(multipart);
        Transport.send(message);
        file.delete();
        Logger.info("Email has been sent to:[" + to + "] from [" + from + "]");
    }

}
