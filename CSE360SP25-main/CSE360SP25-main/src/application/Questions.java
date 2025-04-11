package application;

public class Questions {
    private int id;
    private String content;
    private String topic;
    private String submittedBy;

    // Staff-related fields
    private boolean reviewed = false;
    private String staffComment = "";

    // Constructor
    public Questions(int id, String content, String topic, String submittedBy) {
        this.id = id;
        this.content = content;
        this.topic = topic;
        this.submittedBy = submittedBy;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getTopic() {
        return topic;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public boolean isReviewed() {
        return reviewed;
    }

    public void setReviewed(boolean reviewed) {
        this.reviewed = reviewed;
    }

    public String getStaffComment() {
        return staffComment;
    }

    public void setStaffComment(String staffComment) {
        this.staffComment = staffComment;
    }

    // Optional: for printing/debugging
    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", topic='" + topic + '\'' +
                ", submittedBy='" + submittedBy + '\'' +
                ", reviewed=" + reviewed +
                ", staffComment='" + staffComment + '\'' +
                '}';
    }
}
