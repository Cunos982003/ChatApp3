package com.example.chatapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {

    private List<Chat> chatList;

    public ChatAdapter(List<Chat> chatList) {
        this.chatList = chatList;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_chat, parent, false);
        return new ChatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        Chat chat = chatList.get(position);
        holder.chatName.setText(chat.getName());
        holder.chatMessage.setText(chat.getLastMessage());
        holder.chatTime.setText(chat.getTime());
        // Load image into ImageView (use a library like Glide or Picasso for URL images)
        // Example: Glide.with(holder.chatAvatar.getContext()).load(chat.getAvatarUrl()).into(holder.chatAvatar);
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    static class ChatViewHolder extends RecyclerView.ViewHolder {
        ImageView chatAvatar;
        TextView chatName, chatMessage, chatTime;

        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
            chatAvatar = itemView.findViewById(R.id.chat_avatar);
            chatName = itemView.findViewById(R.id.chat_name);
            chatMessage = itemView.findViewById(R.id.chat_message);
            chatTime = itemView.findViewById(R.id.chat_time);
        }
    }
}
