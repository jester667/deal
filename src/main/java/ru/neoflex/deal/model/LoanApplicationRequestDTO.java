package ru.neoflex.deal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Short application info.
 */
@ApiModel(description = "Short application info.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-15T13:51:35.942372300+03:00[Europe/Moscow]")@lombok.AllArgsConstructor
@lombok.Builder
@lombok.NoArgsConstructor

public class LoanApplicationRequestDTO   {
  @JsonProperty("amount")
  private java.math.BigDecimal amount;

  @JsonProperty("term")
  private Integer term;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("middleName")
  private String middleName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("birthdate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private java.time.LocalDate birthdate;

  @JsonProperty("passportSeries")
  private String passportSeries;

  @JsonProperty("passportNumber")
  private String passportNumber;

  public LoanApplicationRequestDTO amount(java.math.BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Requested loan amount.
   * minimum: 10000
   * @return amount
  */
  @ApiModelProperty(example = "1000000", required = true, value = "Requested loan amount.")
  @NotNull

  @Valid
@DecimalMin("10000") 
  public java.math.BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(java.math.BigDecimal amount) {
    this.amount = amount;
  }

  public LoanApplicationRequestDTO term(Integer term) {
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

  public LoanApplicationRequestDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Client's first name
   * @return firstName
  */
  @ApiModelProperty(example = "Ivan", required = true, value = "Client's first name")
  @NotNull

@Pattern(regexp = "[A-Za-z\\-]{2,30}") 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public LoanApplicationRequestDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Client's last name
   * @return lastName
  */
  @ApiModelProperty(example = "Ivanov", required = true, value = "Client's last name")
  @NotNull

@Pattern(regexp = "[A-Za-z\\-]{2,30}") 
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LoanApplicationRequestDTO middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Client's middle name (if present).
   * @return middleName
  */
  @ApiModelProperty(example = "Ivanonovich", value = "Client's middle name (if present).")

@Pattern(regexp = "[A-Za-z]{2,30}") 
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public LoanApplicationRequestDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Client's email.
   * @return email
  */
  @ApiModelProperty(example = "iivanov@email.ru", required = true, value = "Client's email.")
  @NotNull

@Pattern(regexp = "[A-Za-z]{2,50}") 
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LoanApplicationRequestDTO birthdate(java.time.LocalDate birthdate) {
    this.birthdate = birthdate;
    return this;
  }

  /**
   * Client's birthdate
   * @return birthdate
  */
  @ApiModelProperty(example = "Wed Nov 27 03:00:00 MSK 1996", value = "Client's birthdate")

  @Valid

  public java.time.LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(java.time.LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public LoanApplicationRequestDTO passportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
    return this;
  }

  /**
   * Client's passport series
   * @return passportSeries
  */
  @ApiModelProperty(example = "1234", required = true, value = "Client's passport series")
  @NotNull

@Pattern(regexp = "[0-9]{4}") 
  public String getPassportSeries() {
    return passportSeries;
  }

  public void setPassportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
  }

  public LoanApplicationRequestDTO passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * Client's passport series
   * @return passportNumber
  */
  @ApiModelProperty(example = "123456", required = true, value = "Client's passport series")
  @NotNull

@Pattern(regexp = "[0-9]{6}") 
  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanApplicationRequestDTO loanApplicationRequestDTO = (LoanApplicationRequestDTO) o;
    return Objects.equals(this.amount, loanApplicationRequestDTO.amount) &&
        Objects.equals(this.term, loanApplicationRequestDTO.term) &&
        Objects.equals(this.firstName, loanApplicationRequestDTO.firstName) &&
        Objects.equals(this.lastName, loanApplicationRequestDTO.lastName) &&
        Objects.equals(this.middleName, loanApplicationRequestDTO.middleName) &&
        Objects.equals(this.email, loanApplicationRequestDTO.email) &&
        Objects.equals(this.birthdate, loanApplicationRequestDTO.birthdate) &&
        Objects.equals(this.passportSeries, loanApplicationRequestDTO.passportSeries) &&
        Objects.equals(this.passportNumber, loanApplicationRequestDTO.passportNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, term, firstName, lastName, middleName, email, birthdate, passportSeries, passportNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanApplicationRequestDTO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
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

