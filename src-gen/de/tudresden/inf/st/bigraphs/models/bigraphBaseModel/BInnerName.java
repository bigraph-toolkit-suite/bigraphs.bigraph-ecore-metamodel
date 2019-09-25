/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BInner Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BInnerName#getBBigraph <em>BBigraph</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBInnerName()
 * @model
 * @generated
 */
public interface BInnerName extends BPoint, NameableType {
	/**
	 * Returns the value of the '<em><b>BBigraph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BBigraph#getBInnerNames <em>BInner Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BBigraph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BBigraph</em>' container reference.
	 * @see #setBBigraph(BBigraph)
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBInnerName_BBigraph()
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BBigraph#getBInnerNames
	 * @model opposite="bInnerNames" required="true" transient="false"
	 * @generated
	 */
	BBigraph getBBigraph();

	/**
	 * Sets the value of the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BInnerName#getBBigraph <em>BBigraph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BBigraph</em>' container reference.
	 * @see #getBBigraph()
	 * @generated
	 */
	void setBBigraph(BBigraph value);

} // BInnerName
