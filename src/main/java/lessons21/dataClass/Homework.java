package lessons21.dataClass;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Homework {
    private int id;
    private String name;
    private String description;
}
