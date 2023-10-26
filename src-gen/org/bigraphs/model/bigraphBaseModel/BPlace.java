/**
 */
package org.bigraphs.model.bigraphBaseModel;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPlace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.BPlace#getBChild <em>BChild</em>}</li>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.BPlace#getBPrnt <em>BPrnt</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBPlace()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface BPlace extends CDOObject {
	/**
	 * Returns the value of the '<em><b>BChild</b></em>' containment reference list.
	 * The list contents are of type {@link org.bigraphs.model.bigraphBaseModel.BPlace}.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.bigraphBaseModel.BPlace#getBPrnt <em>BPrnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BChild</em>' containment reference list.
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBPlace_BChild()
	 * @see org.bigraphs.model.bigraphBaseModel.BPlace#getBPrnt
	 * @model opposite="bPrnt" containment="true"
	 * @generated
	 */
	EList<BPlace> getBChild();

	/**
	 * Returns the value of the '<em><b>BPrnt</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.bigraphBaseModel.BPlace#getBChild <em>BChild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPrnt</em>' container reference.
	 * @see #setBPrnt(BPlace)
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBPlace_BPrnt()
	 * @see org.bigraphs.model.bigraphBaseModel.BPlace#getBChild
	 * @model opposite="bChild" transient="false"
	 * @generated
	 */
	BPlace getBPrnt();

	/**
	 * Sets the value of the '{@link org.bigraphs.model.bigraphBaseModel.BPlace#getBPrnt <em>BPrnt</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPrnt</em>' container reference.
	 * @see #getBPrnt()
	 * @generated
	 */
	void setBPrnt(BPlace value);

} // BPlace
