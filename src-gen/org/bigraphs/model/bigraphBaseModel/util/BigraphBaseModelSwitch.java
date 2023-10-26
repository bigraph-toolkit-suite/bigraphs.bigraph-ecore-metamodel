/**
 */
package org.bigraphs.model.bigraphBaseModel.util;

import java.util.Map;

import org.bigraphs.model.bigraphBaseModel.*;

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
 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage
 * @generated
 */
public class BigraphBaseModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BigraphBaseModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigraphBaseModelSwitch() {
		if (modelPackage == null) {
			modelPackage = BigraphBaseModelPackage.eINSTANCE;
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
		case BigraphBaseModelPackage.BPLACE: {
			BPlace bPlace = (BPlace) theEObject;
			T result = caseBPlace(bPlace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BigraphBaseModelPackage.BROOT: {
			BRoot bRoot = (BRoot) theEObject;
			T result = caseBRoot(bRoot);
			if (result == null)
				result = caseBPlace(bRoot);
			if (result == null)
				result = caseIndexableType(bRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BigraphBaseModelPackage.BNODE: {
			BNode bNode = (BNode) theEObject;
			T result = caseBNode(bNode);
			if (result == null)
				result = caseBPlace(bNode);
			if (result == null)
				result = caseNameableType(bNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BigraphBaseModelPackage.BSITE: {
			BSite bSite = (BSite) theEObject;
			T result = caseBSite(bSite);
			if (result == null)
				result = caseBPlace(bSite);
			if (result == null)
				result = caseIndexableType(bSite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BigraphBaseModelPackage.BPOINT: {
			BPoint bPoint = (BPoint) theEObject;
			T result = caseBPoint(bPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BigraphBaseModelPackage.BLINK: {
			BLink bLink = (BLink) theEObject;
			T result = caseBLink(bLink);
			if (result == null)
				result = caseNameableType(bLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BigraphBaseModelPackage.BPORT: {
			BPort bPort = (BPort) theEObject;
			T result = caseBPort(bPort);
			if (result == null)
				result = caseBPoint(bPort);
			if (result == null)
				result = caseIndexableType(bPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BigraphBaseModelPackage.BINNER_NAME: {
			BInnerName bInnerName = (BInnerName) theEObject;
			T result = caseBInnerName(bInnerName);
			if (result == null)
				result = caseBPoint(bInnerName);
			if (result == null)
				result = caseNameableType(bInnerName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BigraphBaseModelPackage.BEDGE: {
			BEdge bEdge = (BEdge) theEObject;
			T result = caseBEdge(bEdge);
			if (result == null)
				result = caseBLink(bEdge);
			if (result == null)
				result = caseNameableType(bEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BigraphBaseModelPackage.BOUTER_NAME: {
			BOuterName bOuterName = (BOuterName) theEObject;
			T result = caseBOuterName(bOuterName);
			if (result == null)
				result = caseBLink(bOuterName);
			if (result == null)
				result = caseNameableType(bOuterName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BigraphBaseModelPackage.NAMEABLE_TYPE: {
			NameableType nameableType = (NameableType) theEObject;
			T result = caseNameableType(nameableType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BigraphBaseModelPackage.INDEXABLE_TYPE: {
			IndexableType indexableType = (IndexableType) theEObject;
			T result = caseIndexableType(indexableType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BigraphBaseModelPackage.BBIGRAPH: {
			BBigraph bBigraph = (BBigraph) theEObject;
			T result = caseBBigraph(bBigraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BigraphBaseModelPackage.ESTRING_TO_EJAVA_OBJECT_MAP: {
			@SuppressWarnings("unchecked")
			Map.Entry<String, Object> eStringToEJavaObjectMap = (Map.Entry<String, Object>) theEObject;
			T result = caseEStringToEJavaObjectMap(eStringToEJavaObjectMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPlace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPlace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPlace(BPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BRoot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BRoot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBRoot(BRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BNode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BNode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBNode(BNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSite(BSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPoint(BPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BLink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BLink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBLink(BLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPort(BPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BInner Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BInner Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBInnerName(BInnerName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BEdge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BEdge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBEdge(BEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOuter Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOuter Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOuterName(BOuterName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameableType(NameableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indexable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indexable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexableType(IndexableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BBigraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BBigraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBBigraph(BBigraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To EJava Object Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To EJava Object Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToEJavaObjectMap(Map.Entry<String, Object> object) {
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

} //BigraphBaseModelSwitch
