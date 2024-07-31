package al.utile.utile_common.utile;

import java.util.List;

public record AuthenticationResponse(
        String username,
        List<String> roles
) {
}
