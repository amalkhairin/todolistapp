package enigma.to_do_list.utils.specification;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ErrorResponse<T> {
    private HttpStatus status;
    private List<String> message = new ArrayList<>();
}
