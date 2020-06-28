/*********************************************************************
 * Copyright (c) 2019 The University of York.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
**********************************************************************/
package org.eclipse.epsilon.eol.engine.test.acceptance;

import static org.junit.Assert.*;
import org.eclipse.epsilon.eol.*;
import org.eclipse.epsilon.eol.exceptions.EolNullPointerException;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.EolUndefinedVariableException;
import org.junit.Test;
import org.junit.Before;

/**
 * Tests for exceptions, which can't be handled by EUnit.
 *
 * @author Sina Madani
 * @since 1.6
 */
public class ExceptionTests {

	IEolModule module;
	
	@Before
	public void setUp() throws Exception {
		module = new EolModule();
	}
	
	static int countLinesInEOLStackTrace(EolRuntimeException eox) {
		assertNotNull(eox.getAst());
		String[] lines = eox.getMessage().split("\\n\\t");
		return lines.length;
	}
	
	@Test
	public void testUndefined() throws Exception {
		module.parse("uVar.npe();");
		try {
			module.execute();
			fail("Expected "+EolUndefinedVariableException.class.getName());
		}
		catch (EolUndefinedVariableException npe) {
			return;
		}
	}
	
	@Test
	public void testStackTraceIsPreserved() throws Exception {
		module.parse(
			"foo(); \n" + 
			"operation foo() { \n" + 
			"  foo.println(); \n" + 
			"}"
		);
		try {
			module.execute();
			fail("Expected "+EolUndefinedVariableException.class.getSimpleName());
		}
		catch (EolUndefinedVariableException eox) {
			assertEquals(9, countLinesInEOLStackTrace(eox));
		}
	}
	
	@Test
	public void testNullNavigationWithFirstOrderOperation() throws Exception {
		module.parse(
			"var v = null; v->select(x | x.isDefined());"
		);
		try {
			module.execute();
			fail("Expected "+EolRuntimeException.class.getSimpleName());
		}
		catch (EolRuntimeException eox) {
			assertEquals(5, countLinesInEOLStackTrace(eox));
		}
	}
	
	@Test
	public void testNullNavigationWithOperation() throws Exception {
		module.parse(
			"var v = null; v.getClass();"
		);
		try {
			module.execute();
			fail("Expected "+EolRuntimeException.class.getSimpleName());
		}
		catch (EolRuntimeException eox) {
			assertEquals(5, countLinesInEOLStackTrace(eox));
		}
	}
	
	@Test
	public void testNullNavigationOnFirstOrderOperation() throws Exception {
		module.parse(
			"var s = Sequence{null, 0, 1, 2, null}->select(x | x.isDefined())->size(); \n"
			+ "assertEquals(3, s); \n"
			+ "s = select(x | x <> null)?.first?.getClass().getSimpleName(); \n"
			+ "assertEquals('EolNoType', s); \n"
			+ "null.select(x | false)?.getClass().getName();"
		);
		try {
			module.execute();
			fail("Expected "+EolNullPointerException.class.getSimpleName());
		}
		catch (EolNullPointerException eox) {
			assertEquals(7, countLinesInEOLStackTrace(eox));
		}
	}
}
