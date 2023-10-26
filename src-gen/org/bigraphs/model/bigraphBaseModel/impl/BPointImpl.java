/**
 */
package org.bigraphs.model.bigraphBaseModel.impl;

import org.bigraphs.model.bigraphBaseModel.BLink;
import org.bigraphs.model.bigraphBaseModel.BPoint;
import org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.impl.BPointImpl#getBLink <em>BLink</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BPointImpl extends CDOObjectImpl implements BPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigraphBaseModelPackage.Literals.BPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BLink getBLink() {
		return (BLink) eGet(BigraphBaseModelPackage.Literals.BPOINT__BLINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBLink(BLink newBLink) {
		eSet(BigraphBaseModelPackage.Literals.BPOINT__BLINK, newBLink);
	}

} //BPointImpl
