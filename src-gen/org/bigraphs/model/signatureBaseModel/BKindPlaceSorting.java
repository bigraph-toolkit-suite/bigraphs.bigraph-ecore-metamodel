/**
 */
package org.bigraphs.model.signatureBaseModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BKind Place Sorting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.signatureBaseModel.BKindPlaceSorting#getBPlaceSorting <em>BPlace Sorting</em>}</li>
 *   <li>{@link org.bigraphs.model.signatureBaseModel.BKindPlaceSorting#getBContainedBy <em>BContained By</em>}</li>
 *   <li>{@link org.bigraphs.model.signatureBaseModel.BKindPlaceSorting#getBCanContain <em>BCan Contain</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.model.signatureBaseModel.SignatureBaseModelPackage#getBKindPlaceSorting()
 * @model abstract="true"
 * @generated
 */
public interface BKindPlaceSorting extends EObject {
	/**
	 * Returns the value of the '<em><b>BPlace Sorting</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.signatureBaseModel.BKindSignature#getBKindPlaceSorts <em>BKind Place Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPlace Sorting</em>' container reference.
	 * @see #setBPlaceSorting(BKindSignature)
	 * @see org.bigraphs.model.signatureBaseModel.SignatureBaseModelPackage#getBKindPlaceSorting_BPlaceSorting()
	 * @see org.bigraphs.model.signatureBaseModel.BKindSignature#getBKindPlaceSorts
	 * @model opposite="bKindPlaceSorts" required="true" transient="false"
	 * @generated
	 */
	BKindSignature getBPlaceSorting();

	/**
	 * Sets the value of the '{@link org.bigraphs.model.signatureBaseModel.BKindPlaceSorting#getBPlaceSorting <em>BPlace Sorting</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPlace Sorting</em>' container reference.
	 * @see #getBPlaceSorting()
	 * @generated
	 */
	void setBPlaceSorting(BKindSignature value);

	/**
	 * Returns the value of the '<em><b>BContained By</b></em>' reference list.
	 * The list contents are of type {@link org.bigraphs.model.signatureBaseModel.BKindPlaceSorting}.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.signatureBaseModel.BKindPlaceSorting#getBCanContain <em>BCan Contain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BContained By</em>' reference list.
	 * @see org.bigraphs.model.signatureBaseModel.SignatureBaseModelPackage#getBKindPlaceSorting_BContainedBy()
	 * @see org.bigraphs.model.signatureBaseModel.BKindPlaceSorting#getBCanContain
	 * @model opposite="bCanContain"
	 * @generated
	 */
	EList<BKindPlaceSorting> getBContainedBy();

	/**
	 * Returns the value of the '<em><b>BCan Contain</b></em>' reference list.
	 * The list contents are of type {@link org.bigraphs.model.signatureBaseModel.BKindPlaceSorting}.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.signatureBaseModel.BKindPlaceSorting#getBContainedBy <em>BContained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BCan Contain</em>' reference list.
	 * @see org.bigraphs.model.signatureBaseModel.SignatureBaseModelPackage#getBKindPlaceSorting_BCanContain()
	 * @see org.bigraphs.model.signatureBaseModel.BKindPlaceSorting#getBContainedBy
	 * @model opposite="bContainedBy"
	 * @generated
	 */
	EList<BKindPlaceSorting> getBCanContain();

} // BKindPlaceSorting
