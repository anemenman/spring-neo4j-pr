package aa.web.rest;

import aa.domain.neo.Author;
import aa.service.author.AuthorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static aa.web.rest.AuthorResource.BASE_URL;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(BASE_URL)
public class AuthorResource {

    public static final String BASE_URL = "/api/v1/author";

    public static final String LIST = "/list";

    private final AuthorService authorService;

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @PostMapping
    public Author addAuthor(final @RequestBody Author author) {
        return authorService.addAuthor(author);
    }

    @GetMapping(LIST)
    public Page<Author> getAllAuthorsPageable(final Pageable pageable) {
        return authorService.getAllAuthorsPageable(pageable);
    }
}
