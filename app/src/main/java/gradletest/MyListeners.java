
package main.java.gradletest;

import javax.security.auth.login.LoginException;

import net.dv8tion;

public class MyListeners extends ListenerAdapter {
   public static void main(String[] arguments) throws LoginException, InterruptedException
   {
        //JDA api = JDABuilder.createDefault(arguments[0]).addEventListeners(new PingPongBot()).build().awaitReady();
   }


   @Override
   public void onMessageReceived(MessageReceivedEvent event)
   {
       //Ignore messages from other bots
       if(event.getAuthor().isBot()) return;

       //Variables
       Message message = event.getMessage();
       String content = message.getContentRaw();

       //Functionality
       if(content.equals("!ping")){
           MessageChannel channel = event.getChannel(); 
           channel.sendMessage("Pong!").queue(); //.queue() is important to use after sendMessage()
       }
   }

}