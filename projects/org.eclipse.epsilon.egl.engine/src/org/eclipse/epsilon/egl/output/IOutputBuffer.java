/*******************************************************************************
 * Copyright (c) 2013 The University of York.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.egl.output;

import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.egl.exceptions.EglStoppedException;
import org.eclipse.epsilon.egl.formatter.Formatter;
import org.eclipse.epsilon.egl.preprocessor.Preprocessor;

public interface IOutputBuffer {

	/**
	 * Removes the specified number of characters from the end of the buffer.
	 */
	public void chop(int numberOfCharacters);

	/**
	 * Appends a string representation of the given object to the buffer.
	 */
	public void print(Object o);
	
	/**
	 * Appends a new line the buffer.
	 */
	public void println();

	/**
	 * Appends a string representation of the given object and a new line to the buffer.
	 */
	public default void println(Object o) {
		print(o);
		println();
	}

	/**
	 * Appends a string representation of the given object to the buffer, correcting
	 * the indentation of the string representation to match the indentation level of
	 * the previous line in the buffer. Used to output EGL dynamic sections.
	 */
	public void printdyn(Object o);

	/**
	 * An alias for {@link #print(Object)} that should only be called
	 * internally, by code generated by the {@link Preprocessor}. This
	 * is a workaround to allow us to identify, in the preprocessed EOL, 
	 * statements that were generated from an EGL static section. We then
	 * adjust these ASTs to allow better traceability in the AST outline 
	 * view.
	 * 
	 * @see EglPreprocessorModule#updateRegionsOfStaticTextASTs
	 */
	public default void prinx(Object o) {
		print(o);
	}

	/**
	 * Returns a string comprised of the specificed number of spaces.
	 */
	public default String getSpaces(int howMany) {
		String str = "";
		for (int i = 0; i < howMany; i++) {
			str += " ";
		}
		return str;
	}
	
	/**
	 * Specifies the type of output in the buffer, such as Java or HTML.

	 * @throws EglRuntimeException if the content type is not supported.
	 */
	public void setContentType(String name) throws EglRuntimeException;
	
	/**
	 * Appends a protected region to the buffer.
	 * 
	 * @param id - a unique identifier for this protected region
	 * @param enabled - a flag indicating whether protection of text in this region should be enabled or not
	 * @param contents - the contents for this protected region
	 * 
	 * @throws EglRuntimeException if {@link #setContentType(String)} has not been called.
	 */
	public default String preserve(String id, boolean enabled, String contents) throws EglRuntimeException {
		return startPreserve(id, enabled) + getNewline() +
			       contents + getNewline() +
			       stopPreserve();
	}

	/**
	 * Appends a protected region to the buffer.
	 * 
	 * @param startComment - the character sequence used to denote the start of a comment for the type of output in the buffer
	 * @param endComment - the character sequence used to denote the end of a comment for the type of output in the buffer 
	 * @param id - a unique identifier for this protected region
	 * @param enabled - a flag indicating whether protection of text in this region should be enabled or not
	 * @param contents - the contents for this protected region 
	 */
	public default String preserve(String startComment, String endComment, String id, boolean enabled, String contents) throws EglRuntimeException {
		return startPreserve(startComment, endComment, id, enabled) + getNewline() +
			       contents + getNewline() +
			       stopPreserve();
	}

	/**
	 * Appends the starting tag for a protected region to the buffer.
	 * 
	 * @param id - a unique identifier for this protected region
	 * @param enabled - a flag indicating whether protection of text in this region should be enabled or not
	 * 
	 * @throws EglRuntimeException if {@link #setContentType(String)} has not been called
	 */
	public String startPreserve(String id, boolean enabled) throws EglRuntimeException;

	/**
	 * Appends the starting tag for a protected region to the buffer.
	 * 
	 * @param startComment - the character sequence used to denote the start of a comment for the type of output in the buffer
	 * @param endComment - the character sequence used to denote the end of a comment for the type of output in the buffer 
	 * @param id - a unique identifier for this protected region
	 * @param enabled - a flag indicating whether protection of text in this region should be enabled or not
	 */
	public String startPreserve(String startComment, String endComment, String id, boolean enabled) throws EglRuntimeException;

	/**
	 * Appends a closing tag for a protected region to the buffer.
	 * 
	 * @throws EglRuntimeException if there is no unclosed protected region in the buffer.
	 */
	public String stopPreserve() throws EglRuntimeException;

	/**
	 * Appends a controlled region to the buffer.
	 * 
	 * @param id - a unique identifier for this protected region
	 * @param enabled - a flag indicating whether protection of text in this region should be enabled or not
	 * @param contents - the contents for this protected region
	 * 
	 * @throws EglRuntimeException if {@link #setContentType(String)} has not been called.
	 */
	public default String control(String id, boolean enabled, String contents) throws EglRuntimeException {
		return startControl(id, enabled) + getNewline() +
			       contents + getNewline() +
			       stopPreserve();
	}

	/**
	 * Appends a controlled region to the buffer.
	 * 
	 * @param startComment - the character sequence used to denote the start of a comment for the type of output in the buffer
	 * @param endComment - the character sequence used to denote the end of a comment for the type of output in the buffer 
	 * @param id - a unique identifier for this protected region
	 * @param enabled - a flag indicating whether protection of text in this region should be enabled or not
	 * @param contents - the contents for this protected region 
	 */
	public default String control(String startComment, String endComment, String id, boolean enabled, String contents) throws EglRuntimeException {
		return startControl(startComment, endComment, id, enabled) + getNewline() +
			       contents + getNewline() +
			       stopPreserve();
	}

	/**
	 * Appends the starting tag for a controlled region to the buffer.
	 * 
	 * @param id - a unique identifier for this protected region
	 * @param enabled - a flag indicating whether protection of text in this region should be enabled or not
	 * 
	 * @throws EglRuntimeException if {@link #setContentType(String)} has not been called
	 */
	public String startControl(String id, boolean enabled) throws EglRuntimeException;

	/**
	 * Appends the starting tag for a protected region to the buffer.
	 * 
	 * @param startComment - the character sequence used to denote the start of a comment for the type of output in the buffer
	 * @param endComment - the character sequence used to denote the end of a comment for the type of output in the buffer 
	 * @param id - a unique identifier for this protected region
	 * @param enabled - a flag indicating whether protection of text in this region should be enabled or not
	 */
	public String startControl(String startComment, String endComment, String id, boolean enabled) throws EglRuntimeException;

	/**
	 * Appends a closing tag for a protected region to the buffer.
	 * 
	 * @throws EglRuntimeException if there is no unclosed protected region in the buffer.
	 */
	public String stopControl() throws EglRuntimeException;

	/**
	 * Halts execution of the current template.
	 */
	public void stop() throws EglStoppedException;

	/**
	 * Returns the line number of the last character in the buffer.
	 */
	public int getCurrentLineNumber();

	/**
	 * Returns the character number of the last character in the buffer.
	 */
	public default int getCurrentColumnNumber() {
		final String text = toString(), newLine = getNewline();
		if (text.endsWith(newLine)) return 1;
		final String[] lines = text.split(newLine);
		return lines[lines.length - 1].length() + 1;
	}

	/**
	 * Returns the size of the buffer.
	 */
	public int getOffset();

	/**
	 * Reformats the contents of the buffer with the given {@link Formatter}.
	 */
	public void formatWith(Formatter formatter);

	/**
	 * Converts the contents of the buffer to a string.
	 */
	public String toString();
	
	/**
	 *
	 * @return The newline character.
	 * @since 1.6
	 */
	public default String getNewline() {
		return org.eclipse.epsilon.egl.util.FileUtil.NEWLINE;
	}
}