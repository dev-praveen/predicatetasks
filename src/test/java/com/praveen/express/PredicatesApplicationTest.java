package com.praveen.express;

import com.praveen.express.enums.DeveloperCategorization;
import com.praveen.express.model.InterviewRequest;
import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.function.Predicate;
import static org.junit.jupiter.api.Assertions.*;

class PredicatesApplicationTest {

  @Test
  void shouldGetMessageForExpertDeveloper() {

    final var interviewRequest =
        InterviewRequest.builder()
            .isPersonGoodAtDSA(true)
            .isPersonGoodAtSystemDesign(true)
            .developerCategorization(DeveloperCategorization.EXPERT_DEVELOPER)
            .build();

    final var interviewChecks = interviewRequest.getDeveloperCategorization().getInterviewChecks();

    final var message =
        interviewChecks.entrySet().stream()
            .filter(
                Predicate.not(
                    predicateStringEntry -> predicateStringEntry.getKey().test(interviewRequest)))
            .map(Map.Entry::getValue)
            .findFirst()
            .orElseThrow();

    System.out.println(message);
  }
}
