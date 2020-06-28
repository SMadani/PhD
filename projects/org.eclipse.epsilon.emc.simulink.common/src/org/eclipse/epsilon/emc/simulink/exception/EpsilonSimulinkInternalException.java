/*********************************************************************
 * Copyright (c) 2008 The University of York.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
**********************************************************************/
package org.eclipse.epsilon.emc.simulink.exception;

public class EpsilonSimulinkInternalException extends RuntimeException {

	private static final long serialVersionUID = -2448556001774594763L;

	public EpsilonSimulinkInternalException(Throwable e) {
		super(e);
	}
}
