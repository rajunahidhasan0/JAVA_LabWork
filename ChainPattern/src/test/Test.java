package test;
 import static org.junit.jupiter.api.Assertions.*;
 import org.junit.jupiter.api.Test;
 import chainPattern.*;
import main.Numbers;
 class Test {
 	//@Test
	void test() {
		Numbers request = new Numbers(4, 2, "add");
		Numbers request2 = new Numbers(4, 2, "subtract");
		Numbers request3 = new Numbers(4, 2, "multiply");
		AddNumbers addNumbers = new AddNumbers();
		SubtractNumbers subNumbers = new SubtractNumbers();
		MultiplyNumbers multiplyNumbers = new MultiplyNumbers();
		DivideNumbers divideNumbers = new DivideNumbers();
		addNumbers.setNextChain(subNumbers);
		subNumbers.setNextChain(multiplyNumbers);
		multiplyNumbers.setNextChain(divideNumbers);
		assertEquals(6, addNumbers.calculate(request), "4 + 2 = 6");
		assertEquals(2, addNumbers.calculate(request2), "4 - 2 = 6");
	}
 }