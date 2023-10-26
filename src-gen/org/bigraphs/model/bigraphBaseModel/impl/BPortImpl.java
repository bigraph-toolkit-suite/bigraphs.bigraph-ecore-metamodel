/**
 */
package org.bigraphs.model.bigraphBaseModel.impl;

import org.bigraphs.model.bigraphBaseModel.BNode;
import org.bigraphs.model.bigraphBaseModel.BPort;
import org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage;
import org.bigraphs.model.bigraphBaseModel.IndexableType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.impl.BPortImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.impl.BPortImpl#getBNode <em>BNode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPortImpl extends BPointImpl implements BPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigraphBaseModelPackage.Literals.BPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIndex() {
		return (Integer) eGet(BigraphBaseModelPackage.Literals.INDEXABLE_TYPE__INDEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(int newIndex) {
		eSet(BigraphBaseModelPackage.Literals.INDEXABLE_TYPE__INDEX, newIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BNode getBNode() {
		return (BNode) eGet(BigraphBaseModelPackage.Literals.BPORT__BNODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBNode(BNode newBNode) {
		eSet(BigraphBaseModelPackage.Literals.BPORT__BNODE, newBNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IndexableType.class) {
			switch (derivedFeatureID) {
			case BigraphBaseModelPackage.BPORT__INDEX:
				return BigraphBaseModelPackage.INDEXABLE_TYPE__INDEX;
			default:
				return -1;
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
		if (baseClass == IndexableType.class) {
			switch (baseFeatureID) {
			case BigraphBaseModelPackage.INDEXABLE_TYPE__INDEX:
				return BigraphBaseModelPackage.BPORT__INDEX;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BPortImpl
