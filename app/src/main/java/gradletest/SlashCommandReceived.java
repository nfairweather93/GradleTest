package gradletest;

//Imports
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionType;

public class SlashCommandReceived extends ListenerAdapter{

    public static String prefix = App.prefix;

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event){
        if(event.getMember().getUser().isBot()) return;

        if(event.getName().equalsIgnoreCase("ping")){
                try {
                    event.wait(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                event.reply("Pong!").setEphemeral(false).queue();
            }
        }
    }
