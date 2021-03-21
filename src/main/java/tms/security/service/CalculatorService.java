package tms.security.service;

import org.springframework.stereotype.Service;
import tms.security.entity.Operation;
import tms.security.exception.DivByNullException;
import tms.security.exception.NotFoundOperationException;

@Service
public class CalculatorService {

    private double sum(String firstNum, String secondNum) {
        return Double.parseDouble(firstNum) + Double.parseDouble(secondNum);
    }

    private double diff(String firstNum, String secondNum) {
        return Double.parseDouble(firstNum) - Double.parseDouble(secondNum);
    }

    private double multi(String firstNum, String secondNum) {
        return Double.parseDouble(firstNum) * Double.parseDouble(secondNum);
    }

    private double div(String firstNum, String secondNum) {
        if (Double.parseDouble(secondNum) != 0) {
            return Double.parseDouble(firstNum) / Double.parseDouble(secondNum);
        } else {
            throw new DivByNullException("Div by 0");
        }
    }

    public Operation getResult(Operation operation) {
        switch (operation.getOperation()) {
            case "sum":
                operation.setResult(sum(operation.getFirstNum(), operation.getSecondNum()));
                return operation;
            case "dif":
                operation.setResult(diff(operation.getFirstNum(), operation.getSecondNum()));
                return operation;
            case "mul":
                operation.setResult(multi(operation.getFirstNum(), operation.getSecondNum()));
                return operation;
            case "div":
                operation.setResult(div(operation.getFirstNum(), operation.getSecondNum()));
                return operation;
            default:
                throw new NotFoundOperationException("Operation is not found");
        }
    }
}
