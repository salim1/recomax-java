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
import io.swagger.client.model.Item;

/**
 * RecomResultItem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-10T19:21:14.497+01:00")
public class RecomResultItem {
  @SerializedName("item")
  private Item item = null;

  @SerializedName("rank")
  private Float rank = null;

  @SerializedName("recommendationId")
  private String recommendationId = null;

  public RecomResultItem item(Item item) {
    this.item = item;
    return this;
  }

   /**
   * item
   * @return item
  **/
  @ApiModelProperty(example = "null", required = true, value = "item")
  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public RecomResultItem rank(Float rank) {
    this.rank = rank;
    return this;
  }

   /**
   * rank
   * @return rank
  **/
  @ApiModelProperty(example = "null", required = true, value = "rank")
  public Float getRank() {
    return rank;
  }

  public void setRank(Float rank) {
    this.rank = rank;
  }

  public RecomResultItem recommendationId(String recommendationId) {
    this.recommendationId = recommendationId;
    return this;
  }

   /**
   * recommendationId
   * @return recommendationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "recommendationId")
  public String getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(String recommendationId) {
    this.recommendationId = recommendationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecomResultItem recomResultItem = (RecomResultItem) o;
    return Objects.equals(this.item, recomResultItem.item) &&
        Objects.equals(this.rank, recomResultItem.rank) &&
        Objects.equals(this.recommendationId, recomResultItem.recommendationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, rank, recommendationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecomResultItem {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
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

