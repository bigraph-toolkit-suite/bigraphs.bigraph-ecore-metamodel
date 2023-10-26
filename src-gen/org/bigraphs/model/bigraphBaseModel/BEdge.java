/**
 */
package org.bigraphs.model.bigraphBaseModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BEdge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.BEdge#getBBigraph <em>BBigraph</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBEdge()
 * @model
 * @generated
 */
public interface BEdge extends BLink {
	/**
	 * Returns the value of the '<em><b>BBigraph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.bigraphBaseModel.BBigraph#getBEdges <em>BEdges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BBigraph</em>' container reference.
	 * @see #setBBigraph(BBigraph)
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBEdge_BBigraph()
	 * @see org.bigraphs.model.bigraphBaseModel.BBigraph#getBEdges
	 * @model opposite="bEdges" required="true" transient="false"
	 * @generated
	 */
	BBigraph getBBigraph();

	/**
	 * Sets the value of the '{@link org.bigraphs.model.bigraphBaseModel.BEdge#getBBigraph <em>BBigraph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BBigraph</em>' container reference.
	 * @see #getBBigraph()
	 * @generated
	 */
	void setBBigraph(BBigraph value);

} // BEdge
