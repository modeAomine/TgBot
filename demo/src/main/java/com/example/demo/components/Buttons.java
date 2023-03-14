package com.example.demo.components;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.List;

public class Buttons {
    private static final InlineKeyboardButton START_BUTTON = new InlineKeyboardButton("Start");
    private static final InlineKeyboardButton HELP_BUTTON = new InlineKeyboardButton("Help");
    private static final InlineKeyboardButton ALL_BUTTON = new InlineKeyboardButton("all");
    private static final InlineKeyboardButton DELETE_BUTTON = new InlineKeyboardButton("delete");
    private static final InlineKeyboardButton SEARCH_BUTTON = new InlineKeyboardButton("search");


    public static InlineKeyboardMarkup inlineMarkup() {
        START_BUTTON.setCallbackData("/start");
        HELP_BUTTON.setCallbackData("/help");
        ALL_BUTTON.setCallbackData("/all");
        DELETE_BUTTON.setCallbackData("/delete");
        SEARCH_BUTTON.setCallbackData("/search");


        List<InlineKeyboardButton> rowInline = List.of(START_BUTTON, HELP_BUTTON);
        List<List<InlineKeyboardButton>> rowsInLine = List.of(rowInline);


        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInLine);


        return markupInline;
    }
}
