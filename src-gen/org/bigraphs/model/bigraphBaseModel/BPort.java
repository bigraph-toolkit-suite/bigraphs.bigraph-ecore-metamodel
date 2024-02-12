/**
 */
package org.bigraphs.model.bigraphBaseModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.BPort#getBNode <em>BNode</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBPort()
 * @model
 * @generated
 */
public interface BPort extends BPoint, IndexableType {
	/**
	 * Returns the value of the '<em><b>BNode</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.bigraphBaseModel.BNode#getBPorts <em>BPorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BNode</em>' container reference.
	 * @see #setBNode(BNode)
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBPort_BNode()
	 * @see org.bigraphs.model.bigraphBaseModel.BNode#getBPorts
	 * @model opposite="bPorts" required="true" transient="false"
	 * @generated
	 */
	BNode getBNode();

	/**
	 * Sets the value of the '{@link org.bigraphs.model.bigraphBaseModel.BPort#getBNode <em>BNode</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BNode</em>' container reference.
	 * @see #getBNode()
	 * @generated
	 */
	void setBNode(BNode value);

} // BPort
