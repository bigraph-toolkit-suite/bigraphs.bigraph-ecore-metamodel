/**
 */
package org.bigraphs.model.signatureBaseModel.impl;

import java.util.Collection;

import org.bigraphs.model.signatureBaseModel.BKindPlaceSorting;
import org.bigraphs.model.signatureBaseModel.BKindSignature;
import org.bigraphs.model.signatureBaseModel.SignatureBaseModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BKind Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.signatureBaseModel.impl.BKindSignatureImpl#getBKindPlaceSorts <em>BKind Place Sorts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BKindSignatureImpl extends BSortingImpl implements BKindSignature {
	/**
	 * The cached value of the '{@link #getBKindPlaceSorts() <em>BKind Place Sorts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBKindPlaceSorts()
	 * @generated
	 * @ordered
	 */
	protected EList<BKindPlaceSorting> bKindPlaceSorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BKindSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignatureBaseModelPackage.Literals.BKIND_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BKindPlaceSorting> getBKindPlaceSorts() {
		if (bKindPlaceSorts == null) {
			bKindPlaceSorts = new EObjectContainmentWithInverseEList<BKindPlaceSorting>(BKindPlaceSorting.class, this, SignatureBaseModelPackage.BKIND_SIGNATURE__BKIND_PLACE_SORTS, SignatureBaseModelPackage.BKIND_PLACE_SORTING__BPLACE_SORTING);
		}
		return bKindPlaceSorts;
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
			case SignatureBaseModelPackage.BKIND_SIGNATURE__BKIND_PLACE_SORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBKindPlaceSorts()).basicAdd(otherEnd, msgs);
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
			case SignatureBaseModelPackage.BKIND_SIGNATURE__BKIND_PLACE_SORTS:
				return ((InternalEList<?>)getBKindPlaceSorts()).basicRemove(otherEnd, msgs);
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
			case SignatureBaseModelPackage.BKIND_SIGNATURE__BKIND_PLACE_SORTS:
				return getBKindPlaceSorts();
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
			case SignatureBaseModelPackage.BKIND_SIGNATURE__BKIND_PLACE_SORTS:
				getBKindPlaceSorts().clear();
				getBKindPlaceSorts().addAll((Collection<? extends BKindPlaceSorting>)newValue);
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
			case SignatureBaseModelPackage.BKIND_SIGNATURE__BKIND_PLACE_SORTS:
				getBKindPlaceSorts().clear();
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
			case SignatureBaseModelPackage.BKIND_SIGNATURE__BKIND_PLACE_SORTS:
				return bKindPlaceSorts != null && !bKindPlaceSorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BKindSignatureImpl
