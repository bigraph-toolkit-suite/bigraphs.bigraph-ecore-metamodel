/**
 */
package org.bigraphs.model.bigraphBaseModel.impl;

import org.bigraphs.model.bigraphBaseModel.BBigraph;
import org.bigraphs.model.bigraphBaseModel.BOuterName;
import org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BOuter Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.impl.BOuterNameImpl#getBBigraph <em>BBigraph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BOuterNameImpl extends BLinkImpl implements BOuterName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOuterNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigraphBaseModelPackage.Literals.BOUTER_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BBigraph getBBigraph() {
		return (BBigraph) eGet(BigraphBaseModelPackage.Literals.BOUTER_NAME__BBIGRAPH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBBigraph(BBigraph newBBigraph) {
		eSet(BigraphBaseModelPackage.Literals.BOUTER_NAME__BBIGRAPH, newBBigraph);
	}

} //BOuterNameImpl
