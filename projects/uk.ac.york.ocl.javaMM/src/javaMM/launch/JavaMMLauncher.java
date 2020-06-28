/*********************************************************************
 * Copyright (c) 2018 The University of York.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
**********************************************************************/
package javaMM.launch;

import javaMM.JavaMMPackage;
import javaMM.util.JavaMMValidator;
import uk.ac.york.ocl.standalone.*;

/**
 * Entry point for evaluating compiled version of java_simple.ocl
 *
 * @author Sina Madani
 */
public class JavaMMLauncher {
	public static void main(String... args) throws Exception {
		StandaloneOclConfigParser.newCompiledInstance(
			JavaMMPackage.eINSTANCE, JavaMMValidator.INSTANCE, args
		).run();
	}
}
