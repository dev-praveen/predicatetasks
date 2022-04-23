package com.praveen.express.enums;

import com.praveen.express.model.InterviewRequest;
import static com.praveen.express.model.ShortListChecks.*;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

@Getter
@RequiredArgsConstructor
public enum DeveloperCategorization {
  EXPERT_DEVELOPER("A111", getExpertDeveloperChecks()),
  GOOD_DEVELOPER("B111", getGoodDeveloperChecks()),
  AVERAGE_DEVELOPER("C111", getAverageDeveloperChecks()),
  BAD_DEVELOPER("D111", getBadDeveloperChecks());

  private final String grade;
  private final Map<Predicate<InterviewRequest>, String> interviewChecks;

  public static DeveloperCategorization getDeveloperCategorization(String grade) {

    return Stream.of(values())
        .filter(developerCategorization -> developerCategorization.getGrade().equals(grade))
        .findFirst()
        .orElseThrow();
  }
}
