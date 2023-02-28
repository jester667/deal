package ru.neoflex.deal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Client&#39;s passport information.
 */
@ApiModel(description = "Client's passport information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-15T13:51:35.942372300+03:00[Europe/Moscow]")@lombok.AllArgsConstructor
@lombok.Builder
@lombok.NoArgsConstructor

public class PassportInfo   {
  @JsonProperty("series")
  private String series;

  @JsonProperty("number")
  private String number;

  @JsonProperty("issueDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private java.time.LocalDate issueDate;

  @JsonProperty("issueBranch")
  private String issueBranch;

  public PassportInfo series(String series) {
    this.series = series;
    return this;
  }

  /**
   * Passport series.
   * @return series
  */
  @ApiModelProperty(example = "1234", value = "Passport series.")

@Pattern(regexp = "^([0-9]{4})$") 
  public String getSeries() {
    return series;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public PassportInfo number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Password number.
   * @return number
  */
  @ApiModelProperty(example = "123456", value = "Password number.")

@Pattern(regexp = "^([0-9]{6})$") 
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PassportInfo issueDate(java.time.LocalDate issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Password issue date.
   * @return issueDate
  */
  @ApiModelProperty(example = "Sun Nov 27 03:00:00 MSK 2016", value = "Password issue date.")

  @Valid

  public java.time.LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(java.time.LocalDate issueDate) {
    this.issueDate = issueDate;
  }

  public PassportInfo issueBranch(String issueBranch) {
    this.issueBranch = issueBranch;
    return this;
  }

  /**
   * Passport issue branch.
   * @return issueBranch
  */
  @ApiModelProperty(example = "123-456", value = "Passport issue branch.")


  public String getIssueBranch() {
    return issueBranch;
  }

  public void setIssueBranch(String issueBranch) {
    this.issueBranch = issueBranch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassportInfo passportInfo = (PassportInfo) o;
    return Objects.equals(this.series, passportInfo.series) &&
        Objects.equals(this.number, passportInfo.number) &&
        Objects.equals(this.issueDate, passportInfo.issueDate) &&
        Objects.equals(this.issueBranch, passportInfo.issueBranch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(series, number, issueDate, issueBranch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassportInfo {\n");
    
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    issueBranch: ").append(toIndentedString(issueBranch)).append("\n");
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

