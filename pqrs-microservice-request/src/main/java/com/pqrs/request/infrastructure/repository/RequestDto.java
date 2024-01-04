package com.pqrs.request.infrastructure.repository;

import com.pqrs.request.domain.entity.RequestType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "REQUESTS")
public class RequestDto {

  private Long id;
  private RequestType requestType;
  private String dependency;
  private String category;
  private String description;
  private LocalDateTime created;
  private LocalDateTime checked;
  private LocalDateTime answered;
  private String response;
  private String status;
  private Integer filedNumber;
  private String meansOfResponse;

}
