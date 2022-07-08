package com.example.movieservice.queue;

import com.example.movieservice.model.Movie;
import com.example.movieservice.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class MovieListener {

    private final MovieService service;

    @RabbitListener(queues = {"${queue.movie.name}"})
    public List<Movie> receiveMessage(@Payload String genre) {
        return service.findByGenre(genre);
    }
}
