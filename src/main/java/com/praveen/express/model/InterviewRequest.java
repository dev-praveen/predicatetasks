package com.praveen.express.model;

import com.praveen.express.enums.DeveloperCategorization;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InterviewRequest {

  private boolean isPersonExperienced;
  private boolean isPersonFresher;
  private String gender;
  private boolean isPersonGoodAtDSA;
  private boolean isPersonGoodAtSystemDesign;
  private boolean isPersonPassedWithFirstClass;
  private boolean isPersonClearedWritten;
  private DeveloperCategorization developerCategorization;
}
