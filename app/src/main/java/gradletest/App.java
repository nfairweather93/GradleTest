
package gradletest;

import net.dv8tion;

public class App extends ListenerAdapter{
   
    public static void main(String[] args) throws Exception
    {
        //Grab the bot token from the .env file for security purposes :)
        Dotenv dotenv = Dotenv.load();
        String BOT_TOKEN = dotenv.get("BOT_TOKEN");

        //Set up the api with the bot
        JDA api = JDABuilder.createDefault(BOT_TOKEN).build();
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
            channel.sendMessage("Pong!").queue(); //.queue() is important to use after sendMessage()
        }


    }
}
