package al.utile.utile_common.utile;


import java.util.List;

public record ProfessionalDto(
        Long id,
        String description,
        Integer travelDistance,
        List<ProfessionDto> professions,
        Double fee
) {
}
