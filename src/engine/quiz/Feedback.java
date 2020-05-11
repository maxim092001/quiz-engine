package engine.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
/**
 * @author Grankin Maxim (maximgran@gmail.com) at 10:56 08.05.2020
 */

@Data
@AllArgsConstructor
public class Feedback {
    private boolean success;
    private String feedback;
}
