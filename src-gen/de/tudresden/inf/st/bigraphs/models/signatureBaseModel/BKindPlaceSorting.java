/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel;

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
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBPlaceSorting <em>BPlace Sorting</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBContainedBy <em>BContained By</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBCanContain <em>BCan Contain</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBKindPlaceSorting()
 * @model abstract="true"
 * @generated
 */
public interface BKindPlaceSorting extends EObject {
	/**
	 * Returns the value of the '<em><b>BPlace Sorting</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSignature#getBKindPlaceSorts <em>BKind Place Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPlace Sorting</em>' container reference.
	 * @see #setBPlaceSorting(BKindSignature)
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBKindPlaceSorting_BPlaceSorting()
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSignature#getBKindPlaceSorts
	 * @model opposite="bKindPlaceSorts" required="true" transient="false"
	 * @generated
	 */
	BKindSignature getBPlaceSorting();

	/**
	 * Sets the value of the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBPlaceSorting <em>BPlace Sorting</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPlace Sorting</em>' container reference.
	 * @see #getBPlaceSorting()
	 * @generated
	 */
	void setBPlaceSorting(BKindSignature value);

	/**
	 * Returns the value of the '<em><b>BContained By</b></em>' reference list.
	 * The list contents are of type {@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting}.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBCanContain <em>BCan Contain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BContained By</em>' reference list.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBKindPlaceSorting_BContainedBy()
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBCanContain
	 * @model opposite="bCanContain"
	 * @generated
	 */
	EList<BKindPlaceSorting> getBContainedBy();

	/**
	 * Returns the value of the '<em><b>BCan Contain</b></em>' reference list.
	 * The list contents are of type {@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting}.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBContainedBy <em>BContained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BCan Contain</em>' reference list.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBKindPlaceSorting_BCanContain()
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBContainedBy
	 * @model opposite="bContainedBy"
	 * @generated
	 */
	EList<BKindPlaceSorting> getBCanContain();

} // BKindPlaceSorting
