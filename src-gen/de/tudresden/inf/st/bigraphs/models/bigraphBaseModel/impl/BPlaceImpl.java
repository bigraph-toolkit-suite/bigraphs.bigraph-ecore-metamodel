/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl;

import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPlace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPlaceImpl#getBChild <em>BChild</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPlaceImpl#getBPrnt <em>BPrnt</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BPlaceImpl extends MinimalEObjectImpl.Container implements BPlace {
	/**
	 * The cached value of the '{@link #getBChild() <em>BChild</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBChild()
	 * @generated
	 * @ordered
	 */
	protected EList<BPlace> bChild;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigraphBaseModelPackage.Literals.BPLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPlace> getBChild() {
		if (bChild == null) {
			bChild = new EObjectContainmentWithInverseEList<BPlace>(BPlace.class, this,
					BigraphBaseModelPackage.BPLACE__BCHILD, BigraphBaseModelPackage.BPLACE__BPRNT);
		}
		return bChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPlace getBPrnt() {
		if (eContainerFeatureID() != BigraphBaseModelPackage.BPLACE__BPRNT)
			return null;
		return (BPlace) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPrnt(BPlace newBPrnt, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newBPrnt, BigraphBaseModelPackage.BPLACE__BPRNT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPrnt(BPlace newBPrnt) {
		if (newBPrnt != eInternalContainer()
				|| (eContainerFeatureID() != BigraphBaseModelPackage.BPLACE__BPRNT && newBPrnt != null)) {
			if (EcoreUtil.isAncestor(this, newBPrnt))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBPrnt != null)
				msgs = ((InternalEObject) newBPrnt).eInverseAdd(this, BigraphBaseModelPackage.BPLACE__BCHILD,
						BPlace.class, msgs);
			msgs = basicSetBPrnt(newBPrnt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigraphBaseModelPackage.BPLACE__BPRNT, newBPrnt,
					newBPrnt));
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
		case BigraphBaseModelPackage.BPLACE__BCHILD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBChild()).basicAdd(otherEnd, msgs);
		case BigraphBaseModelPackage.BPLACE__BPRNT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetBPrnt((BPlace) otherEnd, msgs);
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
		case BigraphBaseModelPackage.BPLACE__BCHILD:
			return ((InternalEList<?>) getBChild()).basicRemove(otherEnd, msgs);
		case BigraphBaseModelPackage.BPLACE__BPRNT:
			return basicSetBPrnt(null, msgs);
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
		case BigraphBaseModelPackage.BPLACE__BPRNT:
			return eInternalContainer().eInverseRemove(this, BigraphBaseModelPackage.BPLACE__BCHILD, BPlace.class,
					msgs);
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
		case BigraphBaseModelPackage.BPLACE__BCHILD:
			return getBChild();
		case BigraphBaseModelPackage.BPLACE__BPRNT:
			return getBPrnt();
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
		case BigraphBaseModelPackage.BPLACE__BCHILD:
			getBChild().clear();
			getBChild().addAll((Collection<? extends BPlace>) newValue);
			return;
		case BigraphBaseModelPackage.BPLACE__BPRNT:
			setBPrnt((BPlace) newValue);
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
		case BigraphBaseModelPackage.BPLACE__BCHILD:
			getBChild().clear();
			return;
		case BigraphBaseModelPackage.BPLACE__BPRNT:
			setBPrnt((BPlace) null);
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
		case BigraphBaseModelPackage.BPLACE__BCHILD:
			return bChild != null && !bChild.isEmpty();
		case BigraphBaseModelPackage.BPLACE__BPRNT:
			return getBPrnt() != null;
		}
		return super.eIsSet(featureID);
	}

} //BPlaceImpl
