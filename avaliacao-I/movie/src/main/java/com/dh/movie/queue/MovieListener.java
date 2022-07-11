package com.dh.movie.queue;

import com.dh.movie.model.Movie;
import com.dh.movie.service.MovieService;
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
    public void receiveMessage(Movie movie) {
        return service.save(movie);
    }

}
