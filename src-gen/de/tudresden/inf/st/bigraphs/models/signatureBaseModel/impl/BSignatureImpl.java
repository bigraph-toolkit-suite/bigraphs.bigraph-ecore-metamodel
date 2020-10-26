/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl;

import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BSignature;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BSignature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BSignatureImpl#getBControls <em>BControls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSignatureImpl extends MinimalEObjectImpl.Container implements BSignature {
	/**
	 * The cached value of the '{@link #getBControls() <em>BControls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBControls()
	 * @generated
	 * @ordered
	 */
	protected EList<BControl> bControls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignatureBaseModelPackage.Literals.BSIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BControl> getBControls() {
		if (bControls == null) {
			bControls = new EObjectResolvingEList<BControl>(BControl.class, this, SignatureBaseModelPackage.BSIGNATURE__BCONTROLS);
		}
		return bControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SignatureBaseModelPackage.BSIGNATURE__BCONTROLS:
				return getBControls();
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
			case SignatureBaseModelPackage.BSIGNATURE__BCONTROLS:
				getBControls().clear();
				getBControls().addAll((Collection<? extends BControl>)newValue);
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
			case SignatureBaseModelPackage.BSIGNATURE__BCONTROLS:
				getBControls().clear();
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
			case SignatureBaseModelPackage.BSIGNATURE__BCONTROLS:
				return bControls != null && !bControls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BSignatureImpl
