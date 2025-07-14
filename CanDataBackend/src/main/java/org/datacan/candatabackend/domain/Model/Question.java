package org.datacan.candatabackend.domain.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "questionId", nullable = false)
    private UUID id;

    @NotNull(message = "You have to define a category")
    private String questionCategory;

    @NotNull(message = "You can't create a question without a title")
    private String questionTitle;

    private boolean mandatory;


}
