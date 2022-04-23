package com.praveen.express.model;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class ShortListChecks {

  private ShortListChecks() {
    throw new IllegalStateException("Utility class");
  }

  public static Map<Predicate<InterviewRequest>, String> getExpertDeveloperChecks() {

    final var expertChecks = new LinkedHashMap<Predicate<InterviewRequest>, String>();
    expertChecks.put(InterviewRequest::isPersonGoodAtDSA, "Person is Good at DSA");
    expertChecks.put(
        InterviewRequest::isPersonGoodAtSystemDesign, "Person is Good at System Design");

    return expertChecks;
  }

  public static Map<Predicate<InterviewRequest>, String> getGoodDeveloperChecks() {

    final var expertChecks = new LinkedHashMap<Predicate<InterviewRequest>, String>();
    expertChecks.put(InterviewRequest::isPersonExperienced, "Person is having IT experience");
    expertChecks.put(InterviewRequest::isPersonClearedWritten, "Person cleared written");

    return expertChecks;
  }

  public static Map<Predicate<InterviewRequest>, String> getAverageDeveloperChecks() {

    final var expertChecks = new LinkedHashMap<Predicate<InterviewRequest>, String>();
    expertChecks.put(InterviewRequest::isPersonFresher, "Person is college passed out");

    return expertChecks;
  }

  public static Map<Predicate<InterviewRequest>, String> getBadDeveloperChecks() {

    return Collections.emptyMap();
  }
}
