package com.devcalc;

import io.javalin.Javalin;

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

        // ✅ NOVO ENDPOINT: /sqrt?x=16
        app.get("/sqrt", ctx -> {
            double x = Double.parseDouble(ctx.queryParam("x"));
            double result = service.sqrt(x);
            ctx.json(new SqrtResponse("sqrt", x, result));
        });
    }

    // Classe interna para resposta em JSON
    public static class SqrtResponse {
        public String operation;
        public double value;
        public double result;

        public SqrtResponse(String operation, double value, double result) {
            this.operation = operation;
            this.value = value;
            this.result = result;
        }
    }
}
