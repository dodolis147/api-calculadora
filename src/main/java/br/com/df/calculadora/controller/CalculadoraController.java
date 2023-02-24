package br.com.df.calculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("soma")
    public String calculoSoma(double valor1, double valor2) {

        double soma = valor1 + valor2;
        return "Resultado = " + soma;
    }

    @GetMapping("multiplicacao")
    public String multiplicacao(double valor1, double valor2) {

        double multiplicacao = valor1 * valor2;
        return "Resultado = " + multiplicacao;
    }

    @GetMapping("divisao")
    public String divisao(double valor1, double valor2) {

        double divisao = valor1 / valor2;
        return "Resultado =" + divisao;
    }

    @GetMapping("subtracao")
    public String subtracao(double valor1, double valor2) {

        double subtracao = valor1 - valor2;
        return "Resultado = " + subtracao;

    }

}
