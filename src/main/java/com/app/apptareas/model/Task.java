package com.app.apptareas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String description;
    public enum Status {
        NOT_STARTED,
        PENDING,
        IN_PROGRESS,
        COMPLETED
    }
    @Getter @Setter
    private Status status;
}

