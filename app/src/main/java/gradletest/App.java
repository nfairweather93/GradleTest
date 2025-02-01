
package gradletest;

import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class App {

    public static String prefix;

    public static void main(String[] args) throws Exception
    {
        //Grab the bot token from the .env file for security purposes :)
        Dotenv dotenv = Dotenv.load();
        String BOT_TOKEN = dotenv.get("BOT_TOKEN");

        String prefix = "/";

        //Set up the api with the bot
        JDA api = JDABuilder.createDefault(BOT_TOKEN).build();

        //Register Listener
        api.addEventListener(new MyListeners());
        api.addEventListener(new SlashCommandReceived());

        //Slash commands
        api.upsertCommand("pong", "Pongs the bot and it will return \"Ping!\"").queue();;
        api.upsertCommand("ping", "Pings the bot and it will return \"Pong!\"").queue();
        //.addOption(OptionType.STRING, "name", "The name you want to ping", true); //Last value is requirement boolean
    }
}
