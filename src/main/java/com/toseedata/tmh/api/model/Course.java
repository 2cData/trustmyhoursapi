package com.toseedata.tmh.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Course implements Serializable {
    private String id;
    private String name;
    private String description;
    private List<String> steps;
}
