/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.schemaorg.core;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.SchemaOrgTypeImpl;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link DiagnosticProcedure}. */
public class DiagnosticProcedureImpl extends MedicalProcedureImpl implements DiagnosticProcedure {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_AFFECTED_BY);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_CODE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_FOLLOWUP);

    builder.add(CoreConstants.PROPERTY_GUIDELINE);

    builder.add(CoreConstants.PROPERTY_HOW_PERFORMED);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MEDICINE_SYSTEM);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_NORMAL_RANGE);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PREPARATION);

    builder.add(CoreConstants.PROPERTY_PROCEDURE_TYPE);

    builder.add(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY);

    builder.add(CoreConstants.PROPERTY_RELEVANT_SPECIALTY);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SIGN_DETECTED);

    builder.add(CoreConstants.PROPERTY_STUDY);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_USED_TO_DIAGNOSE);

    builder.add(CoreConstants.PROPERTY_USES_DEVICE);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<DiagnosticProcedure.Builder>
      implements DiagnosticProcedure.Builder {

    @Override
    public DiagnosticProcedure.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public DiagnosticProcedure.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addAffectedBy(Drug value) {
      return addProperty(CoreConstants.PROPERTY_AFFECTED_BY, value);
    }

    @Override
    public DiagnosticProcedure.Builder addAffectedBy(Drug.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AFFECTED_BY, value.build());
    }

    @Override
    public DiagnosticProcedure.Builder addAffectedBy(String value) {
      return addProperty(CoreConstants.PROPERTY_AFFECTED_BY, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public DiagnosticProcedure.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addCode(MedicalCode value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value);
    }

    @Override
    public DiagnosticProcedure.Builder addCode(MedicalCode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value.build());
    }

    @Override
    public DiagnosticProcedure.Builder addCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CODE, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public DiagnosticProcedure.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addFollowup(Text value) {
      return addProperty(CoreConstants.PROPERTY_FOLLOWUP, value);
    }

    @Override
    public DiagnosticProcedure.Builder addFollowup(String value) {
      return addProperty(CoreConstants.PROPERTY_FOLLOWUP, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addGuideline(MedicalGuideline value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value);
    }

    @Override
    public DiagnosticProcedure.Builder addGuideline(MedicalGuideline.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value.build());
    }

    @Override
    public DiagnosticProcedure.Builder addGuideline(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addHowPerformed(Text value) {
      return addProperty(CoreConstants.PROPERTY_HOW_PERFORMED, value);
    }

    @Override
    public DiagnosticProcedure.Builder addHowPerformed(String value) {
      return addProperty(CoreConstants.PROPERTY_HOW_PERFORMED, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public DiagnosticProcedure.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public DiagnosticProcedure.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public DiagnosticProcedure.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public DiagnosticProcedure.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public DiagnosticProcedure.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public DiagnosticProcedure.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addMedicineSystem(MedicineSystem value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, value);
    }

    @Override
    public DiagnosticProcedure.Builder addMedicineSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public DiagnosticProcedure.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addNormalRange(Text value) {
      return addProperty(CoreConstants.PROPERTY_NORMAL_RANGE, value);
    }

    @Override
    public DiagnosticProcedure.Builder addNormalRange(String value) {
      return addProperty(CoreConstants.PROPERTY_NORMAL_RANGE, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public DiagnosticProcedure.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public DiagnosticProcedure.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addPreparation(Text value) {
      return addProperty(CoreConstants.PROPERTY_PREPARATION, value);
    }

    @Override
    public DiagnosticProcedure.Builder addPreparation(String value) {
      return addProperty(CoreConstants.PROPERTY_PREPARATION, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addProcedureType(MedicalProcedureType value) {
      return addProperty(CoreConstants.PROPERTY_PROCEDURE_TYPE, value);
    }

    @Override
    public DiagnosticProcedure.Builder addProcedureType(String value) {
      return addProperty(CoreConstants.PROPERTY_PROCEDURE_TYPE, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addRecognizingAuthority(Organization value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value);
    }

    @Override
    public DiagnosticProcedure.Builder addRecognizingAuthority(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value.build());
    }

    @Override
    public DiagnosticProcedure.Builder addRecognizingAuthority(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addRelevantSpecialty(MedicalSpecialty value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, value);
    }

    @Override
    public DiagnosticProcedure.Builder addRelevantSpecialty(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public DiagnosticProcedure.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addSignDetected(MedicalSign value) {
      return addProperty(CoreConstants.PROPERTY_SIGN_DETECTED, value);
    }

    @Override
    public DiagnosticProcedure.Builder addSignDetected(MedicalSign.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SIGN_DETECTED, value.build());
    }

    @Override
    public DiagnosticProcedure.Builder addSignDetected(String value) {
      return addProperty(CoreConstants.PROPERTY_SIGN_DETECTED, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addStudy(MedicalStudy value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value);
    }

    @Override
    public DiagnosticProcedure.Builder addStudy(MedicalStudy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value.build());
    }

    @Override
    public DiagnosticProcedure.Builder addStudy(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public DiagnosticProcedure.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addUsedToDiagnose(MedicalCondition value) {
      return addProperty(CoreConstants.PROPERTY_USED_TO_DIAGNOSE, value);
    }

    @Override
    public DiagnosticProcedure.Builder addUsedToDiagnose(MedicalCondition.Builder value) {
      return addProperty(CoreConstants.PROPERTY_USED_TO_DIAGNOSE, value.build());
    }

    @Override
    public DiagnosticProcedure.Builder addUsedToDiagnose(String value) {
      return addProperty(CoreConstants.PROPERTY_USED_TO_DIAGNOSE, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addUsesDevice(MedicalDevice value) {
      return addProperty(CoreConstants.PROPERTY_USES_DEVICE, value);
    }

    @Override
    public DiagnosticProcedure.Builder addUsesDevice(MedicalDevice.Builder value) {
      return addProperty(CoreConstants.PROPERTY_USES_DEVICE, value.build());
    }

    @Override
    public DiagnosticProcedure.Builder addUsesDevice(String value) {
      return addProperty(CoreConstants.PROPERTY_USES_DEVICE, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public DiagnosticProcedure.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public DiagnosticProcedure.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public DiagnosticProcedure.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public DiagnosticProcedure.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public DiagnosticProcedure.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public DiagnosticProcedure build() {
      return new DiagnosticProcedureImpl(properties, reverseMap);
    }
  }

  public DiagnosticProcedureImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_DIAGNOSTIC_PROCEDURE;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAffectedByList() {
    return getProperty(CoreConstants.PROPERTY_AFFECTED_BY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNormalRangeList() {
    return getProperty(CoreConstants.PROPERTY_NORMAL_RANGE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSignDetectedList() {
    return getProperty(CoreConstants.PROPERTY_SIGN_DETECTED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getUsedToDiagnoseList() {
    return getProperty(CoreConstants.PROPERTY_USED_TO_DIAGNOSE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getUsesDeviceList() {
    return getProperty(CoreConstants.PROPERTY_USES_DEVICE);
  }
}
