package com.hundefined.user;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class UserReader {

    static String directoryPath = System.getProperty("user.dir")+"\\src\\main\\data";


    public static void createUserFolder(SlashCommandInteractionEvent event){
        Path dir = Path.of(directoryPath + "\\" + event.getGuild().getId() + "\\" + event.getUser().getId());

        try{
            Files.createDirectories(dir);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void createUserFolder(String guildID, String userID){
        Path dir = Path.of(directoryPath + "\\" + guildID + "\\" + userID);

        try{
            Files.createDirectories(dir);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
