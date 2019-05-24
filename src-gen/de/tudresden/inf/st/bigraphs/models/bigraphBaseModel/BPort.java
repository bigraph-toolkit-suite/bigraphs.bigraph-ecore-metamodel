/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPort#getBNode <em>BNode</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBPort()
 * @model
 * @generated
 */
public interface BPort extends BPoint, IndexableType {
	/**
	 * Returns the value of the '<em><b>BNode</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BNode#getBPorts <em>BPorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BNode</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BNode</em>' container reference.
	 * @see #setBNode(BNode)
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBPort_BNode()
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BNode#getBPorts
	 * @model opposite="bPorts" required="true" transient="false"
	 * @generated
	 */
	BNode getBNode();

	/**
	 * Sets the value of the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPort#getBNode <em>BNode</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BNode</em>' container reference.
	 * @see #getBNode()
	 * @generated
	 */
	void setBNode(BNode value);

} // BPort
