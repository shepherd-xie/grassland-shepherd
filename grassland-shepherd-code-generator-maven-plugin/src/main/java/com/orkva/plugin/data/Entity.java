package com.orkva.plugin.data;

import lombok.Data;

import java.util.List;

@Data
public class Entity {
    private String tableName;
    private String className;
    private String variableName;
    private String model;
    private List<Object> fields;
}
