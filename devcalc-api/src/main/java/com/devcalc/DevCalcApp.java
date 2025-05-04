package com.devcalc;

import io.javalin.Javalin;

// Teste manual do CI/CD

public class DevCalcApp {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        CalculatorService service = new CalculatorService();

        app.get("/add", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            ctx.result(String.valueOf(service.add(a, b)));
        });

        app.get("/subtract", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            ctx.result(String.valueOf(service.subtract(a, b)));
        });

        app.get("/multiply", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            ctx.result(String.valueOf(service.multiply(a, b)));
        });

        app.get("/divide", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            ctx.result(String.valueOf(service.divide(a, b)));
        });
    }
}
