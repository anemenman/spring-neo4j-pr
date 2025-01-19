package aa.domain.neo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Node("Author")
public class Author {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Relationship(type = "AUTHORED")
    private List<Book> books;
}
