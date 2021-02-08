/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel.util;

import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage
 * @generated
 */
public class SignatureBaseModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SignatureBaseModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureBaseModelSwitch() {
		if (modelPackage == null) {
			modelPackage = SignatureBaseModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SignatureBaseModelPackage.BDYNAMIC_SIGNATURE: {
				BDynamicSignature bDynamicSignature = (BDynamicSignature)theEObject;
				T result = caseBDynamicSignature(bDynamicSignature);
				if (result == null) result = caseBKindSignature(bDynamicSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignatureBaseModelPackage.BCONTROL: {
				BControl bControl = (BControl)theEObject;
				T result = caseBControl(bControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignatureBaseModelPackage.BKIND_PLACE_SORTINGS: {
				BKindPlaceSortings bKindPlaceSortings = (BKindPlaceSortings)theEObject;
				T result = caseBKindPlaceSortings(bKindPlaceSortings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignatureBaseModelPackage.BKIND_SORT_NON_ATOMIC: {
				BKindSortNonAtomic bKindSortNonAtomic = (BKindSortNonAtomic)theEObject;
				T result = caseBKindSortNonAtomic(bKindSortNonAtomic);
				if (result == null) result = caseBKindPlaceSortings(bKindSortNonAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignatureBaseModelPackage.BKIND_SIGNATURE: {
				BKindSignature bKindSignature = (BKindSignature)theEObject;
				T result = caseBKindSignature(bKindSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignatureBaseModelPackage.BKIND_SORT_ATOMIC: {
				BKindSortAtomic bKindSortAtomic = (BKindSortAtomic)theEObject;
				T result = caseBKindSortAtomic(bKindSortAtomic);
				if (result == null) result = caseBKindPlaceSortings(bKindSortAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDynamic Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDynamic Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDynamicSignature(BDynamicSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BControl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BControl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBControl(BControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BKind Place Sortings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BKind Place Sortings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBKindPlaceSortings(BKindPlaceSortings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BKind Sort Non Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BKind Sort Non Atomic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBKindSortNonAtomic(BKindSortNonAtomic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BKind Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BKind Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBKindSignature(BKindSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BKind Sort Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BKind Sort Atomic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBKindSortAtomic(BKindSortAtomic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SignatureBaseModelSwitch
