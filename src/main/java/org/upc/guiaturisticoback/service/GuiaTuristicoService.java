package org.upc.guiaturisticoback.service;

import org.springframework.stereotype.Service;
import org.upc.guiaturisticoback.dto.ReporteDTO;
import org.upc.guiaturisticoback.repository.GuiaTuristicoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GuiaTuristicoService {

    private final GuiaTuristicoRepository guiaTuristicoRepository;

    public GuiaTuristicoService(GuiaTuristicoRepository guiaTuristicoRepository) {
        this.guiaTuristicoRepository = guiaTuristicoRepository;
    }

    public List<ReporteDTO> PromedioporGuiaTuristico()
    {
        List<Object[]> Resultado =guiaTuristicoRepository.PromedioporGuiaTuristico();

        return Resultado.stream()
                .map(fila -> {
                    String nombreguiaTuristico = (String) fila[0];
                    Double puntuacionpromedio = (Double) fila[1];

                    return new  ReporteDTO(nombreguiaTuristico, puntuacionpromedio);
                })
                .collect(Collectors.toList());

    }
}
