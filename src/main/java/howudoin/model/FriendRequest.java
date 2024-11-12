package howudoin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FriendRequests")
public class FriendRequest {
    @Id
    private String id;
    private String senderId;
    private String receiverId;
    private String status; // PENDING, ACCEPTED, DECLINED
    // Getters and Setters
}
