package org.datacan.candatabackend.domain.Model;


import jakarta.persistence.*;
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
public class UserAnalysis {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId", nullable = false)
    private UUID userId;

    private UUID surveyIdd;

    private double mouseX;
    private double mouseY;

    private String actionType;
    private String clickType;

    private double speed;

    private String browserInfo;
    private String screenResolution;
    private long durationOnPage;





}
