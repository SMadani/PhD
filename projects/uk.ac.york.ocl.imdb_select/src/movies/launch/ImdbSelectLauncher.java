/*********************************************************************
 * Copyright (c) 2019 The University of York.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
**********************************************************************/
package movies.launch;

import movies.MoviesPackage;
import movies.Person;
import uk.ac.york.ocl.standalone.*;

/**
 * Entry point for evaluating compiled version of imdb_select.ocl
 *
 * @author Sina Madani
 */
public class ImdbSelectLauncher {

	public static void main(String... args) throws Exception {
		new StandaloneOcl(StandaloneOclConfigParser
			.compiledInstanceBuilder(MoviesPackage.eINSTANCE, args)
		) {
			@Override
			protected java.math.BigInteger executeImpl() {
				Person element = (Person) getModelElementByType(MoviesPackage.eINSTANCE.getEClassifier("Person"));
				if (element == null) {
					throw new IllegalStateException("Could not find Person in "+modelUri);
				}
				return element.QUERY();
			}
		}
		.run();
	}

}
