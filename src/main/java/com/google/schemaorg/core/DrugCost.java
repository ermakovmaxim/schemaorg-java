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
import com.google.schemaorg.JsonLdContext;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/** Interface of <a href="http://schema.org/DrugCost">http://schema.org/DrugCost</a>. */
public interface DrugCost extends MedicalIntangible {

  /** Builder interface of <a href="http://schema.org/DrugCost">http://schema.org/DrugCost</a>. */
  public interface Builder extends MedicalIntangible.Builder {

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext context);

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext.Builder context);

    @Override
    Builder setJsonLdId(@Nullable String value);

    @Override
    Builder setJsonLdReverse(String property, Thing obj);

    @Override
    Builder setJsonLdReverse(String property, Thing.Builder builder);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property applicableLocation. */
    Builder addApplicableLocation(AdministrativeArea value);

    /** Add a value to property applicableLocation. */
    Builder addApplicableLocation(AdministrativeArea.Builder value);

    /** Add a value to property applicableLocation. */
    Builder addApplicableLocation(String value);

    /** Add a value to property code. */
    Builder addCode(MedicalCode value);

    /** Add a value to property code. */
    Builder addCode(MedicalCode.Builder value);

    /** Add a value to property code. */
    Builder addCode(String value);

    /** Add a value to property costCategory. */
    Builder addCostCategory(DrugCostCategory value);

    /** Add a value to property costCategory. */
    Builder addCostCategory(String value);

    /** Add a value to property costCurrency. */
    Builder addCostCurrency(Text value);

    /** Add a value to property costCurrency. */
    Builder addCostCurrency(String value);

    /** Add a value to property costOrigin. */
    Builder addCostOrigin(Text value);

    /** Add a value to property costOrigin. */
    Builder addCostOrigin(String value);

    /** Add a value to property costPerUnit. */
    Builder addCostPerUnit(Number value);

    /** Add a value to property costPerUnit. */
    Builder addCostPerUnit(Text value);

    /** Add a value to property costPerUnit. */
    Builder addCostPerUnit(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property drugUnit. */
    Builder addDrugUnit(Text value);

    /** Add a value to property drugUnit. */
    Builder addDrugUnit(String value);

    /** Add a value to property guideline. */
    Builder addGuideline(MedicalGuideline value);

    /** Add a value to property guideline. */
    Builder addGuideline(MedicalGuideline.Builder value);

    /** Add a value to property guideline. */
    Builder addGuideline(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork.Builder value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(URL value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(String value);

    /** Add a value to property medicineSystem. */
    Builder addMedicineSystem(MedicineSystem value);

    /** Add a value to property medicineSystem. */
    Builder addMedicineSystem(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property recognizingAuthority. */
    Builder addRecognizingAuthority(Organization value);

    /** Add a value to property recognizingAuthority. */
    Builder addRecognizingAuthority(Organization.Builder value);

    /** Add a value to property recognizingAuthority. */
    Builder addRecognizingAuthority(String value);

    /** Add a value to property relevantSpecialty. */
    Builder addRelevantSpecialty(MedicalSpecialty value);

    /** Add a value to property relevantSpecialty. */
    Builder addRelevantSpecialty(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property study. */
    Builder addStudy(MedicalStudy value);

    /** Add a value to property study. */
    Builder addStudy(MedicalStudy.Builder value);

    /** Add a value to property study. */
    Builder addStudy(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(Article value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(Article.Builder value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(String value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(PopularityScoreSpecification value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(PopularityScoreSpecification.Builder value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(String value);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The value of the property.
     */
    Builder addProperty(String name, SchemaOrgType value);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param builder The schema.org object builder for the property value.
     */
    Builder addProperty(String name, Thing.Builder builder);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The string value of the property.
     */
    Builder addProperty(String name, String value);

    /** Build a {@link DrugCost} object. */
    DrugCost build();
  }

  /**
   * Returns the value list of property applicableLocation. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getApplicableLocationList();

  /**
   * Returns the value list of property costCategory. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getCostCategoryList();

  /**
   * Returns the value list of property costCurrency. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getCostCurrencyList();

  /**
   * Returns the value list of property costOrigin. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getCostOriginList();

  /**
   * Returns the value list of property costPerUnit. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getCostPerUnitList();

  /**
   * Returns the value list of property drugUnit. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getDrugUnitList();
}
