/**
 */
package javaMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaMM.Type#getUsagesInTypeAccess <em>Usages In Type Access</em>}</li>
 * </ul>
 *
 * @see javaMM.JavaMMPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Usages In Type Access</b></em>' reference list.
	 * The list contents are of type {@link javaMM.TypeAccess}.
	 * It is bidirectional and its opposite is '{@link javaMM.TypeAccess#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages In Type Access</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Type Access</em>' reference list.
	 * @see javaMM.JavaMMPackage#getType_UsagesInTypeAccess()
	 * @see javaMM.TypeAccess#getType
	 * @model opposite="type" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/MoDisco/Java/0.2.incubation/java!Type!usagesInTypeAccess'"
	 * @generated
	 */
	EList<TypeAccess> getUsagesInTypeAccess();

} // Type
