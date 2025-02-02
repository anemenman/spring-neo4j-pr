package aa.service.author;

import aa.domain.neo.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AuthorService {

    List<Author> getAllAuthors();

    Author addAuthor(Author author);

    Page<Author> getAllAuthorsPageable(Pageable pageable);
}
