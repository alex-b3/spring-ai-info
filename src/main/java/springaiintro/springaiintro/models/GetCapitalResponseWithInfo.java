package springaiintro.springaiintro.models;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalResponseWithInfo(@JsonPropertyDescription("This is the city name") String Capital,
                                         @JsonPropertyDescription("This is the city population") String Population,
                                         @JsonPropertyDescription("This is the city region") String Region,
                                         @JsonPropertyDescription("This is the city language") String Language,
                                         @JsonPropertyDescription("This is the city currency") String Currency) {
}
