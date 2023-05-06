package pro.sky.skyprospringmydz4;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class CalculatorService {

    public int plus (int a, int b){
        return a+b;
    }
    public int minus (int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }


}
