package me.tomsdevsn.hetznercloud.objects.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import me.tomsdevsn.hetznercloud.objects.general.Action;

@Data
public class EnableRescueResponse {

    @JsonProperty("root_password")
    private String rootPassword;
    private Action action;
}
