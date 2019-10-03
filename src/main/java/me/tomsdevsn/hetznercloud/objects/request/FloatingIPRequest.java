package me.tomsdevsn.hetznercloud.objects.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FloatingIPRequest {

    private String type;
    @JsonProperty("home_location")
    private String homeLocation;
    private Long server;
    private String description;
    private String name;
    @Singular
    private Map<String, String> labels;

    @Getter
    @AllArgsConstructor
    public enum Type {
        IPV4("ipv4"),
        IPV6("ipv6");

        private String type;

        @Override
        public String toString() {
            return type;
        }
    }
}
