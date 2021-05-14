package spring7;
import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
  
public class Hello {  
public static void main(String[] args) {
	
ExpressionParser parser = new SpelExpressionParser();  
  
Expression exp = parser.parseExpression("'Hello SPEL'");  
String message = (String) exp.getValue();  
System.out.println(message);  
 
}  
} 

