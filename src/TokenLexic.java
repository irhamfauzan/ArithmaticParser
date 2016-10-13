
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irhamfauzan
 */
public class TokenLexic {
    
    public String Token;
    
    public String Token(String token) {
        if (token == "variable") {
            return "1";
        } else if (token == "real") {
            return "2";
        } else if (token == "digit") {
            return "3";
        } else if (token == "(") {
            return "4";
        } else if (token == ")") {
            return "5";
        } else if (token == "+") {
            return "6";
        } else if (token == "-") {
            return "7";
        } else if (token == "*") {
            return "8";
        } else if (token == "/") {
            return "9";
        }
        return token;
    }
    

}
