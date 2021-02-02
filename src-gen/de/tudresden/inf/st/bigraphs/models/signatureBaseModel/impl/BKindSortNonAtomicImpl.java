/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl;

import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSortings;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortNonAtomic;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BKind Sort Non Atomic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSortNonAtomicImpl#getBKindSorts <em>BKind Sorts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BKindSortNonAtomicImpl extends MinimalEObjectImpl.Container implements BKindSortNonAtomic {
	/**
	 * The cached value of the '{@link #getBKindSorts() <em>BKind Sorts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBKindSorts()
	 * @generated
	 * @ordered
	 */
	protected EList<BKindPlaceSortings> bKindSorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BKindSortNonAtomicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignatureBaseModelPackage.Literals.BKIND_SORT_NON_ATOMIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BKindPlaceSortings> getBKindSorts() {
		if (bKindSorts == null) {
			bKindSorts = new EObjectResolvingEList<BKindPlaceSortings>(BKindPlaceSortings.class, this, SignatureBaseModelPackage.BKIND_SORT_NON_ATOMIC__BKIND_SORTS);
		}
		return bKindSorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SignatureBaseModelPackage.BKIND_SORT_NON_ATOMIC__BKIND_SORTS:
				return getBKindSorts();
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
			case SignatureBaseModelPackage.BKIND_SORT_NON_ATOMIC__BKIND_SORTS:
				getBKindSorts().clear();
				getBKindSorts().addAll((Collection<? extends BKindPlaceSortings>)newValue);
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
			case SignatureBaseModelPackage.BKIND_SORT_NON_ATOMIC__BKIND_SORTS:
				getBKindSorts().clear();
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
			case SignatureBaseModelPackage.BKIND_SORT_NON_ATOMIC__BKIND_SORTS:
				return bKindSorts != null && !bKindSorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BKindSortNonAtomicImpl
