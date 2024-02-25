package io.javabrains.springbootquickstart.topic;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "Java Script", "Java Script Description")
            );
    public List<Topic> getAllTopics(){
        return topics;
    }
}