package com.example.CalculadoraDeRecalque.model;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecalqueInput {

    @NotNull(message = "Vazão não pode ser nula")
    @Min(value = 0, message = "Vazão deve ser maior que 0")
    private Double vazao;

    @NotNull(message = "Comprimento do tubo não pode ser nulo")
    @Min(value = 0, message = "Comprimento do tubo deve ser maior que 0")
    private Double comprimentoTubo;

    @NotNull(message = "Diâmetro do tubo não pode ser nulo")
    @Min(value = 0, message = "Diâmetro do tubo deve ser maior que 0")
    private Double diametroTubo;

    @NotNull(message = "Rugosidade não pode ser nula")
    @Min(value = 0, message = "Rugosidade deve ser maior que 0")
    private Double rugosidade;

    @NotNull(message = "Altura geométrica não pode ser nula")
    @Min(value = 0, message = "Altura geométrica deve ser maior que 0")
    private Double alturaGeometrica;

    private double volume;
    private double tempo;


    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getTempo() {
        return tempo;
    }
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }


}
