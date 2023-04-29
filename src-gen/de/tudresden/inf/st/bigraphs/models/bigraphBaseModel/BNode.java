/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BNode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BNode#getBPorts <em>BPorts</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BNode#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBNode()
 * @model
 * @generated
 */
public interface BNode extends BPlace, NameableType {
	/**
	 * Returns the value of the '<em><b>BPorts</b></em>' containment reference list.
	 * The list contents are of type {@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPort}.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPort#getBNode <em>BNode</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPorts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPorts</em>' containment reference list.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBNode_BPorts()
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPort#getBNode
	 * @model opposite="bNode" containment="true"
	 * @generated
	 */
	EList<BPort> getBPorts();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Object},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' map.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBNode_Attributes()
	 * @model mapType="de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.EStringToEJavaObjectMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EJavaObject&gt;"
	 * @generated
	 */
	EMap<String, Object> getAttributes();

} // BNode
