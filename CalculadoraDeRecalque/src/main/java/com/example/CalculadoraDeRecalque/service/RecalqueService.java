package com.example.CalculadoraDeRecalque.service;

import com.example.CalculadoraDeRecalque.model.RecalqueInput;
import com.example.CalculadoraDeRecalque.model.RecalqueOutput;
import org.springframework.stereotype.Service;


@Service
public class RecalqueService {

    public RecalqueOutput calcularVazao(RecalqueInput input) {
        RecalqueOutput output = new RecalqueOutput();

        // Fórmula: Q = V / t
        double vazao = input.getVolume() / input.getTempo();

        output.setVazao(vazao);
        output.setUnidade("m³/s"); // ou "L/s", depende do que você está usando

        return output;
    }
}

