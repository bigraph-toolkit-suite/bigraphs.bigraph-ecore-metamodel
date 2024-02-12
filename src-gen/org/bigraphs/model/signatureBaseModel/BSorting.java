/**
 */
package org.bigraphs.model.signatureBaseModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BSorting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.signatureBaseModel.BSorting#getBControls <em>BControls</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.model.signatureBaseModel.SignatureBaseModelPackage#getBSorting()
 * @model abstract="true"
 * @generated
 */
public interface BSorting extends EObject {
	/**
	 * Returns the value of the '<em><b>BControls</b></em>' containment reference list.
	 * The list contents are of type {@link org.bigraphs.model.signatureBaseModel.BControl}.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.signatureBaseModel.BControl#getBSig <em>BSig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BControls</em>' containment reference list.
	 * @see org.bigraphs.model.signatureBaseModel.SignatureBaseModelPackage#getBSorting_BControls()
	 * @see org.bigraphs.model.signatureBaseModel.BControl#getBSig
	 * @model opposite="bSig" containment="true"
	 * @generated
	 */
	EList<BControl> getBControls();

} // BSorting
