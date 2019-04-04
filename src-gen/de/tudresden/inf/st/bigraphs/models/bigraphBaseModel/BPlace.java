/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPlace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace#getBChild <em>BChild</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace#getBPrnt <em>BPrnt</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBPlace()
 * @model abstract="true"
 * @generated
 */
public interface BPlace extends EObject {
	/**
	 * Returns the value of the '<em><b>BChild</b></em>' containment reference list.
	 * The list contents are of type {@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace}.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace#getBPrnt <em>BPrnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BChild</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BChild</em>' containment reference list.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBPlace_BChild()
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace#getBPrnt
	 * @model opposite="bPrnt" containment="true"
	 * @generated
	 */
	EList<BPlace> getBChild();

	/**
	 * Returns the value of the '<em><b>BPrnt</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace#getBChild <em>BChild</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPrnt</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPrnt</em>' container reference.
	 * @see #setBPrnt(BPlace)
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBPlace_BPrnt()
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace#getBChild
	 * @model opposite="bChild" transient="false"
	 * @generated
	 */
	BPlace getBPrnt();

	/**
	 * Sets the value of the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace#getBPrnt <em>BPrnt</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPrnt</em>' container reference.
	 * @see #getBPrnt()
	 * @generated
	 */
	void setBPrnt(BPlace value);

} // BPlace
