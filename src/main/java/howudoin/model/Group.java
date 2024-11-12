package howudoin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Groups")
public class Group {
    @Id
    private String id;
    private String name;
    private String adminId;
    private List<String> memberIds;
    // Getters and Setters
}
