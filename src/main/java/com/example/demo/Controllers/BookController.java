package com.example.demo.Controllers;

import com.example.demo.Entity.Book;
import com.example.demo.Repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping
    private Flux<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    private Mono<Book> getBookById(@PathVariable Long id){
        return bookRepository.findById(id);
    }

    @PostMapping
    private Mono<Book> addBook(@RequestBody Book book){

        return bookRepository.save(book);
    }
    @PutMapping("/{id}")
    public Mono<Book> updateBook (@PathVariable Long id, @RequestBody Book book){
        return bookRepository.findById(id)
                .flatMap(existingBook -> {
                    existingBook.setTitle(book.getTitle());
                    existingBook.setAuthor(book.getAuthor());
                    return bookRepository.save(existingBook);
                })
                .switchIfEmpty(Mono.error(new RuntimeException("Livro não encontrado com o ID: " + id)));
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteBook(@PathVariable Long id){
        return bookRepository.deleteById(id);
    }
}
