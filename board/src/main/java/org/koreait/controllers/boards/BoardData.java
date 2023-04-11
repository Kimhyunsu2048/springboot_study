package org.koreait.controllers.boards;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class BoardData {
    @NotBlank
    private String bId;
    @NotBlank
    private String poster;
    @NotBlank
    private String subject;
    @NotBlank
    private String content;
}
