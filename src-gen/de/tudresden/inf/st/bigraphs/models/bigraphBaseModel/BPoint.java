/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPoint#getBLink <em>BLink</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBPoint()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface BPoint extends CDOObject {
	/**
	 * Returns the value of the '<em><b>BLink</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BLink#getBPoints <em>BPoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BLink</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BLink</em>' reference.
	 * @see #setBLink(BLink)
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBPoint_BLink()
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BLink#getBPoints
	 * @model opposite="bPoints" required="true"
	 * @generated
	 */
	BLink getBLink();

	/**
	 * Sets the value of the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPoint#getBLink <em>BLink</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BLink</em>' reference.
	 * @see #getBLink()
	 * @generated
	 */
	void setBLink(BLink value);

} // BPoint
