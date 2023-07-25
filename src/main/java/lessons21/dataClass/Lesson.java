package lessons21.dataClass;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Lesson {
    private int id;
    private String name;
    private int homework_id;
}
