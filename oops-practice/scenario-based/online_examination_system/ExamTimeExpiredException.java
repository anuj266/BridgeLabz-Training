package scenario_based.online_examination_system;

public class ExamTimeExpiredException extends Exception {
    public ExamTimeExpiredException(String message) {
        super(message);
    }
}