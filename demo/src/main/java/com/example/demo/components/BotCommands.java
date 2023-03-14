package com.example.demo.components;

import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;

import java.util.List;

public interface BotCommands {
    List<BotCommand> LIST_OF_COMMANDS = List.of(
            new BotCommand("/start", "start bot"),
            new BotCommand("/help", "bot info"),
            new BotCommand("/all", "all books"),
            new BotCommand("/delete", "delete a book(id)"),
            new BotCommand("/search", "search a book(id)")
    );


    String HELP_TEXT = "This bot will help to count the number of messages in the chat. " +
            "The following commands are available to you:\n\n" +
            "/start - start the bot\n" +
            "/all - all books\n" +
            "/delete - delete a book(id)\n" +
            "/search - search a book(id)\n" +
            "/help - help menu";

}
