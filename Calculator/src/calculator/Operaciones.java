/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author eliseo
 */
public class Operaciones {
    
    private static boolean isNumeric(String cadena){
	try {
		Double.parseDouble(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    
    public String Sum(String num1, String num2){
        double result = 0;
        if(isNumeric(num1)){
            if(isNumeric(num2)){
                result = Double.parseDouble(num1) + Double.parseDouble(num2);
                String resp = "The result is: "+ Double.toString(result);
                return resp;
            }
            String resp = "The number 2 is not valid";
            return resp;
        }
        String resp = "The number 1 is not valid";
        return resp;
    }

    public String subtraction(String num1, String num2){
        double result = 0;
        if(isNumeric(num1)){
            if(isNumeric(num2)){
                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                String resp = "The result is: "+ Double.toString(result);
                return resp;
            }
            String resp = "The number 2 is not valid";
            return resp;
        }
        String resp = "The number 1 is not valid";
        return resp;
    }

    public String multiplaction(String num1, String num2){
        double result = 0;
        if(isNumeric(num1)){
            if(isNumeric(num2)){
                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                String resp = "The result is: "+ Double.toString(result);
                return resp;
            }
            String resp = "The number 2 is not valid";
            return resp;
        }
        String resp = "The number 1 is not valid";
        return resp;
    }
    
    public String division(String num1, String num2){
        double result = 0;
        if(isNumeric(num1)){
            if(isNumeric(num2)){
                if(Double.parseDouble(num2)==0){
                    String resp = "The result is indeterminated";
                    return resp;
                }else{
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    String resp = "The result is: "+ Double.toString(result);
                    return resp;
                }
            }
            String resp = "The number 2 is not valid";
            return resp;
        }
        String resp = "The number 1 is not valid";
        return resp;
    }
}