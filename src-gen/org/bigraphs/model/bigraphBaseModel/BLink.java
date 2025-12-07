/**
 */
package org.bigraphs.model.bigraphBaseModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BLink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.BLink#getBPoints <em>BPoints</em>}</li>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.BLink#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBLink()
 * @model abstract="true"
 * @generated
 */
public interface BLink extends NameableType {
	/**
	 * Returns the value of the '<em><b>BPoints</b></em>' reference list.
	 * The list contents are of type {@link org.bigraphs.model.bigraphBaseModel.BPoint}.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.bigraphBaseModel.BPoint#getBLink <em>BLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPoints</em>' reference list.
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBLink_BPoints()
	 * @see org.bigraphs.model.bigraphBaseModel.BPoint#getBLink
	 * @model opposite="bLink"
	 * @generated
	 */
	EList<BPoint> getBPoints();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Object},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' map.
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBLink_Attributes()
	 * @model mapType="org.bigraphs.model.bigraphBaseModel.EStringToEJavaObjectMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EJavaObject&gt;"
	 * @generated
	 */
	EMap<String, Object> getAttributes();

} // BLink
