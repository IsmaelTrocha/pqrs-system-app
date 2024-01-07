package com.pqrs.images.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class MultipartUpload {

  private Long id;
  private Long requestId;
  private String name;
  private String resource;
  private String type;


}
