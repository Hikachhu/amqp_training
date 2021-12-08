package fr.lernejo.chat;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatMessageController {
    @GetMapping("/api/message")
    public List<String> getTenLastMessages() {
        return ChatMessageListener.repo.getLastTenMessages();
    }
}
