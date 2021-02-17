/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel;

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
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BSorting#getBControls <em>BControls</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBSorting()
 * @model abstract="true"
 * @generated
 */
public interface BSorting extends EObject {
	/**
	 * Returns the value of the '<em><b>BControls</b></em>' containment reference list.
	 * The list contents are of type {@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl}.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getBSig <em>BSig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BControls</em>' containment reference list.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBSorting_BControls()
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getBSig
	 * @model opposite="bSig" containment="true"
	 * @generated
	 */
	EList<BControl> getBControls();

} // BSorting
