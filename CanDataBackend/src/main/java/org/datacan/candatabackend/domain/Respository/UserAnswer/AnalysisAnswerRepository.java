package org.datacan.candatabackend.domain.Respository.UserAnswer;


import org.datacan.candatabackend.domain.Model.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AnalysisAnswerRepository extends JpaRepository<UserAnswer, UUID> {

    @Query("SELECT AVG(u.answerNumeric) FROM UserAnswer u")
    Double getAvg();

    @Query("SELECT AVG(CASE WHEN x.answerBoolean = true THEN 1 ELSE 0 END) FROM UserAnswer x")
    Double findPercentageActive();


    List<UserAnswer> findByUserId(UUID userId);
    List<UserAnswer> findByQuestionId(UUID questionId);


}
