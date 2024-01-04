package com.pqrs.request.infrastructure.adapter.request;

import com.pqrs.request.domain.entity.Request;
import com.pqrs.request.domain.service.request.CreateRequestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateRequestAdapter implements CreateRequestService {

  private final RequestRepository requestRepository;

  @Override
  public Request create(Request request) {
    return null;
  }
}
