package com.example.CalculadoraDeRecalque.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class RecalqueOutput {

        private Double perdaCarga;          // Pa ou mca
        private Double alturaManometrica;   // metros
        private Double potenciaUtil;        // kW
        private Double npshDisponivel;      // metros
}
