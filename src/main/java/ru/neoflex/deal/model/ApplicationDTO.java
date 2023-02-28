package ru.neoflex.deal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * All application info.
 */
@ApiModel(description = "All application info.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-15T13:51:35.942372300+03:00[Europe/Moscow]")@lombok.AllArgsConstructor
@lombok.Builder
@lombok.NoArgsConstructor

public class ApplicationDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("client")
  private ClientDTO client;

  @JsonProperty("credit")
  private CreditDTO credit;

  @JsonProperty("status")
  private ApplicationStatus status;

  @JsonProperty("creationDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime creationDate;

  @JsonProperty("signDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime signDate;

  @JsonProperty("sesCode")
  private String sesCode;

  @JsonProperty("statusHistory")
  @Valid
  private List<ApplicationStatusHistoryDTO> statusHistory = new ArrayList<ApplicationStatusHistoryDTO>();

  public ApplicationDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Application id.
   * @return id
  */
  @ApiModelProperty(example = "123", required = true, value = "Application id.")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ApplicationDTO client(ClientDTO client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ClientDTO getClient() {
    return client;
  }

  public void setClient(ClientDTO client) {
    this.client = client;
  }

  public ApplicationDTO credit(CreditDTO credit) {
    this.credit = credit;
    return this;
  }

  /**
   * Get credit
   * @return credit
  */
  @ApiModelProperty(value = "")

  @Valid

  public CreditDTO getCredit() {
    return credit;
  }

  public void setCredit(CreditDTO credit) {
    this.credit = credit;
  }

  public ApplicationDTO status(ApplicationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ApplicationStatus getStatus() {
    return status;
  }

  public void setStatus(ApplicationStatus status) {
    this.status = status;
  }

  public ApplicationDTO creationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Application creation date
   * @return creationDate
  */
  @ApiModelProperty(required = true, value = "Application creation date")
  @NotNull

  @Valid

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ApplicationDTO signDate(LocalDateTime signDate) {
    this.signDate = signDate;
    return this;
  }

  /**
   * Application sign date
   * @return signDate
  */
  @ApiModelProperty(value = "Application sign date")

  @Valid

  public LocalDateTime getSignDate() {
    return signDate;
  }

  public void setSignDate(LocalDateTime signDate) {
    this.signDate = signDate;
  }

  public ApplicationDTO sesCode(String sesCode) {
    this.sesCode = sesCode;
    return this;
  }

  /**
   * Application Simple Electric Sign code
   * @return sesCode
  */
  @ApiModelProperty(example = "1234", value = "Application Simple Electric Sign code")


  public String getSesCode() {
    return sesCode;
  }

  public void setSesCode(String sesCode) {
    this.sesCode = sesCode;
  }

  public ApplicationDTO statusHistory(List<ApplicationStatusHistoryDTO> statusHistory) {
    this.statusHistory = statusHistory;
    return this;
  }

  public ApplicationDTO addStatusHistoryItem(ApplicationStatusHistoryDTO statusHistoryItem) {
    this.statusHistory.add(statusHistoryItem);
    return this;
  }

  /**
   * Get statusHistory
   * @return statusHistory
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<ApplicationStatusHistoryDTO> getStatusHistory() {
    return statusHistory;
  }

  public void setStatusHistory(List<ApplicationStatusHistoryDTO> statusHistory) {
    this.statusHistory = statusHistory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationDTO applicationDTO = (ApplicationDTO) o;
    return Objects.equals(this.id, applicationDTO.id) &&
        Objects.equals(this.client, applicationDTO.client) &&
        Objects.equals(this.credit, applicationDTO.credit) &&
        Objects.equals(this.status, applicationDTO.status) &&
        Objects.equals(this.creationDate, applicationDTO.creationDate) &&
        Objects.equals(this.signDate, applicationDTO.signDate) &&
        Objects.equals(this.sesCode, applicationDTO.sesCode) &&
        Objects.equals(this.statusHistory, applicationDTO.statusHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, client, credit, status, creationDate, signDate, sesCode, statusHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
    sb.append("    sesCode: ").append(toIndentedString(sesCode)).append("\n");
    sb.append("    statusHistory: ").append(toIndentedString(statusHistory)).append("\n");
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

