package org.datacan.candatabackend.domain.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSessionData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sessionId", nullable = false)
    private UUID sessionId;
    private UUID userId;

    private LocalDateTime SessionStartTime;
    private LocalDateTime SessionEndTime;


    private String entryQuestion;
    private String exitQuestion;

}
