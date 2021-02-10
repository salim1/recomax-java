/*
 * Recomax REST API
 * Recomax REST API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@recomax.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MediaType
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-10T19:21:14.497+01:00")
public class MediaType {
  @SerializedName("parameters")
  private Map<String, String> parameters = null;

  @SerializedName("subtype")
  private String subtype = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("wildcardSubtype")
  private Boolean wildcardSubtype = null;

  @SerializedName("wildcardType")
  private Boolean wildcardType = null;

  public MediaType parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public MediaType putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String, String>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  public MediaType subtype(String subtype) {
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubtype() {
    return subtype;
  }

  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }

  public MediaType type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MediaType wildcardSubtype(Boolean wildcardSubtype) {
    this.wildcardSubtype = wildcardSubtype;
    return this;
  }

   /**
   * Get wildcardSubtype
   * @return wildcardSubtype
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean isgetWildcardSubtype() {
    return wildcardSubtype;
  }

  public void setWildcardSubtype(Boolean wildcardSubtype) {
    this.wildcardSubtype = wildcardSubtype;
  }

  public MediaType wildcardType(Boolean wildcardType) {
    this.wildcardType = wildcardType;
    return this;
  }

   /**
   * Get wildcardType
   * @return wildcardType
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean isgetWildcardType() {
    return wildcardType;
  }

  public void setWildcardType(Boolean wildcardType) {
    this.wildcardType = wildcardType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaType mediaType = (MediaType) o;
    return Objects.equals(this.parameters, mediaType.parameters) &&
        Objects.equals(this.subtype, mediaType.subtype) &&
        Objects.equals(this.type, mediaType.type) &&
        Objects.equals(this.wildcardSubtype, mediaType.wildcardSubtype) &&
        Objects.equals(this.wildcardType, mediaType.wildcardType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, subtype, type, wildcardSubtype, wildcardType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaType {\n");
    
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    wildcardSubtype: ").append(toIndentedString(wildcardSubtype)).append("\n");
    sb.append("    wildcardType: ").append(toIndentedString(wildcardType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

