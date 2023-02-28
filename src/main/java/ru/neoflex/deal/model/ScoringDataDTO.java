package ru.neoflex.deal.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Full scoring data.
 */
@ApiModel(description = "Full scoring data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-15T13:51:35.942372300+03:00[Europe/Moscow]")@lombok.AllArgsConstructor
@lombok.Builder
@lombok.NoArgsConstructor

public class ScoringDataDTO   {
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

  /**
   * Client's gender.
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    NON_BINARY("NON_BINARY");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender;

  @JsonProperty("birthdate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private java.time.LocalDate birthdate;

  @JsonProperty("passportSeries")
  private String passportSeries;

  @JsonProperty("passportNumber")
  private String passportNumber;

  @JsonProperty("passportIssueDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private java.time.LocalDate passportIssueDate;

  @JsonProperty("passportIssueBranch")
  private String passportIssueBranch;

  /**
   * Client's marital status.
   */
  public enum MaritalStatusEnum {
    MARRIED("MARRIED"),
    
    DIVORCED("DIVORCED"),
    
    SINGLE("SINGLE"),
    
    WIDOW_WIDOWER("WIDOW_WIDOWER");

    private String value;

    MaritalStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MaritalStatusEnum fromValue(String value) {
      for (MaritalStatusEnum b : MaritalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("maritalStatus")
  private MaritalStatusEnum maritalStatus;

  @JsonProperty("dependentAmount")
  private Integer dependentAmount;

  @JsonProperty("employment")
  private EmploymentDTO employment;

  @JsonProperty("account")
  private String account;

  @JsonProperty("isInsuranceEnabled")
  private Boolean isInsuranceEnabled;

  @JsonProperty("isSalaryClient")
  private Boolean isSalaryClient;

  public ScoringDataDTO amount(java.math.BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Requested loan amount.
   * minimum: 10000
   * @return amount
  */
  @ApiModelProperty(example = "1000000", value = "Requested loan amount.")

  @Valid
@DecimalMin("10000") 
  public java.math.BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(java.math.BigDecimal amount) {
    this.amount = amount;
  }

  public ScoringDataDTO term(Integer term) {
    this.term = term;
    return this;
  }

  /**
   * Requested loan term (months).
   * minimum: 6
   * @return term
  */
  @ApiModelProperty(example = "24", value = "Requested loan term (months).")

@Min(6) 
  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    this.term = term;
  }

  public ScoringDataDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Client's first name
   * @return firstName
  */
  @ApiModelProperty(example = "Ivan", value = "Client's first name")

@Pattern(regexp = "[A-Za-z\\-]{2,30}") 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ScoringDataDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Client's last name
   * @return lastName
  */
  @ApiModelProperty(example = "Ivanov", value = "Client's last name")

@Pattern(regexp = "[A-Za-z\\-]{2,30}") 
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ScoringDataDTO middleName(String middleName) {
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

  public ScoringDataDTO gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Client's gender.
   * @return gender
  */
  @ApiModelProperty(example = "MALE", value = "Client's gender.")


  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public ScoringDataDTO birthdate(java.time.LocalDate birthdate) {
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

  public ScoringDataDTO passportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
    return this;
  }

  /**
   * Client's passport series
   * @return passportSeries
  */
  @ApiModelProperty(example = "1234", value = "Client's passport series")

@Pattern(regexp = "[0-9]{4}") 
  public String getPassportSeries() {
    return passportSeries;
  }

  public void setPassportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
  }

  public ScoringDataDTO passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * Client's passport series
   * @return passportNumber
  */
  @ApiModelProperty(example = "123456", value = "Client's passport series")

@Pattern(regexp = "[0-9]{6}") 
  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public ScoringDataDTO passportIssueDate(java.time.LocalDate passportIssueDate) {
    this.passportIssueDate = passportIssueDate;
    return this;
  }

  /**
   * Client's passport issue date.
   * @return passportIssueDate
  */
  @ApiModelProperty(example = "Sun Nov 27 03:00:00 MSK 2016", value = "Client's passport issue date.")

  @Valid

  public java.time.LocalDate getPassportIssueDate() {
    return passportIssueDate;
  }

  public void setPassportIssueDate(java.time.LocalDate passportIssueDate) {
    this.passportIssueDate = passportIssueDate;
  }

  public ScoringDataDTO passportIssueBranch(String passportIssueBranch) {
    this.passportIssueBranch = passportIssueBranch;
    return this;
  }

  /**
   * Client's passport issue branch.
   * @return passportIssueBranch
  */
  @ApiModelProperty(example = "123-456", value = "Client's passport issue branch.")


  public String getPassportIssueBranch() {
    return passportIssueBranch;
  }

  public void setPassportIssueBranch(String passportIssueBranch) {
    this.passportIssueBranch = passportIssueBranch;
  }

  public ScoringDataDTO maritalStatus(MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Client's marital status.
   * @return maritalStatus
  */
  @ApiModelProperty(example = "SINGLE", value = "Client's marital status.")


  public MaritalStatusEnum getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public ScoringDataDTO dependentAmount(Integer dependentAmount) {
    this.dependentAmount = dependentAmount;
    return this;
  }

  /**
   * Client's dependents amount.
   * @return dependentAmount
  */
  @ApiModelProperty(example = "1", value = "Client's dependents amount.")


  public Integer getDependentAmount() {
    return dependentAmount;
  }

  public void setDependentAmount(Integer dependentAmount) {
    this.dependentAmount = dependentAmount;
  }

  public ScoringDataDTO employment(EmploymentDTO employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
  */
  @ApiModelProperty(value = "")

  @Valid

  public EmploymentDTO getEmployment() {
    return employment;
  }

  public void setEmployment(EmploymentDTO employment) {
    this.employment = employment;
  }

  public ScoringDataDTO account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Client's master account.
   * @return account
  */
  @ApiModelProperty(example = "11223344556677889900", value = "Client's master account.")

@Pattern(regexp = "[0-9]{20}") 
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public ScoringDataDTO isInsuranceEnabled(Boolean isInsuranceEnabled) {
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

  public ScoringDataDTO isSalaryClient(Boolean isSalaryClient) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoringDataDTO scoringDataDTO = (ScoringDataDTO) o;
    return Objects.equals(this.amount, scoringDataDTO.amount) &&
        Objects.equals(this.term, scoringDataDTO.term) &&
        Objects.equals(this.firstName, scoringDataDTO.firstName) &&
        Objects.equals(this.lastName, scoringDataDTO.lastName) &&
        Objects.equals(this.middleName, scoringDataDTO.middleName) &&
        Objects.equals(this.gender, scoringDataDTO.gender) &&
        Objects.equals(this.birthdate, scoringDataDTO.birthdate) &&
        Objects.equals(this.passportSeries, scoringDataDTO.passportSeries) &&
        Objects.equals(this.passportNumber, scoringDataDTO.passportNumber) &&
        Objects.equals(this.passportIssueDate, scoringDataDTO.passportIssueDate) &&
        Objects.equals(this.passportIssueBranch, scoringDataDTO.passportIssueBranch) &&
        Objects.equals(this.maritalStatus, scoringDataDTO.maritalStatus) &&
        Objects.equals(this.dependentAmount, scoringDataDTO.dependentAmount) &&
        Objects.equals(this.employment, scoringDataDTO.employment) &&
        Objects.equals(this.account, scoringDataDTO.account) &&
        Objects.equals(this.isInsuranceEnabled, scoringDataDTO.isInsuranceEnabled) &&
        Objects.equals(this.isSalaryClient, scoringDataDTO.isSalaryClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, term, firstName, lastName, middleName, gender, birthdate, passportSeries, passportNumber, passportIssueDate, passportIssueBranch, maritalStatus, dependentAmount, employment, account, isInsuranceEnabled, isSalaryClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoringDataDTO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    passportIssueDate: ").append(toIndentedString(passportIssueDate)).append("\n");
    sb.append("    passportIssueBranch: ").append(toIndentedString(passportIssueBranch)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    dependentAmount: ").append(toIndentedString(dependentAmount)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

