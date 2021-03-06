/**
 */
package javaMM.impl;

import java.util.Collection;

import javaMM.BreakStatement;
import javaMM.ContinueStatement;
import javaMM.JavaMMPackage;
import javaMM.LabeledStatement;
import javaMM.Statement;

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
 * An implementation of the model object '<em><b>Labeled Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaMM.impl.LabeledStatementImpl#getBody <em>Body</em>}</li>
 *   <li>{@link javaMM.impl.LabeledStatementImpl#getUsagesInBreakStatements <em>Usages In Break Statements</em>}</li>
 *   <li>{@link javaMM.impl.LabeledStatementImpl#getUsagesInContinueStatements <em>Usages In Continue Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabeledStatementImpl extends NamedElementImpl implements LabeledStatement {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Statement body;

	/**
	 * The cached value of the '{@link #getUsagesInBreakStatements() <em>Usages In Break Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInBreakStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<BreakStatement> usagesInBreakStatements;

	/**
	 * The cached value of the '{@link #getUsagesInContinueStatements() <em>Usages In Continue Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInContinueStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<ContinueStatement> usagesInContinueStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaMMPackage.Literals.LABELED_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Statement newBody, NotificationChain msgs) {
		Statement oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaMMPackage.LABELED_STATEMENT__BODY, oldBody, newBody);
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
	public void setBody(Statement newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaMMPackage.LABELED_STATEMENT__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaMMPackage.LABELED_STATEMENT__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.LABELED_STATEMENT__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BreakStatement> getUsagesInBreakStatements() {
		if (usagesInBreakStatements == null) {
			usagesInBreakStatements = new EObjectWithInverseResolvingEList<BreakStatement>(BreakStatement.class, this, JavaMMPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS, JavaMMPackage.BREAK_STATEMENT__LABEL);
		}
		return usagesInBreakStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContinueStatement> getUsagesInContinueStatements() {
		if (usagesInContinueStatements == null) {
			usagesInContinueStatements = new EObjectWithInverseResolvingEList<ContinueStatement>(ContinueStatement.class, this, JavaMMPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS, JavaMMPackage.CONTINUE_STATEMENT__LABEL);
		}
		return usagesInContinueStatements;
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
			case JavaMMPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsagesInBreakStatements()).basicAdd(otherEnd, msgs);
			case JavaMMPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsagesInContinueStatements()).basicAdd(otherEnd, msgs);
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
			case JavaMMPackage.LABELED_STATEMENT__BODY:
				return basicSetBody(null, msgs);
			case JavaMMPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS:
				return ((InternalEList<?>)getUsagesInBreakStatements()).basicRemove(otherEnd, msgs);
			case JavaMMPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS:
				return ((InternalEList<?>)getUsagesInContinueStatements()).basicRemove(otherEnd, msgs);
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
			case JavaMMPackage.LABELED_STATEMENT__BODY:
				return getBody();
			case JavaMMPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS:
				return getUsagesInBreakStatements();
			case JavaMMPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS:
				return getUsagesInContinueStatements();
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
			case JavaMMPackage.LABELED_STATEMENT__BODY:
				setBody((Statement)newValue);
				return;
			case JavaMMPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS:
				getUsagesInBreakStatements().clear();
				getUsagesInBreakStatements().addAll((Collection<? extends BreakStatement>)newValue);
				return;
			case JavaMMPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS:
				getUsagesInContinueStatements().clear();
				getUsagesInContinueStatements().addAll((Collection<? extends ContinueStatement>)newValue);
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
			case JavaMMPackage.LABELED_STATEMENT__BODY:
				setBody((Statement)null);
				return;
			case JavaMMPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS:
				getUsagesInBreakStatements().clear();
				return;
			case JavaMMPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS:
				getUsagesInContinueStatements().clear();
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
			case JavaMMPackage.LABELED_STATEMENT__BODY:
				return body != null;
			case JavaMMPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS:
				return usagesInBreakStatements != null && !usagesInBreakStatements.isEmpty();
			case JavaMMPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS:
				return usagesInContinueStatements != null && !usagesInContinueStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LabeledStatementImpl
