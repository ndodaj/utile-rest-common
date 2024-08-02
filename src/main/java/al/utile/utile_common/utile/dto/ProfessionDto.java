package al.utile.utile_common.utile.dto;

public record ProfessionDto(
        Long id,
        String name,
        String category,
        StatusEnum status) {
}
