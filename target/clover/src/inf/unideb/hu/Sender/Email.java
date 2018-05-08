/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package inf.unideb.hu.Sender;

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

public class Email {public static class __CLR4_2_06a6ajgxkv4tf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0074\u006f\u0074\u0068\u0061\u006c\u0065\u0078\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0067\u0069\u0074\u0068\u0075\u0062\u002f\u0062\u006f\u006f\u006b\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1525778063668L,8589935092L,268,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String from;
    private String pass;
    private String to;
    private String host;

    public Email(String from, String pass, String to){try{__CLR4_2_06a6ajgxkv4tf.R.inc(226);
        __CLR4_2_06a6ajgxkv4tf.R.inc(227);this.from = from;
        __CLR4_2_06a6ajgxkv4tf.R.inc(228);this.pass = pass;
        __CLR4_2_06a6ajgxkv4tf.R.inc(229);this.to = to;
        __CLR4_2_06a6ajgxkv4tf.R.inc(230);this.host = "smtp.gmail.com";
    }finally{__CLR4_2_06a6ajgxkv4tf.R.flushNeeded();}}

    public void send(String content) throws MessagingException{try{__CLR4_2_06a6ajgxkv4tf.R.inc(231);
      __CLR4_2_06a6ajgxkv4tf.R.inc(232);Properties props = new Properties();
      __CLR4_2_06a6ajgxkv4tf.R.inc(233);props.put("mail.smtp.auth", "true");
      __CLR4_2_06a6ajgxkv4tf.R.inc(234);props.put("mail.smtp.starttls.enable", "true");
      __CLR4_2_06a6ajgxkv4tf.R.inc(235);props.put("mail.smtp.host", host);
      __CLR4_2_06a6ajgxkv4tf.R.inc(236);props.put("mail.smtp.port", "587");
      __CLR4_2_06a6ajgxkv4tf.R.inc(237);Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {try{__CLR4_2_06a6ajgxkv4tf.R.inc(238);
            __CLR4_2_06a6ajgxkv4tf.R.inc(239);return new PasswordAuthentication(from, pass);
         }finally{__CLR4_2_06a6ajgxkv4tf.R.flushNeeded();}}
      });
         __CLR4_2_06a6ajgxkv4tf.R.inc(240);Message message = new MimeMessage(session);
         __CLR4_2_06a6ajgxkv4tf.R.inc(241);message.setFrom(new InternetAddress(from));
         __CLR4_2_06a6ajgxkv4tf.R.inc(242);message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse(to));
         __CLR4_2_06a6ajgxkv4tf.R.inc(243);message.setSubject("Monthly booking");
         __CLR4_2_06a6ajgxkv4tf.R.inc(244);BodyPart messageBodyPart = new MimeBodyPart();
         __CLR4_2_06a6ajgxkv4tf.R.inc(245);messageBodyPart.setText("Toth Alex");
         __CLR4_2_06a6ajgxkv4tf.R.inc(246);Multipart multipart = new MimeMultipart();
         __CLR4_2_06a6ajgxkv4tf.R.inc(247);multipart.addBodyPart(messageBodyPart);
         __CLR4_2_06a6ajgxkv4tf.R.inc(248);messageBodyPart = new MimeBodyPart();
         __CLR4_2_06a6ajgxkv4tf.R.inc(249);File file = new File("data.csv");
         __CLR4_2_06a6ajgxkv4tf.R.inc(250);if ((((file.exists())&&(__CLR4_2_06a6ajgxkv4tf.R.iget(251)!=0|true))||(__CLR4_2_06a6ajgxkv4tf.R.iget(252)==0&false))) {__CLR4_2_06a6ajgxkv4tf.R.inc(253);file.delete();
        }__CLR4_2_06a6ajgxkv4tf.R.inc(254);try {
            __CLR4_2_06a6ajgxkv4tf.R.inc(255);file.createNewFile();
            __CLR4_2_06a6ajgxkv4tf.R.inc(256);Writer writer = new FileWriter("data.csv");
            __CLR4_2_06a6ajgxkv4tf.R.inc(257);writer.write(content);
            __CLR4_2_06a6ajgxkv4tf.R.inc(258);writer.close();
        } catch (IOException e) {
            __CLR4_2_06a6ajgxkv4tf.R.inc(259);Logger.error(e);
        }
         __CLR4_2_06a6ajgxkv4tf.R.inc(260);DataSource source = new FileDataSource("data.csv");
         __CLR4_2_06a6ajgxkv4tf.R.inc(261);messageBodyPart.setDataHandler(new DataHandler(source));
         __CLR4_2_06a6ajgxkv4tf.R.inc(262);messageBodyPart.setFileName("data.csv");
         __CLR4_2_06a6ajgxkv4tf.R.inc(263);multipart.addBodyPart(messageBodyPart);
         __CLR4_2_06a6ajgxkv4tf.R.inc(264);message.setContent(multipart);
         __CLR4_2_06a6ajgxkv4tf.R.inc(265);Transport.send(message);
      __CLR4_2_06a6ajgxkv4tf.R.inc(266);Transport.send(message);
      __CLR4_2_06a6ajgxkv4tf.R.inc(267);Logger.info("Email has been sent to:[" + to + "] from [" + from + "]");
   }finally{__CLR4_2_06a6ajgxkv4tf.R.flushNeeded();}}

}
