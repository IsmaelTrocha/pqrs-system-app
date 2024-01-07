package com.pqrs.request.infrastructure.adapter.request;

import com.pqrs.request.domain.entity.Request;
import com.pqrs.request.infrastructure.repository.RequestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class CreateRequestAdapter {

  private final RequestRepository requestRepository;
  private final WebClient.Builder webClientBuilder;

  public Mono<Request> create(Request request) {
    return null;
  }
}
