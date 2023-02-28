package ru.neoflex.deal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * Payment schedule element.
 */
@ApiModel(description = "Payment schedule element.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-15T13:51:35.942372300+03:00[Europe/Moscow]")@lombok.AllArgsConstructor
@lombok.Builder
@lombok.NoArgsConstructor

public class PaymentScheduleElement   {
  @JsonProperty("number")
  private Integer number;

  @JsonProperty("date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private java.time.LocalDate date;

  @JsonProperty("totalPayment")
  private java.math.BigDecimal totalPayment;

  @JsonProperty("interestPayment")
  private java.math.BigDecimal interestPayment;

  @JsonProperty("debtPayment")
  private java.math.BigDecimal debtPayment;

  @JsonProperty("remainingDebt")
  private java.math.BigDecimal remainingDebt;

  public PaymentScheduleElement number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Payment sequence number.
   * @return number
  */
  @ApiModelProperty(example = "1", value = "Payment sequence number.")


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PaymentScheduleElement date(java.time.LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Payment date.
   * @return date
  */
  @ApiModelProperty(example = "Wed Jun 01 03:00:00 MSK 2022", value = "Payment date.")

  @Valid

  public java.time.LocalDate getDate() {
    return date;
  }

  public void setDate(java.time.LocalDate date) {
    this.date = date;
  }

  public PaymentScheduleElement totalPayment(java.math.BigDecimal totalPayment) {
    this.totalPayment = totalPayment;
    return this;
  }

  /**
   * Total payment amount.
   * @return totalPayment
  */
  @ApiModelProperty(example = "12000.0", value = "Total payment amount.")

  @Valid

  public java.math.BigDecimal getTotalPayment() {
    return totalPayment;
  }

  public void setTotalPayment(java.math.BigDecimal totalPayment) {
    this.totalPayment = totalPayment;
  }

  public PaymentScheduleElement interestPayment(java.math.BigDecimal interestPayment) {
    this.interestPayment = interestPayment;
    return this;
  }

  /**
   * Interest payment amount.
   * @return interestPayment
  */
  @ApiModelProperty(example = "12000.0", value = "Interest payment amount.")

  @Valid

  public java.math.BigDecimal getInterestPayment() {
    return interestPayment;
  }

  public void setInterestPayment(java.math.BigDecimal interestPayment) {
    this.interestPayment = interestPayment;
  }

  public PaymentScheduleElement debtPayment(java.math.BigDecimal debtPayment) {
    this.debtPayment = debtPayment;
    return this;
  }

  /**
   * Main debt payment amount.
   * @return debtPayment
  */
  @ApiModelProperty(example = "8000.0", value = "Main debt payment amount.")

  @Valid

  public java.math.BigDecimal getDebtPayment() {
    return debtPayment;
  }

  public void setDebtPayment(java.math.BigDecimal debtPayment) {
    this.debtPayment = debtPayment;
  }

  public PaymentScheduleElement remainingDebt(java.math.BigDecimal remainingDebt) {
    this.remainingDebt = remainingDebt;
    return this;
  }

  /**
   * Remaining debt amount.
   * @return remainingDebt
  */
  @ApiModelProperty(example = "92000.0", value = "Remaining debt amount.")

  @Valid

  public java.math.BigDecimal getRemainingDebt() {
    return remainingDebt;
  }

  public void setRemainingDebt(java.math.BigDecimal remainingDebt) {
    this.remainingDebt = remainingDebt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentScheduleElement paymentScheduleElement = (PaymentScheduleElement) o;
    return Objects.equals(this.number, paymentScheduleElement.number) &&
        Objects.equals(this.date, paymentScheduleElement.date) &&
        Objects.equals(this.totalPayment, paymentScheduleElement.totalPayment) &&
        Objects.equals(this.interestPayment, paymentScheduleElement.interestPayment) &&
        Objects.equals(this.debtPayment, paymentScheduleElement.debtPayment) &&
        Objects.equals(this.remainingDebt, paymentScheduleElement.remainingDebt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, date, totalPayment, interestPayment, debtPayment, remainingDebt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentScheduleElement {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    totalPayment: ").append(toIndentedString(totalPayment)).append("\n");
    sb.append("    interestPayment: ").append(toIndentedString(interestPayment)).append("\n");
    sb.append("    debtPayment: ").append(toIndentedString(debtPayment)).append("\n");
    sb.append("    remainingDebt: ").append(toIndentedString(remainingDebt)).append("\n");
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

