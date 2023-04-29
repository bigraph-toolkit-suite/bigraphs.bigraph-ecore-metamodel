/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl;

import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BNode;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPort;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.NameableType;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BNode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BNodeImpl#getBPorts <em>BPorts</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BNodeImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BNodeImpl extends BPlaceImpl implements BNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigraphBaseModelPackage.Literals.BNODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String) eGet(BigraphBaseModelPackage.Literals.NAMEABLE_TYPE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eSet(BigraphBaseModelPackage.Literals.NAMEABLE_TYPE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<BPort> getBPorts() {
		return (EList<BPort>) eGet(BigraphBaseModelPackage.Literals.BNODE__BPORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, Object> getAttributes() {
		return (EMap<String, Object>) eGet(BigraphBaseModelPackage.Literals.BNODE__ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NameableType.class) {
			switch (derivedFeatureID) {
			case BigraphBaseModelPackage.BNODE__NAME:
				return BigraphBaseModelPackage.NAMEABLE_TYPE__NAME;
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
		if (baseClass == NameableType.class) {
			switch (baseFeatureID) {
			case BigraphBaseModelPackage.NAMEABLE_TYPE__NAME:
				return BigraphBaseModelPackage.BNODE__NAME;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BNodeImpl
