//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.21 at 09:59:49 PM BST 
//


package mismo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AUS_CONSTRUCTION_REFINANCE_DATA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AUS_CONSTRUCTION_REFINANCE_DATA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="_ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="ConstructionImprovementCostsAmount" type="{}AUS_MISMOMoney" />
 *       &lt;attribute name="ConstructionPurposeType" type="{}AUS_ConstructionPurposeTypeEnumerated" />
 *       &lt;attribute name="FRECashOutAmount" type="{}AUS_MISMOMoney" />
 *       &lt;attribute name="GSERefinancePurposeType" type="{}AUS_GSERefinancePurposeTypeEnumerated" />
 *       &lt;attribute name="LandEstimatedValueAmount" type="{}AUS_MISMOMoney" />
 *       &lt;attribute name="LandOriginalCostAmount" type="{}AUS_MISMOMoney" />
 *       &lt;attribute name="PropertyAcquiredYear" type="{}AUS_MISMODateTime" />
 *       &lt;attribute name="PropertyExistingLienAmount" type="{}AUS_MISMOMoney" />
 *       &lt;attribute name="PropertyOriginalCostAmount" type="{}AUS_MISMOMoney" />
 *       &lt;attribute name="RefinanceImprovementCostsAmount" type="{}AUS_MISMOMoney" />
 *       &lt;attribute name="RefinanceImprovementsType" type="{}AUS_RefinanceImprovementsTypeEnumerated" />
 *       &lt;attribute name="RefinanceProposedImprovementsDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SecondaryFinancingRefinanceIndicator" type="{}AUS_MISMOIndicatorType" />
 *       &lt;attribute name="FNMSecondMortgageFinancingOriginalPropertyIndicator" type="{}AUS_MISMOIndicatorType" />
 *       &lt;attribute name="StructuralAlterationsConventionalAmount" type="{}AUS_MISMOMoney" />
 *       &lt;attribute name="NonStructuralAlterationsConventionalAmount" type="{}AUS_MISMOMoney" />
 *       &lt;attribute name="ConstructionToPermanentClosingFeatureType" type="{}AUS_ConstructionToPermanentClosingFeatureTypeEnumerated" />
 *       &lt;attribute name="ConstructionToPermanentClosingFeatureTypeOtherDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ConstructionToPermanentClosingType" type="{}AUS_ConstructionToPermanentClosingTypeEnumerated" />
 *       &lt;attribute name="ConstructionToPermanentClosingTypeOtherDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GSERefinancePurposeTypeOtherDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AUS_CONSTRUCTION_REFINANCE_DATA_Type")
public class AUSCONSTRUCTIONREFINANCEDATAType {

    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "ConstructionImprovementCostsAmount")
    protected String constructionImprovementCostsAmount;
    @XmlAttribute(name = "ConstructionPurposeType")
    protected AUSConstructionPurposeTypeEnumerated constructionPurposeType;
    @XmlAttribute(name = "FRECashOutAmount")
    protected String freCashOutAmount;
    @XmlAttribute(name = "GSERefinancePurposeType")
    protected AUSGSERefinancePurposeTypeEnumerated gseRefinancePurposeType;
    @XmlAttribute(name = "LandEstimatedValueAmount")
    protected String landEstimatedValueAmount;
    @XmlAttribute(name = "LandOriginalCostAmount")
    protected String landOriginalCostAmount;
    @XmlAttribute(name = "PropertyAcquiredYear")
    protected String propertyAcquiredYear;
    @XmlAttribute(name = "PropertyExistingLienAmount")
    protected String propertyExistingLienAmount;
    @XmlAttribute(name = "PropertyOriginalCostAmount")
    protected String propertyOriginalCostAmount;
    @XmlAttribute(name = "RefinanceImprovementCostsAmount")
    protected String refinanceImprovementCostsAmount;
    @XmlAttribute(name = "RefinanceImprovementsType")
    protected AUSRefinanceImprovementsTypeEnumerated refinanceImprovementsType;
    @XmlAttribute(name = "RefinanceProposedImprovementsDescription")
    protected String refinanceProposedImprovementsDescription;
    @XmlAttribute(name = "SecondaryFinancingRefinanceIndicator")
    protected String secondaryFinancingRefinanceIndicator;
    @XmlAttribute(name = "FNMSecondMortgageFinancingOriginalPropertyIndicator")
    protected String fnmSecondMortgageFinancingOriginalPropertyIndicator;
    @XmlAttribute(name = "StructuralAlterationsConventionalAmount")
    protected String structuralAlterationsConventionalAmount;
    @XmlAttribute(name = "NonStructuralAlterationsConventionalAmount")
    protected String nonStructuralAlterationsConventionalAmount;
    @XmlAttribute(name = "ConstructionToPermanentClosingFeatureType")
    protected AUSConstructionToPermanentClosingFeatureTypeEnumerated constructionToPermanentClosingFeatureType;
    @XmlAttribute(name = "ConstructionToPermanentClosingFeatureTypeOtherDescription")
    protected String constructionToPermanentClosingFeatureTypeOtherDescription;
    @XmlAttribute(name = "ConstructionToPermanentClosingType")
    protected AUSConstructionToPermanentClosingTypeEnumerated constructionToPermanentClosingType;
    @XmlAttribute(name = "ConstructionToPermanentClosingTypeOtherDescription")
    protected String constructionToPermanentClosingTypeOtherDescription;
    @XmlAttribute(name = "GSERefinancePurposeTypeOtherDescription")
    protected String gseRefinancePurposeTypeOtherDescription;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the constructionImprovementCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructionImprovementCostsAmount() {
        return constructionImprovementCostsAmount;
    }

    /**
     * Sets the value of the constructionImprovementCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionImprovementCostsAmount(String value) {
        this.constructionImprovementCostsAmount = value;
    }

    /**
     * Gets the value of the constructionPurposeType property.
     * 
     * @return
     *     possible object is
     *     {@link AUSConstructionPurposeTypeEnumerated }
     *     
     */
    public AUSConstructionPurposeTypeEnumerated getConstructionPurposeType() {
        return constructionPurposeType;
    }

    /**
     * Sets the value of the constructionPurposeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUSConstructionPurposeTypeEnumerated }
     *     
     */
    public void setConstructionPurposeType(AUSConstructionPurposeTypeEnumerated value) {
        this.constructionPurposeType = value;
    }

    /**
     * Gets the value of the freCashOutAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRECashOutAmount() {
        return freCashOutAmount;
    }

    /**
     * Sets the value of the freCashOutAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRECashOutAmount(String value) {
        this.freCashOutAmount = value;
    }

    /**
     * Gets the value of the gseRefinancePurposeType property.
     * 
     * @return
     *     possible object is
     *     {@link AUSGSERefinancePurposeTypeEnumerated }
     *     
     */
    public AUSGSERefinancePurposeTypeEnumerated getGSERefinancePurposeType() {
        return gseRefinancePurposeType;
    }

    /**
     * Sets the value of the gseRefinancePurposeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUSGSERefinancePurposeTypeEnumerated }
     *     
     */
    public void setGSERefinancePurposeType(AUSGSERefinancePurposeTypeEnumerated value) {
        this.gseRefinancePurposeType = value;
    }

    /**
     * Gets the value of the landEstimatedValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandEstimatedValueAmount() {
        return landEstimatedValueAmount;
    }

    /**
     * Sets the value of the landEstimatedValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandEstimatedValueAmount(String value) {
        this.landEstimatedValueAmount = value;
    }

    /**
     * Gets the value of the landOriginalCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandOriginalCostAmount() {
        return landOriginalCostAmount;
    }

    /**
     * Sets the value of the landOriginalCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandOriginalCostAmount(String value) {
        this.landOriginalCostAmount = value;
    }

    /**
     * Gets the value of the propertyAcquiredYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyAcquiredYear() {
        return propertyAcquiredYear;
    }

    /**
     * Sets the value of the propertyAcquiredYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyAcquiredYear(String value) {
        this.propertyAcquiredYear = value;
    }

    /**
     * Gets the value of the propertyExistingLienAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyExistingLienAmount() {
        return propertyExistingLienAmount;
    }

    /**
     * Sets the value of the propertyExistingLienAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyExistingLienAmount(String value) {
        this.propertyExistingLienAmount = value;
    }

    /**
     * Gets the value of the propertyOriginalCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyOriginalCostAmount() {
        return propertyOriginalCostAmount;
    }

    /**
     * Sets the value of the propertyOriginalCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyOriginalCostAmount(String value) {
        this.propertyOriginalCostAmount = value;
    }

    /**
     * Gets the value of the refinanceImprovementCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefinanceImprovementCostsAmount() {
        return refinanceImprovementCostsAmount;
    }

    /**
     * Sets the value of the refinanceImprovementCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefinanceImprovementCostsAmount(String value) {
        this.refinanceImprovementCostsAmount = value;
    }

    /**
     * Gets the value of the refinanceImprovementsType property.
     * 
     * @return
     *     possible object is
     *     {@link AUSRefinanceImprovementsTypeEnumerated }
     *     
     */
    public AUSRefinanceImprovementsTypeEnumerated getRefinanceImprovementsType() {
        return refinanceImprovementsType;
    }

    /**
     * Sets the value of the refinanceImprovementsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUSRefinanceImprovementsTypeEnumerated }
     *     
     */
    public void setRefinanceImprovementsType(AUSRefinanceImprovementsTypeEnumerated value) {
        this.refinanceImprovementsType = value;
    }

    /**
     * Gets the value of the refinanceProposedImprovementsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefinanceProposedImprovementsDescription() {
        return refinanceProposedImprovementsDescription;
    }

    /**
     * Sets the value of the refinanceProposedImprovementsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefinanceProposedImprovementsDescription(String value) {
        this.refinanceProposedImprovementsDescription = value;
    }

    /**
     * Gets the value of the secondaryFinancingRefinanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryFinancingRefinanceIndicator() {
        return secondaryFinancingRefinanceIndicator;
    }

    /**
     * Sets the value of the secondaryFinancingRefinanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryFinancingRefinanceIndicator(String value) {
        this.secondaryFinancingRefinanceIndicator = value;
    }

    /**
     * Gets the value of the fnmSecondMortgageFinancingOriginalPropertyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMSecondMortgageFinancingOriginalPropertyIndicator() {
        return fnmSecondMortgageFinancingOriginalPropertyIndicator;
    }

    /**
     * Sets the value of the fnmSecondMortgageFinancingOriginalPropertyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMSecondMortgageFinancingOriginalPropertyIndicator(String value) {
        this.fnmSecondMortgageFinancingOriginalPropertyIndicator = value;
    }

    /**
     * Gets the value of the structuralAlterationsConventionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructuralAlterationsConventionalAmount() {
        return structuralAlterationsConventionalAmount;
    }

    /**
     * Sets the value of the structuralAlterationsConventionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructuralAlterationsConventionalAmount(String value) {
        this.structuralAlterationsConventionalAmount = value;
    }

    /**
     * Gets the value of the nonStructuralAlterationsConventionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonStructuralAlterationsConventionalAmount() {
        return nonStructuralAlterationsConventionalAmount;
    }

    /**
     * Sets the value of the nonStructuralAlterationsConventionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonStructuralAlterationsConventionalAmount(String value) {
        this.nonStructuralAlterationsConventionalAmount = value;
    }

    /**
     * Gets the value of the constructionToPermanentClosingFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link AUSConstructionToPermanentClosingFeatureTypeEnumerated }
     *     
     */
    public AUSConstructionToPermanentClosingFeatureTypeEnumerated getConstructionToPermanentClosingFeatureType() {
        return constructionToPermanentClosingFeatureType;
    }

    /**
     * Sets the value of the constructionToPermanentClosingFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUSConstructionToPermanentClosingFeatureTypeEnumerated }
     *     
     */
    public void setConstructionToPermanentClosingFeatureType(AUSConstructionToPermanentClosingFeatureTypeEnumerated value) {
        this.constructionToPermanentClosingFeatureType = value;
    }

    /**
     * Gets the value of the constructionToPermanentClosingFeatureTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructionToPermanentClosingFeatureTypeOtherDescription() {
        return constructionToPermanentClosingFeatureTypeOtherDescription;
    }

    /**
     * Sets the value of the constructionToPermanentClosingFeatureTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionToPermanentClosingFeatureTypeOtherDescription(String value) {
        this.constructionToPermanentClosingFeatureTypeOtherDescription = value;
    }

    /**
     * Gets the value of the constructionToPermanentClosingType property.
     * 
     * @return
     *     possible object is
     *     {@link AUSConstructionToPermanentClosingTypeEnumerated }
     *     
     */
    public AUSConstructionToPermanentClosingTypeEnumerated getConstructionToPermanentClosingType() {
        return constructionToPermanentClosingType;
    }

    /**
     * Sets the value of the constructionToPermanentClosingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUSConstructionToPermanentClosingTypeEnumerated }
     *     
     */
    public void setConstructionToPermanentClosingType(AUSConstructionToPermanentClosingTypeEnumerated value) {
        this.constructionToPermanentClosingType = value;
    }

    /**
     * Gets the value of the constructionToPermanentClosingTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructionToPermanentClosingTypeOtherDescription() {
        return constructionToPermanentClosingTypeOtherDescription;
    }

    /**
     * Sets the value of the constructionToPermanentClosingTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionToPermanentClosingTypeOtherDescription(String value) {
        this.constructionToPermanentClosingTypeOtherDescription = value;
    }

    /**
     * Gets the value of the gseRefinancePurposeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSERefinancePurposeTypeOtherDescription() {
        return gseRefinancePurposeTypeOtherDescription;
    }

    /**
     * Sets the value of the gseRefinancePurposeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSERefinancePurposeTypeOtherDescription(String value) {
        this.gseRefinancePurposeTypeOtherDescription = value;
    }

}
