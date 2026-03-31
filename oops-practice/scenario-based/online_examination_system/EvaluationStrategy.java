package scenario_based.online_examination_system;
import java.util.List;

public interface EvaluationStrategy {
    int evaluate(List<Question> questions);
}
