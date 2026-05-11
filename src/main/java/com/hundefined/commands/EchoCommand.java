package com.hundefined.commands;

import com.hundefined.user.UserReader;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;

import java.nio.file.FileSystems;
import java.nio.file.Path;


public class EchoCommand implements Command {

    @Override
    public String getName() {
        return "echo";
    }

    @Override
    public String getDescription() {
        return "Echoes back the text you provide.";
    }

    @Override
    public void executeSlash(SlashCommandInteractionEvent event) {
        OptionMapping textOption = event.getOption("text");
        String textToEcho = "";
        UserReader.createUserFolder(event);

        if (textOption != null) {
            textToEcho = textOption.getAsString() + event.getUser().getId() + event.getGuild().getId();

        } else {
            textToEcho = "You didn't provide any text to echo!"; // Default message if no text provided
        }

        event.reply(textToEcho).setEphemeral(false).queue();
    }
}
