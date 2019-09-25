/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl;

import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BBigraph;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BRoot;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.IndexableType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BRoot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BRootImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BRootImpl#getBBigraph <em>BBigraph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BRootImpl extends BPlaceImpl implements BRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigraphBaseModelPackage.Literals.BROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return (Integer) eGet(BigraphBaseModelPackage.Literals.INDEXABLE_TYPE__INDEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		eSet(BigraphBaseModelPackage.Literals.INDEXABLE_TYPE__INDEX, newIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBigraph getBBigraph() {
		return (BBigraph) eGet(BigraphBaseModelPackage.Literals.BROOT__BBIGRAPH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBBigraph(BBigraph newBBigraph) {
		eSet(BigraphBaseModelPackage.Literals.BROOT__BBIGRAPH, newBBigraph);
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
			case BigraphBaseModelPackage.BROOT__INDEX:
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
				return BigraphBaseModelPackage.BROOT__INDEX;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BRootImpl
