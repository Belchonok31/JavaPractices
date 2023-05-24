package ru.belosludtsev.practice15.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import ru.belosludtsev.practice15.models.Manufacture;
import ru.belosludtsev.practice15.models.Worker;
@Service
public class EmailService {
    @Autowired
    public JavaMailSender emailSender;

    @Async
    public void sendAddManufactureEmail(Manufacture manufacture){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("belka04022003@gmail.com");
        message.setTo("egor.belosludtsev@mail.ru");
        message.setSubject("Message from Spring Boot Application");
        message.setText(manufacture.toString());

        emailSender.send(message);
        System.out.println("Email successfully sent!");
    }

    @Async
    public void sendAddWorkerEmail(Worker worker){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("belka04022003@gmail.com");
        message.setTo("egor.belosludtsev@mail.ru");
        message.setSubject("Message from Spring Boot Application");
        message.setText(worker.toString());

        emailSender.send(message);
        System.out.println("Email successfully sent!");
    }
}
