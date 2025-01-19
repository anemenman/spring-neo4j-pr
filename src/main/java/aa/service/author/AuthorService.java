package aa.service.author;

import aa.domain.neo.Author;

import java.util.List;

public interface AuthorService {

    List<Author> getAllAuthors();

    Author addAuthor(Author author);
}
