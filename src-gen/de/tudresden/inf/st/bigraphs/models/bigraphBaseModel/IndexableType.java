/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indexable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.IndexableType#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getIndexableType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IndexableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getIndexableType_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.IndexableType#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

} // IndexableType
