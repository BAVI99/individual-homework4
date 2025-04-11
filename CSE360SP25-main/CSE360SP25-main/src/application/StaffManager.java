package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaffManager {
    private List<Question> questions;

    public StaffManager() {
        this.questions = new ArrayList<>();
    }

    // CREATE
    public void addQuestion(Question q) {
        questions.add(q);
    }

    // READ
    public List<Question> getAllQuestions() {
        return new ArrayList<>(questions);
    }

    public List<Question> getQuestionsByTopic(String topic) {
        List<Question> result = new ArrayList<>();
        for (Question q : questions) {
            if (q.getTopic().equalsIgnoreCase(topic)) {
                result.add(q);
            }
        }
        return result;
    }

    // UPDATE
    public boolean markReviewed(int id, String comment) {
        for (Question q : questions) {
            if (q.getId() == id) {
                q.setReviewed(true);
                q.setStaffComment(comment);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean deleteQuestion(int id) {
        Iterator<Question> iter = questions.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == id) {
                iter.remove();
                return true;
            }
        }
        return false;
    }

    public List<Question> getReviewedQuestions() {
        List<Question> reviewed = new ArrayList<>();
        for (Question q : questions) {
            if (q.isReviewed()) {
                reviewed.add(q);
            }
        }
        return reviewed;
    }
}
