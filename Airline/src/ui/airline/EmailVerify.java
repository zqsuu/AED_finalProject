/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.airline;


import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author zhiqingsu
 */
public class EmailVerify {
    Properties properties;
    Session session;
    MimeMessage message;

    public EmailVerify(){
    
        //set message protocol
        properties = new Properties();
        properties.setProperty("mail.host","smtp.163.com");
        properties.setProperty("mail.transport.protocol","smtp");
        properties.setProperty("mail.smtp.auth","true");
        properties.setProperty("mail.smtp.timeout", "1000");
        
        //Create session objects and message
        session = Session.getInstance(properties);
        message = new MimeMessage(session);
        
        try{
            message.setFrom(new InternetAddress("suzhiqing530@163.com"));
            message.setSubject("AirLine System Sign Up Email Verify");
            //message.setText("Your registration verification code is:");
        }
        catch(Exception e){
            System.out.println("Email authentication connection failed.");
        }
    }
    
    public String sendEmail(String email){
        Random r = new Random();
        String code ="";
        int data;
        for(int i=0;i<6;i++){
            data =  r.nextInt(10);
            code = code + String.valueOf(data);
        }
        // return value
        //6-digit code: successfully send code
        //"fail": connection error, sending fail
        //"email wrong": invalid email address
        
        String format = "\\p{Alpha}\\w{2,15}[@][a-z0-9]{3,}[.]\\p{Lower}{2,}";
        if(!email.matches(format))
            return "email wrong";
        
        try{
            message.setText("Your registration verification code is:\n"+code);
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(email));
            
            System.out.println(111);
            Transport transport = session.getTransport();
            System.out.println(22);
            transport.connect("smtp.163.com", "suzhiqing530@163.com", "RYJHEURPYSAEHGMJ");
            System.out.println(33);
            transport.sendMessage(message,message.getAllRecipients());
            transport.close();
        }
        catch(Exception e){
            return "fail";
        }
        return code;
    }

   
}
