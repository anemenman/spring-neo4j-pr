package aa.domain.neo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Node("Book")
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    
    private String name;
}
