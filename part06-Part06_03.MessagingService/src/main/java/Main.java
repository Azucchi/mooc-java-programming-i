
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // Try out your class here
        
        Scanner scanner = new Scanner(System.in);
        MessagingService asd = new MessagingService();
        
        while(true){
        System.out.println("Sender:");
        String sender = scanner.nextLine();
        System.out.println("Message:");
        String message = scanner.nextLine();
        
        if(message.isEmpty()){
            System.out.println("message empty, will terminate inputs now");
            break;
        } else{
            Message newMessage = new Message(sender,message);            
            asd.add(newMessage);
        }
    }
        
        System.out.println("Printing all messages:");    
        for (Message each: asd.getMessages()){
            System.out.println(each);
        }
        
        
    }
}
