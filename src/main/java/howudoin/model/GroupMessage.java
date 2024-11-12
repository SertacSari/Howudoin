package howudoin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "GroupMessages")
public class GroupMessage {
    @Id
    private String id;
    private String groupId;
    private String senderId;
    private String content;
    private Date timestamp;
    // Getters and Setters
}
