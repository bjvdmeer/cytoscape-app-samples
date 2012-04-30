package org.cytoscape.sample.internal;

import org.cytoscape.work.Tunable;
import org.cytoscape.work.TunableValidator;

public class MyLayoutContext  implements TunableValidator {

	@Tunable(description="Shift X Range")
	public int XRange = 100; // Default value
	@Tunable(description="Shift Y Range")
	public int YRange= 1000;// Default value

	public ValidationState getValidationState(final Appendable errMsg) {
		if (XRange <= 100){
			return ValidationState.OK;			
		}
		try {
			errMsg.append("Xrange must not exceed 100!");
		} catch (final Exception e) {
			/* Intentionally ignored! */
		}
		return ValidationState.INVALID;
	}
}
