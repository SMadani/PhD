/**
 */
package javaMM.impl;

import java.util.Collection;

import javaMM.Expression;
import javaMM.JavaMMPackage;
import javaMM.SingleVariableAccess;
import javaMM.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaMM.impl.VariableDeclarationImpl#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link javaMM.impl.VariableDeclarationImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link javaMM.impl.VariableDeclarationImpl#getUsageInVariableAccess <em>Usage In Variable Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariableDeclarationImpl extends NamedElementImpl implements VariableDeclaration {
	/**
	 * The default value of the '{@link #getExtraArrayDimensions() <em>Extra Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraArrayDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final int EXTRA_ARRAY_DIMENSIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExtraArrayDimensions() <em>Extra Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraArrayDimensions()
	 * @generated
	 * @ordered
	 */
	protected int extraArrayDimensions = EXTRA_ARRAY_DIMENSIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected Expression initializer;

	/**
	 * The cached value of the '{@link #getUsageInVariableAccess() <em>Usage In Variable Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageInVariableAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableAccess> usageInVariableAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaMMPackage.Literals.VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExtraArrayDimensions() {
		return extraArrayDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtraArrayDimensions(int newExtraArrayDimensions) {
		int oldExtraArrayDimensions = extraArrayDimensions;
		extraArrayDimensions = newExtraArrayDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS, oldExtraArrayDimensions, extraArrayDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getInitializer() {
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializer(Expression newInitializer, NotificationChain msgs) {
		Expression oldInitializer = initializer;
		initializer = newInitializer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaMMPackage.VARIABLE_DECLARATION__INITIALIZER, oldInitializer, newInitializer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitializer(Expression newInitializer) {
		if (newInitializer != initializer) {
			NotificationChain msgs = null;
			if (initializer != null)
				msgs = ((InternalEObject)initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaMMPackage.VARIABLE_DECLARATION__INITIALIZER, null, msgs);
			if (newInitializer != null)
				msgs = ((InternalEObject)newInitializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaMMPackage.VARIABLE_DECLARATION__INITIALIZER, null, msgs);
			msgs = basicSetInitializer(newInitializer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.VARIABLE_DECLARATION__INITIALIZER, newInitializer, newInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableAccess> getUsageInVariableAccess() {
		if (usageInVariableAccess == null) {
			usageInVariableAccess = new EObjectWithInverseResolvingEList<SingleVariableAccess>(SingleVariableAccess.class, this, JavaMMPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS, JavaMMPackage.SINGLE_VARIABLE_ACCESS__VARIABLE);
		}
		return usageInVariableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaMMPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsageInVariableAccess()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaMMPackage.VARIABLE_DECLARATION__INITIALIZER:
				return basicSetInitializer(null, msgs);
			case JavaMMPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return ((InternalEList<?>)getUsageInVariableAccess()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaMMPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return getExtraArrayDimensions();
			case JavaMMPackage.VARIABLE_DECLARATION__INITIALIZER:
				return getInitializer();
			case JavaMMPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return getUsageInVariableAccess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaMMPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				setExtraArrayDimensions((Integer)newValue);
				return;
			case JavaMMPackage.VARIABLE_DECLARATION__INITIALIZER:
				setInitializer((Expression)newValue);
				return;
			case JavaMMPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				getUsageInVariableAccess().clear();
				getUsageInVariableAccess().addAll((Collection<? extends SingleVariableAccess>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaMMPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				setExtraArrayDimensions(EXTRA_ARRAY_DIMENSIONS_EDEFAULT);
				return;
			case JavaMMPackage.VARIABLE_DECLARATION__INITIALIZER:
				setInitializer((Expression)null);
				return;
			case JavaMMPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				getUsageInVariableAccess().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaMMPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return extraArrayDimensions != EXTRA_ARRAY_DIMENSIONS_EDEFAULT;
			case JavaMMPackage.VARIABLE_DECLARATION__INITIALIZER:
				return initializer != null;
			case JavaMMPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return usageInVariableAccess != null && !usageInVariableAccess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (extraArrayDimensions: ");
		result.append(extraArrayDimensions);
		result.append(')');
		return result.toString();
	}

} //VariableDeclarationImpl
