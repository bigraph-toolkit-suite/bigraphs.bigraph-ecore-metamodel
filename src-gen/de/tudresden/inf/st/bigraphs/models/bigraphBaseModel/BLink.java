/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BLink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BLink#getBPoints <em>BPoints</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBLink()
 * @model abstract="true"
 * @generated
 */
public interface BLink extends NameableType {
	/**
	 * Returns the value of the '<em><b>BPoints</b></em>' reference list.
	 * The list contents are of type {@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPoint}.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPoint#getBLink <em>BLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPoints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPoints</em>' reference list.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBLink_BPoints()
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPoint#getBLink
	 * @model opposite="bLink"
	 * @generated
	 */
	EList<BPoint> getBPoints();

} // BLink
