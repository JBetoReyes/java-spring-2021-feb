package tacos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
public class Taco {
    private String name;

    private List<Ingredient> ingredients;
}
