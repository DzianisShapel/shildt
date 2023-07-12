package baeldung.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class pojo {
    private String clientId;
    private String activityType;
    private String date;
    private String account;
}
