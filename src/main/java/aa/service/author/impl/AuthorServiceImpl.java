package aa.service.author.impl;

import aa.domain.neo.Author;
import aa.repository.AuthorRepository;
import aa.service.author.AuthorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author addAuthor(final Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Page<Author> getAllAuthorsPageable(final Pageable pageable) {
        return authorRepository.findAll(pageable);
    }
}
