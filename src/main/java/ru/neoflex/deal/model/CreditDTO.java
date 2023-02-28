package ru.neoflex.deal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Credit&#39;s info.
 */
@ApiModel(description = "Credit's info.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-15T13:51:35.942372300+03:00[Europe/Moscow]")@lombok.AllArgsConstructor
@lombok.Builder
@lombok.NoArgsConstructor

public class CreditDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("amount")
  private java.math.BigDecimal amount;

  @JsonProperty("term")
  private Integer term;

  @JsonProperty("monthlyPayment")
  private java.math.BigDecimal monthlyPayment;

  @JsonProperty("rate")
  private java.math.BigDecimal rate;

  @JsonProperty("psk")
  private java.math.BigDecimal psk;

  @JsonProperty("isInsuranceEnabled")
  private Boolean isInsuranceEnabled;

  @JsonProperty("isSalaryClient")
  private Boolean isSalaryClient;

  @JsonProperty("paymentSchedule")
  @Valid
  private List<PaymentScheduleElement> paymentSchedule = null;

  public CreditDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Credit id.
   * @return id
  */
  @ApiModelProperty(example = "1", value = "Credit id.")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CreditDTO amount(java.math.BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Requested loan amount.
   * @return amount
  */
  @ApiModelProperty(example = "1000000.0", value = "Requested loan amount.")

  @Valid

  public java.math.BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(java.math.BigDecimal amount) {
    this.amount = amount;
  }

  public CreditDTO term(Integer term) {
    this.term = term;
    return this;
  }

  /**
   * Requested loan term (months).
   * @return term
  */
  @ApiModelProperty(example = "24", value = "Requested loan term (months).")


  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    this.term = term;
  }

  public CreditDTO monthlyPayment(java.math.BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
    return this;
  }

  /**
   * Monthly payment.
   * @return monthlyPayment
  */
  @ApiModelProperty(example = "10000.1", value = "Monthly payment.")

  @Valid

  public java.math.BigDecimal getMonthlyPayment() {
    return monthlyPayment;
  }

  public void setMonthlyPayment(java.math.BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }

  public CreditDTO rate(java.math.BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Loan rate
   * @return rate
  */
  @ApiModelProperty(example = "12.5", value = "Loan rate")

  @Valid

  public java.math.BigDecimal getRate() {
    return rate;
  }

  public void setRate(java.math.BigDecimal rate) {
    this.rate = rate;
  }

  public CreditDTO psk(java.math.BigDecimal psk) {
    this.psk = psk;
    return this;
  }

  /**
   * Loan Full Price
   * @return psk
  */
  @ApiModelProperty(example = "12.5", value = "Loan Full Price")

  @Valid

  public java.math.BigDecimal getPsk() {
    return psk;
  }

  public void setPsk(java.math.BigDecimal psk) {
    this.psk = psk;
  }

  public CreditDTO isInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
    return this;
  }

  /**
   * Is insurance enabled?
   * @return isInsuranceEnabled
  */
  @ApiModelProperty(example = "true", value = "Is insurance enabled?")


  public Boolean getIsInsuranceEnabled() {
    return isInsuranceEnabled;
  }

  public void setIsInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
  }

  public CreditDTO isSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
    return this;
  }

  /**
   * Is salary client?
   * @return isSalaryClient
  */
  @ApiModelProperty(example = "true", value = "Is salary client?")


  public Boolean getIsSalaryClient() {
    return isSalaryClient;
  }

  public void setIsSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
  }

  public CreditDTO paymentSchedule(List<PaymentScheduleElement> paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
    return this;
  }

  public CreditDTO addPaymentScheduleItem(PaymentScheduleElement paymentScheduleItem) {
    if (this.paymentSchedule == null) {
      this.paymentSchedule = new ArrayList<PaymentScheduleElement>();
    }
    this.paymentSchedule.add(paymentScheduleItem);
    return this;
  }

  /**
   * Get paymentSchedule
   * @return paymentSchedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PaymentScheduleElement> getPaymentSchedule() {
    return paymentSchedule;
  }

  public void setPaymentSchedule(List<PaymentScheduleElement> paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditDTO creditDTO = (CreditDTO) o;
    return Objects.equals(this.id, creditDTO.id) &&
        Objects.equals(this.amount, creditDTO.amount) &&
        Objects.equals(this.term, creditDTO.term) &&
        Objects.equals(this.monthlyPayment, creditDTO.monthlyPayment) &&
        Objects.equals(this.rate, creditDTO.rate) &&
        Objects.equals(this.psk, creditDTO.psk) &&
        Objects.equals(this.isInsuranceEnabled, creditDTO.isInsuranceEnabled) &&
        Objects.equals(this.isSalaryClient, creditDTO.isSalaryClient) &&
        Objects.equals(this.paymentSchedule, creditDTO.paymentSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, term, monthlyPayment, rate, psk, isInsuranceEnabled, isSalaryClient, paymentSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    monthlyPayment: ").append(toIndentedString(monthlyPayment)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
    sb.append("    isInsuranceEnabled: ").append(toIndentedString(isInsuranceEnabled)).append("\n");
    sb.append("    isSalaryClient: ").append(toIndentedString(isSalaryClient)).append("\n");
    sb.append("    paymentSchedule: ").append(toIndentedString(paymentSchedule)).append("\n");
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

