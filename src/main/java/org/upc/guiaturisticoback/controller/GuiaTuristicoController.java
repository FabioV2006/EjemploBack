package org.upc.guiaturisticoback.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.upc.guiaturisticoback.dto.ReporteDTO;
import org.upc.guiaturisticoback.service.GuiaTuristicoService;

import java.util.List;

@RestController
@RequestMapping("/vilca")
@CrossOrigin("http://localhost:4200")
public class GuiaTuristicoController {
    private final GuiaTuristicoService guiaTuristicoService;

    public GuiaTuristicoController(GuiaTuristicoService guiaTuristicoService) {
        this.guiaTuristicoService = guiaTuristicoService;
    }

    @RequestMapping("/lista")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMINISTRADOR ', 'ROLE_JEFE')")
    public List<ReporteDTO> PromedioporGuiaTuristico()
    {
        return guiaTuristicoService.PromedioporGuiaTuristico();
    }

}
