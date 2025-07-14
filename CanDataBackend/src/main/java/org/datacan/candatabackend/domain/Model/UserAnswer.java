package org.datacan.candatabackend.domain.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAnswer {

    @Id
    @Column(name = "answerId", nullable = false)
    private UUID answerId;

    @NotEmpty(message = "You have to define the user")
    private UUID userId;

    private UUID questionId;

    private String answerText;

    private int answerNumeric;

    private boolean answerBoolean;






}
