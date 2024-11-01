package com.example.chatapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView chatList;
    private ChatAdapter chatAdapter;
    private List<Chat> chats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo danh sách trống cho giao diện ban đầu
        chatList = findViewById(R.id.chat_list);
        chatList.setLayoutManager(new LinearLayoutManager(this));

        chats = new ArrayList<>();  // Danh sách trống ban đầu
        chatAdapter = new ChatAdapter(chats);
        chatList.setAdapter(chatAdapter);

        // Chat mẫu để sử dụng cho chức năng sau (không hiển thị ban đầu)
        Chat sampleChat = new Chat("Sample Chat", "This is a sample chat", "12:00", "avatar_url");

        // Thêm chức năng tạo chat mới
        Button addChatButton = findViewById(R.id.add_chat_button); // Nút thêm chat mới
        addChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chats.add(sampleChat);  // Thêm chat mẫu vào danh sách hiển thị
                chatAdapter.notifyDataSetChanged();  // Cập nhật lại giao diện
            }
        });
    }
}
