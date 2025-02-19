package assignment_2;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

@Getter
@EqualsAndHashCode
@ToString
@Builder
@Jacksonized
public class BlogPost {
    private String id;
    private String authorId; // Equals personId
    private String postContent;

    private BlogPost(String id, String authorId, String postContent) {
        if (id == null) throw new IllegalArgumentException("id cannot be null");
        if (authorId == null) throw new IllegalArgumentException("authorId cannot be null");
        this.id = id;
        this.authorId = authorId;
        this.postContent = postContent;
    }
}

