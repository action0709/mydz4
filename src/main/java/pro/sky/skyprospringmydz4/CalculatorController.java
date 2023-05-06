package pro.sky.skyprospringmydz4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping("/calculator")
    public String calculator(){
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/calculator/plus")
    public String plus(@RequestParam("num1") int a,@RequestParam("num2") int b){
        int result= calculatorService.plus(a,b);
        return String.format("%s+%s=%s", a, b, result);
    }
    @GetMapping(path="/calculator/minus")
    public String minus(@RequestParam("num1") int a,@RequestParam("num2") int b){
        int result= calculatorService.minus(a,b);
        return String.format("%s-%s=%s", a, b, result);
    }
    @GetMapping(path="/calculator/multiply")
    public String multiply(@RequestParam("num1") int a,@RequestParam("num2") int b){
        int result= calculatorService.multiply(a,b);
        return String.format("%s*%s=%s", a, b, result);
    }
    @GetMapping(path="/calculator/divide")
    public String divide(@RequestParam("num1") int a,@RequestParam("num2") int b){
        if(b==0){
            return "На ноль делить нельзя.";
        }
        int result= calculatorService.divide(a,b);
        return String.format("%s/%s=%s", a, b, result);
    }


}
