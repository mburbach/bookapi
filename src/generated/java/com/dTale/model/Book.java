package com.dTale.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Book
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Book {

  private JsonNullable<Object> id = JsonNullable.undefined();

  private JsonNullable<Object> title = JsonNullable.undefined();

  private JsonNullable<Object> pageCount = JsonNullable.undefined();

  private JsonNullable<Object> isbn = JsonNullable.undefined();

  private JsonNullable<Object> author = JsonNullable.undefined();

  public Book id(Object id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public JsonNullable<Object> getId() {
    return id;
  }

  public void setId(JsonNullable<Object> id) {
    this.id = id;
  }

  public Book title(Object title) {
    this.title = JsonNullable.of(title);
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public JsonNullable<Object> getTitle() {
    return title;
  }

  public void setTitle(JsonNullable<Object> title) {
    this.title = title;
  }

  public Book pageCount(Object pageCount) {
    this.pageCount = JsonNullable.of(pageCount);
    return this;
  }

  /**
   * Get pageCount
   * @return pageCount
  */
  
  @Schema(name = "pageCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageCount")
  public JsonNullable<Object> getPageCount() {
    return pageCount;
  }

  public void setPageCount(JsonNullable<Object> pageCount) {
    this.pageCount = pageCount;
  }

  public Book isbn(Object isbn) {
    this.isbn = JsonNullable.of(isbn);
    return this;
  }

  /**
   * Get isbn
   * @return isbn
  */
  
  @Schema(name = "isbn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isbn")
  public JsonNullable<Object> getIsbn() {
    return isbn;
  }

  public void setIsbn(JsonNullable<Object> isbn) {
    this.isbn = isbn;
  }

  public Book author(Object author) {
    this.author = JsonNullable.of(author);
    return this;
  }

  /**
   * Get author
   * @return author
  */
  
  @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public JsonNullable<Object> getAuthor() {
    return author;
  }

  public void setAuthor(JsonNullable<Object> author) {
    this.author = author;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return equalsNullable(this.id, book.id) &&
        equalsNullable(this.title, book.title) &&
        equalsNullable(this.pageCount, book.pageCount) &&
        equalsNullable(this.isbn, book.isbn) &&
        equalsNullable(this.author, book.author);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(title), hashCodeNullable(pageCount), hashCodeNullable(isbn), hashCodeNullable(author));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
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

