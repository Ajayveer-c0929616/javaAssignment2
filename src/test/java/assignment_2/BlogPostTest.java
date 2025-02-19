package assignment_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BlogPostTest {

    @Test
    public void testBlogPostCreationValid() {
        BlogPost post = BlogPost.builder()
                .id("1")
                .authorId("1")
                .postContent("Heeelooooooo..")
                .build();
        assertNotNull(post);
        assertEquals("1", post.getAuthorId());
    }

    @Test
    public void testBlogPostCreationInvalidAuthorId() {
        assertThrows(IllegalArgumentException.class, () -> {
            BlogPost.builder()
                    .id("1")
                    .authorId(null)
                    .postContent("Heelllooooo 2.")
                    .build();
        });
    }
}
