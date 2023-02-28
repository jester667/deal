package ru.neoflex.deal.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Email Message object for sending email data to dossier service.
 */
@ApiModel(description = "Email Message object for sending email data to dossier service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-15T13:51:35.942372300+03:00[Europe/Moscow]")@lombok.AllArgsConstructor
@lombok.Builder
@lombok.NoArgsConstructor

public class EmailMessage   {
  @JsonProperty("address")
  private String address;

  /**
   * Email's theme
   */
  public enum ThemeEnum {
    FINISH_REGISTRATION("FINISH_REGISTRATION"),
    
    CREATE_DOCUMENT("CREATE_DOCUMENT"),
    
    SEND_DOCUMENT("SEND_DOCUMENT"),
    
    SEND_SES("SEND_SES"),
    
    CREDIT_ISSUED("CREDIT_ISSUED"),
    
    APPLICATION_DENIED("APPLICATION_DENIED");

    private String value;

    ThemeEnum(String value) {
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
    public static ThemeEnum fromValue(String value) {
      for (ThemeEnum b : ThemeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("theme")
  private ThemeEnum theme;

  @JsonProperty("applicationId")
  private Long applicationId;

  public EmailMessage address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Client's email address.
   * @return address
  */
  @ApiModelProperty(example = "email@email.com", value = "Client's email address.")

@Pattern(regexp = "[\\w\\.]*@\\w{2,10}\\.\\w{2,5}") 
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public EmailMessage theme(ThemeEnum theme) {
    this.theme = theme;
    return this;
  }

  /**
   * Email's theme
   * @return theme
  */
  @ApiModelProperty(example = "FINISH_REGISTRATION", value = "Email's theme")


  public ThemeEnum getTheme() {
    return theme;
  }

  public void setTheme(ThemeEnum theme) {
    this.theme = theme;
  }

  public EmailMessage applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Application Id.
   * @return applicationId
  */
  @ApiModelProperty(example = "1", value = "Application Id.")


  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailMessage emailMessage = (EmailMessage) o;
    return Objects.equals(this.address, emailMessage.address) &&
        Objects.equals(this.theme, emailMessage.theme) &&
        Objects.equals(this.applicationId, emailMessage.applicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, theme, applicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailMessage {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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

