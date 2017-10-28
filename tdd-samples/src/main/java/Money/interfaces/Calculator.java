package Money.interfaces;

import java.math.BigDecimal;


/**
 *  The <code>Calculator</code> class provides a set of 
 *  binary arithmetic operations for working with BigDecimals
 */
public interface Calculator {
	
	
	/**
	 * Adds two BigDecimals together
	 * 
	 * @param arg1
	 * @param arg2
	 * @return arg1 + arg2 as a BigDecimal
	 */
	BigDecimal add(BigDecimal arg1, BigDecimal arg2);

}
