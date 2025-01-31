
package gradletest;

import net.dv8tion;

public class App {
   
    public static void main(String[] args) throws Exception
    {
        //Grab the bot token from the .env file for security purposes :)
        Dotenv dotenv = Dotenv.load();
        String BOT_TOKEN = dotenv.get("BOT_TOKEN");

        //Set up the api with the bot
        JDA api = JDABuilder.createDefault(BOT_TOKEN).build();

        //Register Listener
        JDABuilder.addEventListeners(new MyListeners());
    }
}
