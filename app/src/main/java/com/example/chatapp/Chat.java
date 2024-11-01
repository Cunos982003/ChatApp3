package com.example.chatapp;

public class Chat {
    private String name;
    private String lastMessage;
    private String time;
    private String avatarUrl;

    public Chat(String name, String lastMessage, String time, String avatarUrl) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.time = time;
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public String getTime() {
        return time;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
}
