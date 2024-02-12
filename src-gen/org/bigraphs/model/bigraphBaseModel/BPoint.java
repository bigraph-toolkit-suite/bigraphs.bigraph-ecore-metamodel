/**
 */
package org.bigraphs.model.bigraphBaseModel;

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
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.BPoint#getBLink <em>BLink</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBPoint()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface BPoint extends CDOObject {
	/**
	 * Returns the value of the '<em><b>BLink</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.bigraphBaseModel.BLink#getBPoints <em>BPoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BLink</em>' reference.
	 * @see #setBLink(BLink)
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBPoint_BLink()
	 * @see org.bigraphs.model.bigraphBaseModel.BLink#getBPoints
	 * @model opposite="bPoints"
	 * @generated
	 */
	BLink getBLink();

	/**
	 * Sets the value of the '{@link org.bigraphs.model.bigraphBaseModel.BPoint#getBLink <em>BLink</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BLink</em>' reference.
	 * @see #getBLink()
	 * @generated
	 */
	void setBLink(BLink value);

} // BPoint
