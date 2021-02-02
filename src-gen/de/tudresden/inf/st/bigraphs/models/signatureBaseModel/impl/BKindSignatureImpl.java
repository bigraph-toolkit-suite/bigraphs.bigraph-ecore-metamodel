/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl;

import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSortings;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSignature;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BKind Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSignatureImpl#getBKindPlaceSorts <em>BKind Place Sorts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BKindSignatureImpl extends BDynamicSignatureImpl implements BKindSignature {
	/**
	 * The cached value of the '{@link #getBKindPlaceSorts() <em>BKind Place Sorts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBKindPlaceSorts()
	 * @generated
	 * @ordered
	 */
	protected EList<BKindPlaceSortings> bKindPlaceSorts;

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
	public EList<BKindPlaceSortings> getBKindPlaceSorts() {
		if (bKindPlaceSorts == null) {
			bKindPlaceSorts = new EObjectResolvingEList<BKindPlaceSortings>(BKindPlaceSortings.class, this, SignatureBaseModelPackage.BKIND_SIGNATURE__BKIND_PLACE_SORTS);
		}
		return bKindPlaceSorts;
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
				getBKindPlaceSorts().addAll((Collection<? extends BKindPlaceSortings>)newValue);
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
