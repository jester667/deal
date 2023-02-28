package ru.neoflex.deal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Loan offer after short scoring.
 */
@ApiModel(description = "Loan offer after short scoring.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-15T13:51:35.942372300+03:00[Europe/Moscow]")@lombok.AllArgsConstructor
@lombok.Builder
@lombok.NoArgsConstructor

public class LoanOfferDTO   {
  @JsonProperty("applicationId")
  private Long applicationId;

  @JsonProperty("requestedAmount")
  private java.math.BigDecimal requestedAmount;

  @JsonProperty("totalAmount")
  private java.math.BigDecimal totalAmount;

  @JsonProperty("term")
  private Integer term;

  @JsonProperty("monthlyPayment")
  private java.math.BigDecimal monthlyPayment;

  @JsonProperty("rate")
  private java.math.BigDecimal rate;

  @JsonProperty("isInsuranceEnabled")
  private Boolean isInsuranceEnabled;

  @JsonProperty("isSalaryClient")
  private Boolean isSalaryClient;

  public LoanOfferDTO applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * application id.
   * @return applicationId
  */
  @ApiModelProperty(example = "1", value = "application id.")


  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  public LoanOfferDTO requestedAmount(java.math.BigDecimal requestedAmount) {
    this.requestedAmount = requestedAmount;
    return this;
  }

  /**
   * Requested loan amount.
   * minimum: 10000.0
   * @return requestedAmount
  */
  @ApiModelProperty(example = "1000000.0", required = true, value = "Requested loan amount.")
  @NotNull

  @Valid
@DecimalMin("10000.0") 
  public java.math.BigDecimal getRequestedAmount() {
    return requestedAmount;
  }

  public void setRequestedAmount(java.math.BigDecimal requestedAmount) {
    this.requestedAmount = requestedAmount;
  }

  public LoanOfferDTO totalAmount(java.math.BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Total loan amount (with services, insurance etc.).
   * minimum: 10000.0
   * @return totalAmount
  */
  @ApiModelProperty(example = "1000000.0", required = true, value = "Total loan amount (with services, insurance etc.).")
  @NotNull

  @Valid
@DecimalMin("10000.0") 
  public java.math.BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(java.math.BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }

  public LoanOfferDTO term(Integer term) {
    this.term = term;
    return this;
  }

  /**
   * Requested loan term (months).
   * minimum: 6
   * @return term
  */
  @ApiModelProperty(example = "24", required = true, value = "Requested loan term (months).")
  @NotNull

@Min(6) 
  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    this.term = term;
  }

  public LoanOfferDTO monthlyPayment(java.math.BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
    return this;
  }

  /**
   * Monthly payment.
   * @return monthlyPayment
  */
  @ApiModelProperty(example = "10000.1", required = true, value = "Monthly payment.")
  @NotNull

  @Valid

  public java.math.BigDecimal getMonthlyPayment() {
    return monthlyPayment;
  }

  public void setMonthlyPayment(java.math.BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }

  public LoanOfferDTO rate(java.math.BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Loan rate
   * @return rate
  */
  @ApiModelProperty(example = "12.5", required = true, value = "Loan rate")
  @NotNull

  @Valid

  public java.math.BigDecimal getRate() {
    return rate;
  }

  public void setRate(java.math.BigDecimal rate) {
    this.rate = rate;
  }

  public LoanOfferDTO isInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
    return this;
  }

  /**
   * Is insurance enabled?
   * @return isInsuranceEnabled
  */
  @ApiModelProperty(example = "true", required = true, value = "Is insurance enabled?")
  @NotNull


  public Boolean getIsInsuranceEnabled() {
    return isInsuranceEnabled;
  }

  public void setIsInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
  }

  public LoanOfferDTO isSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
    return this;
  }

  /**
   * Is salary client?
   * @return isSalaryClient
  */
  @ApiModelProperty(example = "true", required = true, value = "Is salary client?")
  @NotNull


  public Boolean getIsSalaryClient() {
    return isSalaryClient;
  }

  public void setIsSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanOfferDTO loanOfferDTO = (LoanOfferDTO) o;
    return Objects.equals(this.applicationId, loanOfferDTO.applicationId) &&
        Objects.equals(this.requestedAmount, loanOfferDTO.requestedAmount) &&
        Objects.equals(this.totalAmount, loanOfferDTO.totalAmount) &&
        Objects.equals(this.term, loanOfferDTO.term) &&
        Objects.equals(this.monthlyPayment, loanOfferDTO.monthlyPayment) &&
        Objects.equals(this.rate, loanOfferDTO.rate) &&
        Objects.equals(this.isInsuranceEnabled, loanOfferDTO.isInsuranceEnabled) &&
        Objects.equals(this.isSalaryClient, loanOfferDTO.isSalaryClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, requestedAmount, totalAmount, term, monthlyPayment, rate, isInsuranceEnabled, isSalaryClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanOfferDTO {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    requestedAmount: ").append(toIndentedString(requestedAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    monthlyPayment: ").append(toIndentedString(monthlyPayment)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    isInsuranceEnabled: ").append(toIndentedString(isInsuranceEnabled)).append("\n");
    sb.append("    isSalaryClient: ").append(toIndentedString(isSalaryClient)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

