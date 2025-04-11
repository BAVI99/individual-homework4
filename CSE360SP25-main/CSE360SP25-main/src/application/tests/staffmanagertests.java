package hw4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import application.Question;
import application.StaffManager;

public class HW4_StaffManagerTests {

    private StaffManager manager;

    @BeforeEach
    public void setup() {
        manager = new StaffManager();

        Question q1 = new Question(1, "What is OOP?", "Java", "StudentA");
        Question q2 = new Question(2, "Explain inheritance.", "Java", "StudentB");
        Question q3 = new Question(3, "What is polymorphism?", "Java", "StudentC");

        manager.addQuestion(q1);
        manager.addQuestion(q2);
        manager.addQuestion(q3);
    }

    @Test
    public void testAddAndRetrieve() {
        List<Question> all = manager.getAllQuestions();
        assertEquals(3, all.size());
    }

    @Test
    public void testGetByTopic() {
        List<Question> javaQs = manager.getQuestionsByTopic("Java");
        assertEquals(3, javaQs.size());
    }

    @Test
    public void testMarkReviewed() {
        boolean result = manager.markReviewed(1, "Well written.");
        assertTrue(result);

        Question reviewed = manager.getAllQuestions().get(0);
        assertTrue(reviewed.isReviewed());
        assertEquals("Well written.", reviewed.getStaffComment());
    }

    @Test
    public void testDeleteQuestion() {
        assertTrue(manager.deleteQuestion(2));
        assertEquals(2, manager.getAllQuestions().size());
    }

    @Test
    public void testGetReviewedQuestions() {
        manager.markReviewed(1, "Good job.");
        manager.markReviewed(3, "Needs improvement.");
        List<Question> reviewed = manager.getReviewedQuestions();
        assertEquals(2, reviewed.size());
    }
}
