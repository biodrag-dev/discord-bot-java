package com.hundefined.commands;

import com.hundefined.user.UserReader;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class RegisterCommand implements Command {
    @Override
    public String getName() {
        return "register";
    }

    @Override
    public String getDescription() {
        return "registers this guild.";
    }

    @Override
    public void executeSlash(SlashCommandInteractionEvent event) {
        User user = event.getOption("user").getAsUser();
        UserReader.createUserFolder(event.getGuild().getId(), event.getOption("user").getAsUser().getId());

        event.reply("User " + user.getAsMention() + " has been registered!").setEphemeral(true).queue();

    }
}
