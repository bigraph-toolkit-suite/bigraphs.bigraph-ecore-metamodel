/**
 */
package org.bigraphs.model.signatureBaseModel.impl;

import java.util.Collection;

import org.bigraphs.model.signatureBaseModel.BKindPlaceSorting;
import org.bigraphs.model.signatureBaseModel.BKindSignature;
import org.bigraphs.model.signatureBaseModel.SignatureBaseModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BKind Place Sorting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.signatureBaseModel.impl.BKindPlaceSortingImpl#getBPlaceSorting <em>BPlace Sorting</em>}</li>
 *   <li>{@link org.bigraphs.model.signatureBaseModel.impl.BKindPlaceSortingImpl#getBContainedBy <em>BContained By</em>}</li>
 *   <li>{@link org.bigraphs.model.signatureBaseModel.impl.BKindPlaceSortingImpl#getBCanContain <em>BCan Contain</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BKindPlaceSortingImpl extends MinimalEObjectImpl.Container implements BKindPlaceSorting {
	/**
	 * The cached value of the '{@link #getBContainedBy() <em>BContained By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBContainedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<BKindPlaceSorting> bContainedBy;

	/**
	 * The cached value of the '{@link #getBCanContain() <em>BCan Contain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCanContain()
	 * @generated
	 * @ordered
	 */
	protected EList<BKindPlaceSorting> bCanContain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BKindPlaceSortingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignatureBaseModelPackage.Literals.BKIND_PLACE_SORTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BKindSignature getBPlaceSorting() {
		if (eContainerFeatureID() != SignatureBaseModelPackage.BKIND_PLACE_SORTING__BPLACE_SORTING) return null;
		return (BKindSignature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPlaceSorting(BKindSignature newBPlaceSorting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBPlaceSorting, SignatureBaseModelPackage.BKIND_PLACE_SORTING__BPLACE_SORTING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBPlaceSorting(BKindSignature newBPlaceSorting) {
		if (newBPlaceSorting != eInternalContainer() || (eContainerFeatureID() != SignatureBaseModelPackage.BKIND_PLACE_SORTING__BPLACE_SORTING && newBPlaceSorting != null)) {
			if (EcoreUtil.isAncestor(this, newBPlaceSorting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBPlaceSorting != null)
				msgs = ((InternalEObject)newBPlaceSorting).eInverseAdd(this, SignatureBaseModelPackage.BKIND_SIGNATURE__BKIND_PLACE_SORTS, BKindSignature.class, msgs);
			msgs = basicSetBPlaceSorting(newBPlaceSorting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignatureBaseModelPackage.BKIND_PLACE_SORTING__BPLACE_SORTING, newBPlaceSorting, newBPlaceSorting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BKindPlaceSorting> getBContainedBy() {
		if (bContainedBy == null) {
			bContainedBy = new EObjectWithInverseResolvingEList.ManyInverse<BKindPlaceSorting>(BKindPlaceSorting.class, this, SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCONTAINED_BY, SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCAN_CONTAIN);
		}
		return bContainedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BKindPlaceSorting> getBCanContain() {
		if (bCanContain == null) {
			bCanContain = new EObjectWithInverseResolvingEList.ManyInverse<BKindPlaceSorting>(BKindPlaceSorting.class, this, SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCAN_CONTAIN, SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCONTAINED_BY);
		}
		return bCanContain;
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
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BPLACE_SORTING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBPlaceSorting((BKindSignature)otherEnd, msgs);
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCONTAINED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBContainedBy()).basicAdd(otherEnd, msgs);
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCAN_CONTAIN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBCanContain()).basicAdd(otherEnd, msgs);
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
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BPLACE_SORTING:
				return basicSetBPlaceSorting(null, msgs);
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCONTAINED_BY:
				return ((InternalEList<?>)getBContainedBy()).basicRemove(otherEnd, msgs);
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCAN_CONTAIN:
				return ((InternalEList<?>)getBCanContain()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BPLACE_SORTING:
				return eInternalContainer().eInverseRemove(this, SignatureBaseModelPackage.BKIND_SIGNATURE__BKIND_PLACE_SORTS, BKindSignature.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BPLACE_SORTING:
				return getBPlaceSorting();
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCONTAINED_BY:
				return getBContainedBy();
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCAN_CONTAIN:
				return getBCanContain();
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
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BPLACE_SORTING:
				setBPlaceSorting((BKindSignature)newValue);
				return;
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCONTAINED_BY:
				getBContainedBy().clear();
				getBContainedBy().addAll((Collection<? extends BKindPlaceSorting>)newValue);
				return;
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCAN_CONTAIN:
				getBCanContain().clear();
				getBCanContain().addAll((Collection<? extends BKindPlaceSorting>)newValue);
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
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BPLACE_SORTING:
				setBPlaceSorting((BKindSignature)null);
				return;
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCONTAINED_BY:
				getBContainedBy().clear();
				return;
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCAN_CONTAIN:
				getBCanContain().clear();
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
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BPLACE_SORTING:
				return getBPlaceSorting() != null;
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCONTAINED_BY:
				return bContainedBy != null && !bContainedBy.isEmpty();
			case SignatureBaseModelPackage.BKIND_PLACE_SORTING__BCAN_CONTAIN:
				return bCanContain != null && !bCanContain.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BKindPlaceSortingImpl
