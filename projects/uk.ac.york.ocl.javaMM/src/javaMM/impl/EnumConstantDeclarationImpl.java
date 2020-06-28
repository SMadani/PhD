/**
 */
package javaMM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javaMM.AnonymousClassDeclaration;
import javaMM.EnumConstantDeclaration;
import javaMM.Expression;
import javaMM.JavaMMPackage;
import javaMM.JavaMMTables;
import javaMM.SingleVariableAccess;
import javaMM.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Constant Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaMM.impl.EnumConstantDeclarationImpl#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link javaMM.impl.EnumConstantDeclarationImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link javaMM.impl.EnumConstantDeclarationImpl#getUsageInVariableAccess <em>Usage In Variable Access</em>}</li>
 *   <li>{@link javaMM.impl.EnumConstantDeclarationImpl#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}</li>
 *   <li>{@link javaMM.impl.EnumConstantDeclarationImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumConstantDeclarationImpl extends BodyDeclarationImpl implements EnumConstantDeclaration {
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
	 * The cached value of the '{@link #getAnonymousClassDeclaration() <em>Anonymous Class Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousClassDeclaration()
	 * @generated
	 * @ordered
	 */
	protected AnonymousClassDeclaration anonymousClassDeclaration;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumConstantDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaMMPackage.Literals.ENUM_CONSTANT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExtraArrayDimensions() {
		return extraArrayDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraArrayDimensions(int newExtraArrayDimensions) {
		int oldExtraArrayDimensions = extraArrayDimensions;
		extraArrayDimensions = newExtraArrayDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS, oldExtraArrayDimensions, extraArrayDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaMMPackage.ENUM_CONSTANT_DECLARATION__INITIALIZER, oldInitializer, newInitializer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(Expression newInitializer) {
		if (newInitializer != initializer) {
			NotificationChain msgs = null;
			if (initializer != null)
				msgs = ((InternalEObject)initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaMMPackage.ENUM_CONSTANT_DECLARATION__INITIALIZER, null, msgs);
			if (newInitializer != null)
				msgs = ((InternalEObject)newInitializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaMMPackage.ENUM_CONSTANT_DECLARATION__INITIALIZER, null, msgs);
			msgs = basicSetInitializer(newInitializer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.ENUM_CONSTANT_DECLARATION__INITIALIZER, newInitializer, newInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleVariableAccess> getUsageInVariableAccess() {
		if (usageInVariableAccess == null) {
			usageInVariableAccess = new EObjectWithInverseResolvingEList<SingleVariableAccess>(SingleVariableAccess.class, this, JavaMMPackage.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS, JavaMMPackage.SINGLE_VARIABLE_ACCESS__VARIABLE);
		}
		return usageInVariableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclaration getAnonymousClassDeclaration() {
		return anonymousClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymousClassDeclaration(AnonymousClassDeclaration newAnonymousClassDeclaration, NotificationChain msgs) {
		AnonymousClassDeclaration oldAnonymousClassDeclaration = anonymousClassDeclaration;
		anonymousClassDeclaration = newAnonymousClassDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaMMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION, oldAnonymousClassDeclaration, newAnonymousClassDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousClassDeclaration(AnonymousClassDeclaration newAnonymousClassDeclaration) {
		if (newAnonymousClassDeclaration != anonymousClassDeclaration) {
			NotificationChain msgs = null;
			if (anonymousClassDeclaration != null)
				msgs = ((InternalEObject)anonymousClassDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaMMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION, null, msgs);
			if (newAnonymousClassDeclaration != null)
				msgs = ((InternalEObject)newAnonymousClassDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaMMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION, null, msgs);
			msgs = basicSetAnonymousClassDeclaration(newAnonymousClassDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION, newAnonymousClassDeclaration, newAnonymousClassDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Expression>(Expression.class, this, JavaMMPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean variableIsUsed(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv variableIsUsed:
		 *   let
		 *     severity : Integer[1] = 'VariableDeclaration::variableIsUsed'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : Boolean[1] = self.usageInVariableAccess->notEmpty()
		 *       in
		 *         'VariableDeclaration::variableIsUsed'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, JavaMMTables.STR_VariableDeclaration_c_c_variableIsUsed);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, JavaMMTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<SingleVariableAccess> usageInVariableAccess = this.getUsageInVariableAccess();
			final /*@NonInvalid*/ SetValue BOXED_usageInVariableAccess = idResolver.createSetOfAll(JavaMMTables.SET_CLSSid_SingleVariableAccess, usageInVariableAccess);
			final /*@NonInvalid*/ boolean result = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_usageInVariableAccess).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, JavaMMTables.STR_VariableDeclaration_c_c_variableIsUsed, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, JavaMMTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
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
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
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
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__INITIALIZER:
				return basicSetInitializer(null, msgs);
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return ((InternalEList<?>)getUsageInVariableAccess()).basicRemove(otherEnd, msgs);
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION:
				return basicSetAnonymousClassDeclaration(null, msgs);
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return getExtraArrayDimensions();
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__INITIALIZER:
				return getInitializer();
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return getUsageInVariableAccess();
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION:
				return getAnonymousClassDeclaration();
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
				return getArguments();
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
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				setExtraArrayDimensions((Integer)newValue);
				return;
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__INITIALIZER:
				setInitializer((Expression)newValue);
				return;
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				getUsageInVariableAccess().clear();
				getUsageInVariableAccess().addAll((Collection<? extends SingleVariableAccess>)newValue);
				return;
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION:
				setAnonymousClassDeclaration((AnonymousClassDeclaration)newValue);
				return;
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
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
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				setExtraArrayDimensions(EXTRA_ARRAY_DIMENSIONS_EDEFAULT);
				return;
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__INITIALIZER:
				setInitializer((Expression)null);
				return;
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				getUsageInVariableAccess().clear();
				return;
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION:
				setAnonymousClassDeclaration((AnonymousClassDeclaration)null);
				return;
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
				getArguments().clear();
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
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return extraArrayDimensions != EXTRA_ARRAY_DIMENSIONS_EDEFAULT;
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__INITIALIZER:
				return initializer != null;
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return usageInVariableAccess != null && !usageInVariableAccess.isEmpty();
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION:
				return anonymousClassDeclaration != null;
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VariableDeclaration.class) {
			switch (derivedFeatureID) {
				case JavaMMPackage.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS: return JavaMMPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS;
				case JavaMMPackage.ENUM_CONSTANT_DECLARATION__INITIALIZER: return JavaMMPackage.VARIABLE_DECLARATION__INITIALIZER;
				case JavaMMPackage.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS: return JavaMMPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == VariableDeclaration.class) {
			switch (baseFeatureID) {
				case JavaMMPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS: return JavaMMPackage.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS;
				case JavaMMPackage.VARIABLE_DECLARATION__INITIALIZER: return JavaMMPackage.ENUM_CONSTANT_DECLARATION__INITIALIZER;
				case JavaMMPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS: return JavaMMPackage.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == VariableDeclaration.class) {
			switch (baseOperationID) {
				case JavaMMPackage.VARIABLE_DECLARATION___VARIABLE_IS_USED__DIAGNOSTICCHAIN_MAP: return JavaMMPackage.ENUM_CONSTANT_DECLARATION___VARIABLE_IS_USED__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaMMPackage.ENUM_CONSTANT_DECLARATION___VARIABLE_IS_USED__DIAGNOSTICCHAIN_MAP:
				return variableIsUsed((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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

} //EnumConstantDeclarationImpl
