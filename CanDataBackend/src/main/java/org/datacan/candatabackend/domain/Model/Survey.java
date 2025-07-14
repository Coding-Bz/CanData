package org.datacan.candatabackend.domain.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "surveyId", nullable = false)
    private UUID survey_id;

    @NotNull(message = "You have to set a survey name")
    private String surveyName;

    private String surveyDescription;

    @NotNull(message = "You have to set a language for your survey")
    private String surveyLanguage;


}
