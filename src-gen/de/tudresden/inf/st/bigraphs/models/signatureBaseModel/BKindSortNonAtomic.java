/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BKind Sort Non Atomic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortNonAtomic#getBKindSorts <em>BKind Sorts</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBKindSortNonAtomic()
 * @model abstract="true"
 * @generated
 */
public interface BKindSortNonAtomic extends BKindPlaceSortings {
	/**
	 * Returns the value of the '<em><b>BKind Sorts</b></em>' reference list.
	 * The list contents are of type {@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSortings}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BKind Sorts</em>' reference list.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBKindSortNonAtomic_BKindSorts()
	 * @model
	 * @generated
	 */
	EList<BKindPlaceSortings> getBKindSorts();

} // BKindSortNonAtomic
