package org.upc.guiaturisticoback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReporteDTO {
    private String nombreguiaturistico;
    private Double puntuacionpromedio;
}
