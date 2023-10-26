/**
 */
package org.bigraphs.model.signatureBaseModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BKind Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.signatureBaseModel.BKindSignature#getBKindPlaceSorts <em>BKind Place Sorts</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.model.signatureBaseModel.SignatureBaseModelPackage#getBKindSignature()
 * @model
 * @generated
 */
public interface BKindSignature extends BSorting {
	/**
	 * Returns the value of the '<em><b>BKind Place Sorts</b></em>' containment reference list.
	 * The list contents are of type {@link org.bigraphs.model.signatureBaseModel.BKindPlaceSorting}.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.signatureBaseModel.BKindPlaceSorting#getBPlaceSorting <em>BPlace Sorting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BKind Place Sorts</em>' containment reference list.
	 * @see org.bigraphs.model.signatureBaseModel.SignatureBaseModelPackage#getBKindSignature_BKindPlaceSorts()
	 * @see org.bigraphs.model.signatureBaseModel.BKindPlaceSorting#getBPlaceSorting
	 * @model opposite="bPlaceSorting" containment="true" required="true"
	 * @generated
	 */
	EList<BKindPlaceSorting> getBKindPlaceSorts();

} // BKindSignature
