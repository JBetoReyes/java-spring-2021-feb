package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Ingredient;
import tacos.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
