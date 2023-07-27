package ke.co.safaricom;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/home.hbs", (req, res)-> {
            Map<String, String> payload = new HashMap<>();
            return new ModelAndView(payload, "home.hbs.html");
        }, new HandlebarsTemplateEngine());

        get("/login", (req, res)-> {
            Map<String, String> payload = new HashMap<>();
            return new ModelAndView(payload, "hero-form.hbs.html");
        }, new HandlebarsTemplateEngine());

        get("/hero", (req, res)-> {
            Map<String, String> payload = new HashMap<>();
            return new ModelAndView(payload, "hero.hbs.html");
        }, new HandlebarsTemplateEngine());

        get("/squad", (req, res)-> {
            Map<String, String> payload = new HashMap<>();
            return new ModelAndView(payload, "squad.hbs.html");
        }, new HandlebarsTemplateEngine());

        get("/login", (req, res)-> {
            Map<String, String> payload = new HashMap<>();
            return new ModelAndView(payload, "squad-form.hbs.html");
        }, new HandlebarsTemplateEngine());

        get("/squad", (req, res)-> {
            Map<String, String> payload = new HashMap<>();
            return new ModelAndView(payload, "success.hbs.html");
        }, new HandlebarsTemplateEngine());

        post("/hero", (req, res)->{
            String name = req.queryParams("name");
            Integer age = Integer.parseInt(req.queryParams("age"));
            String power = req.queryParams("power");
            String weakness = req.queryParams("weakness");
            Map<String, String> payload = new HashMap<>();
            return new ModelAndView(payload,"success.hbs.html");
        }, new HandlebarsTemplateEngine());

        post("/squad", (req, res)->{
            String name = req.queryParams("name");
            Integer age = Integer.parseInt(req.queryParams("age"));
            String power = req.queryParams("power");
            String weakness = req.queryParams("weakness");
            Map<String, String> payload = new HashMap<>();
            return new ModelAndView(payload,"success.hbs.html");
        }, new HandlebarsTemplateEngine());


    }

}