/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.dTale.api;

import com.dTale.model.Book;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "Book", description = "the Book API")
public interface BookApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /book : 
     * Remove specific book
     *
     * @param bookId id of specifc book (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteBook",
        summary = "",
        description = "Remove specific book",
        tags = { "Book" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/book"
    )
    default ResponseEntity<Void> deleteBook(
        @Parameter(name = "bookId", description = "id of specifc book", in = ParameterIn.QUERY) @Valid @RequestParam(value = "bookId", required = false) Object bookId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /book : Your GET endpoint
     * Get specific book
     *
     * @param bookId  (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getBook",
        summary = "Your GET endpoint",
        description = "Get specific book",
        tags = { "Book" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Book.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/book",
        produces = { "application/json" }
    )
    default ResponseEntity<Book> getBook(
        @Parameter(name = "bookId", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "bookId", required = false) Object bookId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"pageCount\" : \"\", \"author\" : \"\", \"isbn\" : \"\", \"id\" : \"\", \"title\" : \"\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}